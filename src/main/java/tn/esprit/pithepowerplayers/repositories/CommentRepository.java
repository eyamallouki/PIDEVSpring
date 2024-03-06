package tn.esprit.pithepowerplayers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.pithepowerplayers.entities.Comment;
import tn.esprit.pithepowerplayers.entities.PostBlog;
import tn.esprit.pithepowerplayers.entities.User;

import java.util.List;
import java.util.Set;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    @Query("select c.postBlog from Comment c ")
    List<PostBlog> getPosts();
    Integer countByPostBlog(PostBlog postBlog);
}