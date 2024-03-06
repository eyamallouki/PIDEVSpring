package tn.esprit.pithepowerplayers.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pithepowerplayers.entities.Comment;
import tn.esprit.pithepowerplayers.entities.PostBlog;
import tn.esprit.pithepowerplayers.entities.User;
import tn.esprit.pithepowerplayers.generic.GenericController;
import tn.esprit.pithepowerplayers.repositories.CommentRepository;
import tn.esprit.pithepowerplayers.services.ICommentService;
import tn.esprit.pithepowerplayers.services.IPostBlogService;

@RestController
@AllArgsConstructor
@RequestMapping("/Comment")
public class CommentController extends GenericController<Comment,Integer> {
    private final ICommentService iCommentService;
    private final CommentRepository commentRepository;

    @PostMapping({"/{id_User}/add/{idpostBlog}"})
    @ResponseBody
    public Comment addComment(@RequestBody Comment c,
                              @PathVariable Integer id_User, @PathVariable Integer idpostBlog) {
        return iCommentService.addComment(c, id_User, idpostBlog);
    }
    @GetMapping("/topCommentedPost")
    @ResponseBody
    public PostBlog mostCommentedPost() {
        return this.iCommentService.mostCommentedPost();
    }

    @GetMapping("NbCommentsPerPost/{idpostBlog}")
    public int getNbComment(@PathVariable Integer idpostBlog) {

        return iCommentService.getNbComment(idpostBlog);
    }


}
