package com.example.demo.Controller;
import com.example.demo.Service.UserService;
import com.example.demo.User.User;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
User controller
 */
@RestController
@RequestMapping("/v1/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/greet")
    public String greet() {
        return "Everything is running great";
    }

    @PostMapping("/save")
    public User save(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/getUser")
    public Optional<User> getUser(@PathVariable Long id) {
        return userService.getUser(id);

    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }




}
