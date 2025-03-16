package com.gac.libraryManagement.controller;

import com.gac.libraryManagement.entity.UserBooksHistory;
import com.gac.libraryManagement.service.UserBooksHistoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserBooksHistoryController {

    private final UserBooksHistoryService historyService;

    public UserBooksHistoryController(UserBooksHistoryService historyService) {
        this.historyService = historyService;
    }

    @GetMapping("/borrow-and-return")
    public ResponseEntity<List<UserBooksHistory>> getUserBooksHistory(@RequestParam int userid) {
        return ResponseEntity.ok(historyService.getHistoryByUserId(userid));
    }

    @PostMapping("/borrow-and-return/create")
    public  ResponseEntity<UserBooksHistory> crateUserBookHistory(@RequestBody UserBooksHistory userBooksHistory){
        return ResponseEntity.ok(historyService.saveHistory(userBooksHistory));

    }
}
