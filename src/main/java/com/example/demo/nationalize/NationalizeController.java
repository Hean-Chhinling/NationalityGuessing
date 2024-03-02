package com.example.demo.nationalize;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NationalizeController {

    private final NationalizeClient client = NationalizeClient.newInstance();

    @GetMapping("/")
    public String getNationalityForm(){
        return "nationalityForm";
    }

    @GetMapping("/nationality")
    public String getNationality(@RequestParam(name = "name") String name, Model model){
        var nationality = client.getNationality(name);
        model.addAttribute("nationality", nationality);
        return "nationalityResult";
    }
}
