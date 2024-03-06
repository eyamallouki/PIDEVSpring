package tn.esprit.pithepowerplayers.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pithepowerplayers.entities.UnderComment;
import tn.esprit.pithepowerplayers.generic.IGenericServiceImp;
import tn.esprit.pithepowerplayers.repositories.CommentRepository;
import tn.esprit.pithepowerplayers.repositories.UnderCommentRepository;

@Service
@RequiredArgsConstructor
public class IUnderCommentServiceImp extends IGenericServiceImp<UnderComment,Integer> implements IUnderCommentService{
    private  final UnderCommentRepository underCommentRepository;
    private  final CommentRepository commentRepository;

   /* @Override
    public void assignUnderCommentToComment(Integer id_Comment, Integer id_UnderComment) {
        Comment comment = commentRepository.findById(id_Comment).orElse(null);
        UnderComment underComment= underCommentRepository.findById(id_UnderComment).orElse(null);
        if(comment!=null && underComment!=null){
            underComment.setComment(comment);
        }
        underCommentRepository.save(underComment);
    }*/
}
