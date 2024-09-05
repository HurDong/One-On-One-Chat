package com.example.demo.controller;

import com.example.demo.service.ChatRoomService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chat")
public class ChatRoomController {
    private static ChatRoomService chatRoomService;

    @PostMapping("/create")
    public ResponseEntity<?> createChatRoom(@RequestParam Long user1Id, @RequestParam Long user2Id) {
        return ResponseEntity.ok(chatRoomService.createChatRoom(user1Id, user2Id));
    }
}
