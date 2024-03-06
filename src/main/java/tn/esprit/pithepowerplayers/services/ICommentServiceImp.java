package tn.esprit.pithepowerplayers.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pithepowerplayers.entities.Comment;
import tn.esprit.pithepowerplayers.entities.PostBlog;
import tn.esprit.pithepowerplayers.entities.User;
import tn.esprit.pithepowerplayers.generic.IGenericServiceImp;
import tn.esprit.pithepowerplayers.repositories.CommentRepository;
import tn.esprit.pithepowerplayers.repositories.PostBlogRepository;
import tn.esprit.pithepowerplayers.repositories.UserRepository;

import java.io.IOException;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ICommentServiceImp extends IGenericServiceImp<Comment,Integer> implements ICommentService{
    private final CommentRepository commentRepository;
    private final PostBlogRepository postBlogRepository;
    private final UserRepository userRepository;
    @Override
    public Comment addComment(Comment c, Integer iduser, Integer idpostBlog) {
        try {
            if (BadWords.verfiyWord(c.getContent())) {
                return null;
            }
        } catch (IOException var6) {
            var6.printStackTrace();
        }

        User user = userRepository.findById(iduser).orElse(null);
        PostBlog post = postBlogRepository.findById(idpostBlog).orElse(null);
        user.getComment().add(c);
        c.setPostBlog(post);
        return commentRepository.save(c);
    }

    @Override
    public PostBlog mostCommentedPost() {
        List<PostBlog> posts = commentRepository.getPosts();
        return (PostBlog) posts.stream().max((c1, c2) -> {
            return this.commentRepository.countByPostBlog(c1) - this.commentRepository.countByPostBlog(c2);
        }).orElse(null);
    }

    @Override
    public int getNbComment(Integer idpostBlog) {
        PostBlog postBlog = postBlogRepository.findById(idpostBlog).orElse(null);
        return postBlog != null ? this.commentRepository.countByPostBlog(postBlog) : 0; //:0 siggnifie retourner 0 si ce poste n'a aucun comment
    }



}
