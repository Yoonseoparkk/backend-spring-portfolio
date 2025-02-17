package com.example.guestbook.controller;

import com.example.guestbook.entity.GuestBookMessage;
import com.example.guestbook.repository.GuestBookRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/api/guestbook")
@CrossOrigin(origins = "http://localhost:3000") // CORS 허용
public class GuestBookController {

    @Autowired
    private GuestBookRepository guestBookRepository;

    // 📌 1️⃣ 모든 메시지 조회 (GET)
    @GetMapping
    public List<GuestBookMessage> getAllMessages() {
        return guestBookRepository.findAll();
    }

    // 📌 2️⃣ 새 메시지 추가 (POST)
    @PostMapping
    public GuestBookMessage addMessage(@RequestBody GuestBookMessage message) {
        return guestBookRepository.save(message);
    }
}
