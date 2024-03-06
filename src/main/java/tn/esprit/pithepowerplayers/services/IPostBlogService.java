package tn.esprit.pithepowerplayers.services;

import tn.esprit.pithepowerplayers.entities.Category;
import tn.esprit.pithepowerplayers.entities.Dislike;
import tn.esprit.pithepowerplayers.entities.LikeP;
import tn.esprit.pithepowerplayers.entities.PostBlog;
import tn.esprit.pithepowerplayers.generic.IGenericService;
import tn.esprit.pithepowerplayers.repositories.DislikeRepository;

import java.util.List;

public interface IPostBlogService extends IGenericService<PostBlog,Integer> {
    void addAndAssignPostBlogToUser (PostBlog p, Integer id_User);
    List<PostBlog> findByCategoryOrderByPublishedDateDesc(Category category);
    List<PostBlog> findByUserUserNameOrderByPublishedDateDesc(String username);
    int nbrPostByUser(Integer id_User);
    LikeP addAndAssignLikeToPostAndUser(LikeP l, Integer id_User, Integer idpostBlog);
    Dislike addAndAssignDislikeToPostAndUser(Dislike d, Integer id_User, Integer idpostBlog);

}
