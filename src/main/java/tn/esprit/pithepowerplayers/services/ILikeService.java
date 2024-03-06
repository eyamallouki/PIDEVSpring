package tn.esprit.pithepowerplayers.services;

import tn.esprit.pithepowerplayers.entities.LikeP;
import tn.esprit.pithepowerplayers.generic.IGenericService;

public interface ILikeService extends IGenericService<LikeP,Integer> {
    Integer countByPostBlogIdpostBlog(Integer idpostBlog);

}
