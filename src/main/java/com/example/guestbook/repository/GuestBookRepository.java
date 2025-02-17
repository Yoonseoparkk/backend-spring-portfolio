package com.example.guestbook.repository;

import com.example.guestbook.entity.GuestBookMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestBookRepository extends JpaRepository<GuestBookMessage, Long> {
}