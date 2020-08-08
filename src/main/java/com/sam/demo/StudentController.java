package com.sam.demo;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller
public class StudentController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/")
    public String showForm(StudentForm studentForm) {
        return "form";
    }

    @PostMapping("/")
    public String checkStudentInfo(@Valid StudentForm studentForm, BindingResult bindingResult)
    {
        if (bindingResult.hasErrors()) {
            return "form";
        }
        return "redirect:/results";
    }
}
