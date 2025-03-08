package com.gac.libraryManagement.service;

import com.gac.libraryManagement.entity.Books;
import com.gac.libraryManagement.entity.Feedback;
import com.gac.libraryManagement.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
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

    public Optional<Feedback> getFeedbackByBookId(int bookId) {
        return feedbackRepository.findById(bookId);
    }

    public Feedback addFeedback(Feedback feedback) {
       return feedbackRepository.save(feedback);
    }

    public Feedback updateFeedback(int id, Feedback feedback) {
        Optional<Feedback> existingFeedback = feedbackRepository.findById(id);
        if (existingFeedback.isPresent()) {
            return feedbackRepository.save(feedback);
        } else {
            return null;
        }
    }

    public void deleteFeedback(int id) {
       feedbackRepository.deleteById(id);
    }
}
