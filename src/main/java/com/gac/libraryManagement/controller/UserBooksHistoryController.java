package com.gac.libraryManagement.controller;

import com.gac.libraryManagement.entity.UserBooksHistory;
import com.gac.libraryManagement.entity.UserDetails;
import com.gac.libraryManagement.service.UserBooksHistoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserBooksHistoryController {
private final UserBooksHistoryService history;

    public UserBooksHistoryController(UserBooksHistoryService history) {
        this.history = history;
    }

    @GetMapping("/borrow-and-return")
    public ResponseEntity<List<UserBooksHistory>> getUserBooksHistory(@RequestParam String userid) {
        return ResponseEntity.ok(history.gethistory(userid));
    }
}
