package com.example.guestbook.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
public class GuestBookMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String content;
    private String date;

    public GuestBookMessage() {
        this.date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public GuestBookMessage(String name, String content) {
        this.name = name;
        this.content = content;
        this.date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    // Getter & Setter
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getContent() { return content; }
    public String getDate() { return date; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setContent(String content) { this.content = content; }
}