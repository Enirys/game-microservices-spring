package com.user.userservice.web;

import com.user.userservice.entities.User;
import com.user.userservice.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestController
public class UsersController {

    private UserRepository userRepository;

    public UsersController(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @GetMapping(path = "/users")
    public List<User> getUsers()
    {
        return userRepository.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User getUserById(@PathVariable Long id)
    {
        return userRepository.findById(id).get();
    }

    @GetMapping(path = "/users/ranked")
    public List<User> getUsersRanked()
    {
        List<User> users = userRepository.findAll();
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                return user1.getRank().compareTo(user2.getRank());
            }
        });
        return users;
    }

    @PostMapping(path = "/users")
    public void createUser(@RequestBody User user)
    {
        userRepository.save(user);
    }

    @PutMapping (path = "/users/{id}")
    public User updateUserById(@PathVariable Long id, @RequestBody User user)
    {
        user.setId(id);
        return userRepository.save(user);
    }

    @DeleteMapping(path = "/users/{id}")
    public void deleteUserById(@PathVariable Long id)
    {
        userRepository.deleteById(id);
    }

}
