package tn.esprit.pithepowerplayers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pithepowerplayers.entities.LikeP;

public interface LikePRepository extends JpaRepository<LikeP, Integer> {
Integer countByPostBlogIdpostBlog(Integer idpostBlog);
}