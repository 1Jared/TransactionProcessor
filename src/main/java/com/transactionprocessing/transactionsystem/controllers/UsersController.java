package com.transactionprocessing.transactionsystem.controllers;

import ch.qos.logback.core.model.Model;
import com.transactionprocessing.transactionsystem.entity.Users;
import com.transactionprocessing.transactionsystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UsersController {
    @Autowired
    private UserRepository userRepo;

    @GetMapping("/students")
    public String listAll(Model model) {
        List<Users> listUsers = userRepo.findAll();

        return "students";
    }
}
