package tn.esprit.pithepowerplayers.services;

import tn.esprit.pithepowerplayers.entities.Comment;
import tn.esprit.pithepowerplayers.entities.PostBlog;
import tn.esprit.pithepowerplayers.entities.User;
import tn.esprit.pithepowerplayers.generic.IGenericService;

public interface ICommentService extends IGenericService<Comment,Integer> {
    Comment addComment(Comment var1, Integer var2, Integer var3);
    PostBlog mostCommentedPost();
    int getNbComment(Integer idpostBlog);

}
