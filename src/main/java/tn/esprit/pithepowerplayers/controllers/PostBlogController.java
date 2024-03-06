package tn.esprit.pithepowerplayers.controllers;

import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pithepowerplayers.entities.*;
import tn.esprit.pithepowerplayers.generic.GenericController;
import tn.esprit.pithepowerplayers.services.IPostBlogService;

import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/PostBlog")
public class PostBlogController extends GenericController<PostBlog,Integer> {
    private final IPostBlogService iPostBlogService;
    @PutMapping("/addAndAssignPostBlogToUser/{id_User}")
    public void addAndAssignPostBlogToUser(@RequestBody PostBlog p,
                                     @PathVariable Integer id_User) {
        iPostBlogService.addAndAssignPostBlogToUser(p,id_User);
    }
    @GetMapping("/chercher/{category}")
    public List<PostBlog> findByCategoryOrderByPublishedDateDesc(@PathVariable Category category){
        return iPostBlogService.findByCategoryOrderByPublishedDateDesc(category);
    }
    @GetMapping("/chercher2/{username}")
    public List<PostBlog> findByUserUserNameOrderByPublishedDateDesc(@PathVariable String username){
        return iPostBlogService.findByUserUserNameOrderByPublishedDateDesc(username);
    }
    @PostMapping("/like/{id_User}/{idpostBlog}")
    public LikeP addAndAssignLikeToPostAndUser(@RequestBody LikeP l, @PathVariable Integer id_User, @PathVariable Integer idpostBlog){
        return iPostBlogService.addAndAssignLikeToPostAndUser(l,id_User,idpostBlog);
    }
    @PostMapping("/dislike/{id_User}/{idpostBlog}")
    public Dislike addAndAssignDislikeToPostAndUser(@RequestBody Dislike d, @PathVariable Integer id_User, @PathVariable Integer idpostBlog){
        return iPostBlogService.addAndAssignDislikeToPostAndUser(d,id_User,idpostBlog);
    }
    @GetMapping("/nbrPostByUser/{id_User}")
    public int nbrPostByUser(@PathVariable Integer id_User){
        return iPostBlogService.nbrPostByUser(id_User);
    }
}

