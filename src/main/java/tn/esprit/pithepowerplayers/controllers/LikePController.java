package tn.esprit.pithepowerplayers.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pithepowerplayers.entities.Comment;
import tn.esprit.pithepowerplayers.entities.LikeP;
import tn.esprit.pithepowerplayers.generic.GenericController;
import tn.esprit.pithepowerplayers.services.ILikeService;

@RestController
@AllArgsConstructor
@RequestMapping("/LikeP")
public class LikePController  extends GenericController<LikeP,Integer> {
    private final ILikeService iLikeService;

    @GetMapping("/nbrLike/{idpostBlog}")
    public Integer countByPostBlogId_postBlog(@PathVariable Integer idpostBlog) {
        return iLikeService.countByPostBlogIdpostBlog(idpostBlog);
    }

}
