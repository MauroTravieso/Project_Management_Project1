package org.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.system.model.User;
import org.system.services.TaskService;
import org.system.services.UserService;

import java.security.Principal;

@Controller
public class ProfileController {

    @Autowired
    private TaskService taskService;

    @Autowired
    private UserService userService;


    @GetMapping("/profile")
    public String showProfilePage(Model model, Principal principal) {

        String email = principal.getName();
        User user = userService.findOne(email);

        // Using the model to pass the List<Task> to the view
        model.addAttribute("tasks", taskService.findUserTask(user));

        return "views/profile";

    }

}
