package com.resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showForm() {
        return "form"; // Loads form.html
    }

    @PostMapping("/generate-resume")
    public String generateResume(@RequestParam String name,
                                 @RequestParam String email,
                                 @RequestParam String skills,
                                 @RequestParam String experience,
                                 @RequestParam String education,
                                 Model model) {

        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("skills", skills);
        model.addAttribute("experience", experience);
        model.addAttribute("education", education);

        return "resume"; // Loads resume.html (to be created next)
    }
}
