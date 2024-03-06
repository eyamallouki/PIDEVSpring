package tn.esprit.pithepowerplayers.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import tn.esprit.pithepowerplayers.entities.ChatRoom;
import tn.esprit.pithepowerplayers.entities.Message;
import tn.esprit.pithepowerplayers.entities.Monitoring;
import tn.esprit.pithepowerplayers.entities.User;
import tn.esprit.pithepowerplayers.generic.GenericController;
import tn.esprit.pithepowerplayers.services.IMessageService;
import tn.esprit.pithepowerplayers.services.IMonitoringService;
import tn.esprit.pithepowerplayers.storage.UserStorage;

@RestController
@AllArgsConstructor
@RequestMapping("/message")
public class MessageController extends GenericController<Message,Integer> {
   private final IMessageService messageService;

   @PostMapping("/addmessage/{user}/{user1}/{chatroom_id}")
   public Message addandassignmessagetostudent(@PathVariable Integer user,@RequestBody Message msg,@PathVariable Integer user1,@PathVariable Integer chatroom_id){
      return messageService.addandassignmessagetostudent(user,msg,user1,chatroom_id);
   }

}
