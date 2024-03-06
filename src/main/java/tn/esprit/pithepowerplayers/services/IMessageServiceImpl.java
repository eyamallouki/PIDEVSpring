package tn.esprit.pithepowerplayers.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pithepowerplayers.entities.ChatRoom;
import tn.esprit.pithepowerplayers.entities.Message;
import tn.esprit.pithepowerplayers.entities.RoleType;
import tn.esprit.pithepowerplayers.entities.User;
import tn.esprit.pithepowerplayers.generic.IGenericServiceImp;
import tn.esprit.pithepowerplayers.repositories.ChatRepository;
import tn.esprit.pithepowerplayers.repositories.MessageRepository;
import tn.esprit.pithepowerplayers.repositories.UserRepository;

@Service
@RequiredArgsConstructor
public class IMessageServiceImpl extends IGenericServiceImp<Message,Integer> implements IMessageService{
    private final MessageRepository messagerepository;
    private final UserRepository userRepository;
    private final ChatRepository chatRepository;

    @Override
    public Message addandassignmessagetostudent(Integer user_id,Message msg,Integer user1_id,Integer chatroom_id) {
        User user= userRepository.findById(user_id).orElse(null);
        User user1=userRepository.findById(user1_id).orElse(null);
        ChatRoom chatRoom=chatRepository.findById(chatroom_id).orElse(null);
        if(user.getRole().getRoleType()== RoleType.Student && user.isStudentSelected() && user1.isStudentSelected() && user1.getRole().getRoleType()==RoleType.Student){
            msg.setFrom(user);
            msg.setTo(user1);
            msg.setChatRoom(chatRoom);
            messagerepository.save(msg);
        }
        return null;
    }


}
