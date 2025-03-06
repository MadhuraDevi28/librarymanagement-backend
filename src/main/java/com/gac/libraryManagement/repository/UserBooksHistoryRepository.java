package com.gac.libraryManagement.repository;

import com.gac.libraryManagement.entity.UserBooksHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserBooksHistoryRepository extends JpaRepository<UserBooksHistory, Long> {
    List<UserBooksHistory> findByUserId(int userId);
}

