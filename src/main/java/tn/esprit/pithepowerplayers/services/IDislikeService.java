package tn.esprit.pithepowerplayers.services;

import tn.esprit.pithepowerplayers.entities.Comment;
import tn.esprit.pithepowerplayers.entities.Dislike;
import tn.esprit.pithepowerplayers.generic.IGenericService;

public interface IDislikeService extends IGenericService<Dislike,Integer> {
    Integer countByPostBlogIdpostBlog(Integer idpostBlog);

}
