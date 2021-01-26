package com.kruehl.springsecurity.demo.controller;

import com.kruehl.springsecurity.demo.dto.UserDTO;
import com.kruehl.springsecurity.demo.entity.User;
import com.kruehl.springsecurity.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/register")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping("/showRegistrationForm")
    public String showMyLoginPage(Model model){
        model.addAttribute("userDTO", new UserDTO());
        return "registration";
    }

    @PostMapping("/processRegistrationForm")
    public String processRegistrationForm(
            @Valid @ModelAttribute("userDTO") UserDTO userDTO,
            BindingResult bindingResult,
            Model model
    ){

        String userName = userDTO.getUserName();
        // form validation
        if(bindingResult.hasErrors()){
            return "registration";
        }

        // check the database if user already exists
        User existing = userService.findByUserName(userName);
        if(existing!=null){
            model.addAttribute("userDTO", new UserDTO());
            model.addAttribute("registrationError", "Username already exists");

            return "registration";

        }

        // save user in the database
        userService.save(userDTO);

        return "registration-confirmation";
    }
}
