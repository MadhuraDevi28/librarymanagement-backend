package com.gac.libraryManagement.service;

import com.gac.libraryManagement.entity.UserBooksHistory;
import com.gac.libraryManagement.repository.UserBooksHistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserBooksHistoryService {

    private final UserBooksHistoryRepository userBooksHistoryRepository;

    public UserBooksHistoryService(UserBooksHistoryRepository userBooksHistoryRepository) {
        this.userBooksHistoryRepository = userBooksHistoryRepository;
    }

    // Get all UserBooksHistory records
    public List<UserBooksHistory> getAllHistory() {
        return userBooksHistoryRepository.findAll();
    }

    // Get UserBooksHistory by userId
    public List<UserBooksHistory> getHistoryByUserId(int userId) {
        return userBooksHistoryRepository.findByUserId(userId);
    }

    // Create or update UserBooksHistory
    public UserBooksHistory saveHistory(UserBooksHistory userBooksHistory) {
        return userBooksHistoryRepository.save(userBooksHistory);
    }

    // Get a UserBooksHistory by ID
    public Optional<UserBooksHistory> getHistoryById(Long id) {
        return userBooksHistoryRepository.findById(id);
    }

    // Delete UserBooksHistory by ID
    public void deleteHistory(Long id) {
        userBooksHistoryRepository.deleteById(id);
    }
}
