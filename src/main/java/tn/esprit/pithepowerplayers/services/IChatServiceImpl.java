package tn.esprit.pithepowerplayers.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pithepowerplayers.entities.ChatRoom;
import tn.esprit.pithepowerplayers.generic.IGenericServiceImp;
import tn.esprit.pithepowerplayers.repositories.ChatRepository;
import tn.esprit.pithepowerplayers.repositories.MessageRepository;

@Service
@RequiredArgsConstructor
public class IChatServiceImpl extends IGenericServiceImp<ChatRoom,Integer> implements IChatService{
    private final ChatRepository chatrepository;
    private final MessageRepository messagerepository;
}
