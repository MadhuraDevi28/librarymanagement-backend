package com.gac.libraryManagement.repository;

import com.gac.libraryManagement.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long> {

    UserDetails findByEmailId(String emailId);

    UserDetails findByEmailIdAndPassword(String emailId, String password);
}
