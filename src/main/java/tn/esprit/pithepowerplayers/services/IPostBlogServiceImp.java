package tn.esprit.pithepowerplayers.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.pithepowerplayers.entities.*;
import tn.esprit.pithepowerplayers.generic.IGenericServiceImp;
import tn.esprit.pithepowerplayers.repositories.*;

import java.util.List;


@Service
@RequiredArgsConstructor
public class IPostBlogServiceImp extends IGenericServiceImp<PostBlog,Integer> implements IPostBlogService {
    private final PostBlogRepository postBlogRepository;
    private final CommentRepository commentRepository;
    private final UserRepository userRepository;
    private final UnderCommentRepository underCommentRepository;
    private final LikePRepository likePRepository;
    private final DislikeRepository dislikeRepository;


    @Override
    public void addAndAssignPostBlogToUser(PostBlog p, Integer id_User) {
        PostBlog postBlog = postBlogRepository.save(p);
        User user = userRepository.findById(id_User).orElse(null);
        if (user != null ) {
            postBlog.setUser(user);
        }
        postBlogRepository.save(postBlog);
    }
    @Override
    public List<PostBlog> findByUserUserNameOrderByPublishedDateDesc(String username ) {
        return postBlogRepository.findByUserUserNameOrderByPublishedDateDesc(username);
    }
    @Override
    public List<PostBlog> findByCategoryOrderByPublishedDateDesc(Category category) {
        return postBlogRepository.findByCategoryOrderByPublishedDateDesc(category);
    }

    @Transactional
    @Override
    public LikeP addAndAssignLikeToPostAndUser(LikeP l, Integer id_User, Integer idpostBlog) {
        User user = userRepository.findById(id_User).orElse(null);
        PostBlog postBlog = postBlogRepository.findById(idpostBlog).orElse(null);

        if (user != null && postBlog != null) {
            if (user.getDislike() == null && user.getLikeP()==null ){
                LikeP like1 = likePRepository.save(l);
                like1.setPostBlog(postBlog);
                user.setLikeP(l);
            } else if (user.getDislike() != null) {
                user.setDislike(null);
                LikeP likeP = likePRepository.save(l);
                likeP.setPostBlog(postBlog);
                user.setLikeP(l);
            }
        }
        return null;
    }

    @Transactional
    @Override
    public Dislike addAndAssignDislikeToPostAndUser(Dislike d, Integer id_User, Integer idpostBlog) {
        User user = userRepository.findById(id_User).orElse(null);
        PostBlog postBlog = postBlogRepository.findById(idpostBlog).orElse(null);

        if (user != null && postBlog != null) {
            if (user.getDislike() == null && user.getLikeP()==null ){
                Dislike dislike = dislikeRepository.save(d);
                dislike.setPostBlog(postBlog);
                user.setDislike(d);
            } else if (user.getLikeP() != null) {
                user.setLikeP(null);
                Dislike dislike = dislikeRepository.save(d);
                dislike.setPostBlog(postBlog);
                user.setDislike(d);
            }
        }
        return null;
    }
    @Override
    public int nbrPostByUser(Integer id_User) {
        return postBlogRepository.countPostBlogByUseridUser(id_User);
    }



}
