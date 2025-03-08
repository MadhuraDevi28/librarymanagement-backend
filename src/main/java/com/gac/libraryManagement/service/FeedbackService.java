package com.gac.libraryManagement.service;

import com.gac.libraryManagement.entity.Feedback;

import java.util.List;
import java.util.Optional;

public interface FeedbackService {
    List<Feedback> getAllFeedback();
    Optional<Feedback> getFeedbackById(int id);
    List<Feedback> getFeedbackByBookId(int bookId);
    Feedback addFeedback(Feedback feedback);
    Feedback updateFeedback(int id, Feedback feedback);
    void deleteFeedback(int id);
}
