package com.gac.libraryManagement.service;

import com.gac.libraryManagement.entity.UserDetails;
import com.gac.libraryManagement.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsService {
    private final UserRepository userRepository;

    public UserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDetails> getAllUserDetails() {
        return userRepository.findAll();
    }

    public UserDetails registerNewUser(UserDetails userDetails) {
        UserDetails existingUserDetail = userRepository.findByEmailId(userDetails.getEmailId());
        if (existingUserDetail == null) {
            return userRepository.save(userDetails);
        } else {
            return existingUserDetail;
        }

    }

    public UserDetails login(UserDetails userDetails) {

        UserDetails existingUserDetails = userRepository.findByEmailIdAndPassword(userDetails.getEmailId(), userDetails.getPassword());
        if (existingUserDetails != null) {
            return existingUserDetails;
        } else {
            return null;
        }
    }
}
