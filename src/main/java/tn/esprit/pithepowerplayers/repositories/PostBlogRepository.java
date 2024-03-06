package tn.esprit.pithepowerplayers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.pithepowerplayers.entities.Category;
import tn.esprit.pithepowerplayers.entities.PostBlog;

import java.util.List;

public interface PostBlogRepository extends JpaRepository<PostBlog, Integer> {

    //Integer countByUserid_User(Integer id_User);

    @Query("SELECT COUNT(p) FROM PostBlog p WHERE p.user.id_User = :id_User")
    Integer countPostBlogByUseridUser(@Param("id_User") Integer id_User);
    List<PostBlog> findByCategoryOrderByPublishedDateDesc(Category category);
    List<PostBlog> findByUserUserNameOrderByPublishedDateDesc(String username);




}