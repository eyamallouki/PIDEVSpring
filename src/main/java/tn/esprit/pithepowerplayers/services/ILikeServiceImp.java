package tn.esprit.pithepowerplayers.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.pithepowerplayers.entities.LikeP;
import tn.esprit.pithepowerplayers.entities.PostBlog;
import tn.esprit.pithepowerplayers.entities.User;
import tn.esprit.pithepowerplayers.generic.IGenericServiceImp;
import tn.esprit.pithepowerplayers.repositories.LikePRepository;
import tn.esprit.pithepowerplayers.repositories.PostBlogRepository;
import tn.esprit.pithepowerplayers.repositories.UserRepository;
@Service
@RequiredArgsConstructor
public class ILikeServiceImp  extends IGenericServiceImp<LikeP,Integer> implements ILikeService{
    private final PostBlogRepository postBlogRepository;
    private final UserRepository userRepository;
    private final LikePRepository likePRepository;

    @Override
    public Integer countByPostBlogIdpostBlog(Integer idpostBlog) {
        return likePRepository.countByPostBlogIdpostBlog(idpostBlog);
    }


}
