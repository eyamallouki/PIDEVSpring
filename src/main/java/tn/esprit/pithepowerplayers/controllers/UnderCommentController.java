package tn.esprit.pithepowerplayers.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.pithepowerplayers.entities.UnderComment;
import tn.esprit.pithepowerplayers.generic.GenericController;
import tn.esprit.pithepowerplayers.services.IPostBlogService;
import tn.esprit.pithepowerplayers.services.IUnderCommentService;

@RestController
@AllArgsConstructor
@RequestMapping("/UnderComment")
public class UnderCommentController extends GenericController<UnderComment,Integer> {
    private final IUnderCommentService iUnderCommentService;
    private final IPostBlogService iPostBlogService;

   /* @PutMapping("/assignCommentToPost/{id_Comment}/{id_UnderComment}")
    void assignUnderCommentToComment (@PathVariable Integer id_Comment,
                                      @PathVariable Integer id_UnderComment){
        iUnderCommentService.assignUnderCommentToComment(id_Comment,id_UnderComment);
    }*/

    /*@PostMapping("/{id_UnderComment}/like")
    public void likeUnderComment( int id_PostBlog, int id_Comment, @PathVariable int id_UnderComment) {
        iPostBlogService.like(id_PostBlog, id_Comment,id_UnderComment);
    }
    @PostMapping("/{id_UnderComment}/dislike")
    public void dislikeUnderComment(int id_PostBlog, int id_Comment,@PathVariable int id_UnderComment) {
        iPostBlogService.like(id_PostBlog, id_Comment,id_UnderComment);
    }*/

}
