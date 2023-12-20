package com.dev.delta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Message;
import com.dev.delta.repositories.MessageRepository;

@Service
public class MessageService {

	@Autowired
	private MessageRepository messageRepository;

	/**
	 * getFoods
	 * 
	 * @return
	 */
	public List<Message> getMessages() {
		return messageRepository.findAll();
	}

	public void addMessage(Message message) {
		System.out.println(message.toString());
		messageRepository.save(message);

	}

	public Message findById(Long id) {
		return messageRepository.getById(id);
	}
}
