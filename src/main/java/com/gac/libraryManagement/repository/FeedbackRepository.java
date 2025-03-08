package com.gac.libraryManagement.repository;

import com.gac.libraryManagement.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
    // Custom method to find feedback by book ID
    List<Feedback> findByBookId(int bookId);
}
