package com.assgnment.UserManagementSystemWithValidation.Service;

import com.assgnment.UserManagementSystemWithValidation.Model.User;
import com.assgnment.UserManagementSystemWithValidation.Repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;


    public String addUsers(List<User> users) {
        userRepo.saveAll(users);
        return users.size() + " users are added";
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepo.findAll();
    }

    public User getUserById(Long id) {
        return userRepo.findById(id).get();
    }


    public String removeUserById(Long id) {
        userRepo.deleteById(id);
        return "removed";
    }

    public String updateUserById(Long id, Long phoneNumber) {
        User presentUser = userRepo.findById(id).orElse(null);
        if(presentUser != null)
        {
            presentUser.setPhoneNumber(phoneNumber);
            userRepo.save(presentUser);
            return "price updated!!";
        }
        else {
            return "stock not found!";
        }
    }
}
