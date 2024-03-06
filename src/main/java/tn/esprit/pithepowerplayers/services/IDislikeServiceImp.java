package tn.esprit.pithepowerplayers.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pithepowerplayers.entities.Comment;
import tn.esprit.pithepowerplayers.entities.Dislike;
import tn.esprit.pithepowerplayers.generic.IGenericServiceImp;
import tn.esprit.pithepowerplayers.repositories.DislikeRepository;

@Service
@RequiredArgsConstructor
public class IDislikeServiceImp extends IGenericServiceImp<Dislike,Integer>  implements IDislikeService{
    private final DislikeRepository dislikeRepository;
    @Override
    public Integer countByPostBlogIdpostBlog(Integer idpostBlog) {
       return dislikeRepository.countByPostBlogIdpostBlog(idpostBlog);
    }
}
