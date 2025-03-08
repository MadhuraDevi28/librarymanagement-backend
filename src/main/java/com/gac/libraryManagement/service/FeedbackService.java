package com.gac.libraryManagement.service;

import com.gac.libraryManagement.entity.Feedback;
import com.gac.libraryManagement.repository.BooksRepository;
import com.gac.libraryManagement.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class FeedbackService {
    @Autowired
    private final FeedbackRepository feedbackRepository;

    public FeedbackService(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }

    public Optional<Feedback> getFeedbackById(int id) {
        return feedbackRepository.findById(id);
    }

    public List<Feedback> getFeedbackByBookId(int bookId) {
        return feed;
    }

    public Feedback addFeedback(Feedback feedback) {
        return null;
    }

    public Feedback updateFeedback(int id, Feedback feedback) {
        return null;
    }

    public void deleteFeedback(int id) {

    }
}
