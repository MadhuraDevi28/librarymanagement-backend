package com.gac.libraryManagement.service;

import com.gac.libraryManagement.entity.UserBooksHistory;
import com.gac.libraryManagement.repository.UserBooksHistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBooksHistoryService {
    public  final UserBooksHistoryRepository history;

    public UserBooksHistoryService(UserBooksHistoryRepository history) {
        this.history = history;
    }

    public List<UserBooksHistory> gethistory(String userid) {

            return history.findByUserId(Integer.parseInt(userid));

    }
}
