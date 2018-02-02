package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import javax.validation.Valid;

@Controller
public class HomeController {



    @GetMapping("/addresume")
    public String loadFormpage(Model model){
        model.addAttribute("resume", new RoboResume());
        return "resumeform";
    }
    @PostMapping("/resumeform")
        public String loadFrompage(@Valid @ModelAttribute("resume") RoboResume resume, Model model){
            model.addAttribute("resume", resume);
            return "showresume";
        }

}
