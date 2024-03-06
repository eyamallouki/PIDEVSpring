package tn.esprit.pithepowerplayers.services;

import tn.esprit.pithepowerplayers.entities.ChatRoom;
import tn.esprit.pithepowerplayers.entities.Message;
import tn.esprit.pithepowerplayers.entities.Monitoring;
import tn.esprit.pithepowerplayers.entities.User;
import tn.esprit.pithepowerplayers.generic.IGenericService;

public interface IMessageService extends IGenericService<Message,Integer> {
    public Message addandassignmessagetostudent(Integer user_id,Message msg,Integer user1_id,Integer chatroom_id);

}
