package com.example.demo.Service;

import com.example.demo.Repository.UserRepository;
import com.example.demo.User.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /*
   User service saveUser
    */
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    /*
   User service getUser
    */
    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    /*
    User service getAllUsers
     */
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


}
