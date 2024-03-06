package tn.esprit.pithepowerplayers.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.pithepowerplayers.entities.Dislike;
import tn.esprit.pithepowerplayers.entities.LikeP;
import tn.esprit.pithepowerplayers.generic.GenericController;
import tn.esprit.pithepowerplayers.services.IDislikeService;
import tn.esprit.pithepowerplayers.services.ILikeService;

@RestController
@AllArgsConstructor
@RequestMapping("/Dislike")
public class DislikeController extends GenericController<Dislike,Integer> {
    private final IDislikeService iDislikeService;
    @GetMapping("/nbrDislike/{idpostBlog}")
    public Integer countByPostBlogId_postBlog(@PathVariable Integer idpostBlog) {
        return iDislikeService.countByPostBlogIdpostBlog(idpostBlog);
    }

}
