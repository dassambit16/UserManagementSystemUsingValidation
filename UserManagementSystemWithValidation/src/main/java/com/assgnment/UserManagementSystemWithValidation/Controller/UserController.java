package com.assgnment.UserManagementSystemWithValidation.Controller;

import com.assgnment.UserManagementSystemWithValidation.Model.User;
import com.assgnment.UserManagementSystemWithValidation.Service.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("users")
    public String addUsers(@RequestBody @Valid List<User> user) {
        return userService.addUsers(user);
    }

    @GetMapping("users/id/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @GetMapping("users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }


    @PutMapping("User/id/{id}")
    public String updateUserById(@PathVariable Long id, @RequestParam Long phoneNumber){
        return userService.updateUserById(id,phoneNumber);
    }

    @DeleteMapping("user/id/{id}")
    public String removeUserById(@PathVariable Long id) {
        return userService.removeUserById(id);
    }

}
