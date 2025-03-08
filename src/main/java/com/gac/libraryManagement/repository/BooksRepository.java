package com.gac.libraryManagement.repository;

import com.gac.libraryManagement.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {
    // Custom query methods can be added here if needed
}
