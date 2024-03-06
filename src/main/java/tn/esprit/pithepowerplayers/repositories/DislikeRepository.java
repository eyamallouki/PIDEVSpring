package tn.esprit.pithepowerplayers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pithepowerplayers.entities.Dislike;

public interface DislikeRepository extends JpaRepository<Dislike, Integer> {
    Integer countByPostBlogIdpostBlog(Integer idpostBlog);

}