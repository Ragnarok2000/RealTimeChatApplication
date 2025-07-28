package com.chat.chatApp.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chat.chatApp.Model.ChatMessage;

@Controller
@RequestMapping("/fb")
public class ChatController {
	
	
	@MessageMapping("/sendMessage")
	@SendTo("/topic/message")
	public ChatMessage chatMessage(ChatMessage message) {
		
		return message;
	}
	
	@GetMapping("/chat")
	public String chatPage() {
		
		return "chat";
	}
	
	

}
