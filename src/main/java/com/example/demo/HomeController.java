package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/songform")
    public String loadFormPage(Model model) {
        Song song = new Song();
        song.setAlbum("Default album");
        song.setRating(3);
        model.addAttribute("song", song);
        return "songform";
    }

    @PostMapping("/songform")
    public String loadFormPage(@ModelAttribute Song song, Model model) {
        model.addAttribute("song", song);
        return "confirmsong";
    }

}
