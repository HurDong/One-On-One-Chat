package com.example.demo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

import com.example.demo.service.KafkaProducer;

@Controller
public class ChatController {
	private final KafkaProducer kafkaProducer;

	public ChatController(KafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}

	@MessageMapping("/sendMessage")
	public void sendMessage(String message) {
		kafkaProducer.sendMessage("chat-messages", message);
	}
}
