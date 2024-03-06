package tn.esprit.pithepowerplayers.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.pithepowerplayers.entities.ChatRoom;
import tn.esprit.pithepowerplayers.generic.GenericController;
import tn.esprit.pithepowerplayers.services.IChatService;

@RestController
@AllArgsConstructor
@RequestMapping("/chat1")
public class ChatController extends GenericController<ChatRoom,Integer> {
    private final IChatService serviceChat;
}
