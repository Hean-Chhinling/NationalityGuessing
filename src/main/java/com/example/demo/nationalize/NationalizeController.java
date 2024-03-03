package com.example.demo.nationalize;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.stream.Collectors;

@Controller
public class NationalizeController {

    private final NationalizeClient client = NationalizeClient.newInstance();
    private final CountryService countryService;

    public NationalizeController(CountryService countryService){
        this.countryService = countryService;
    }

    @GetMapping("/")
    public String getNationalityForm(){
        return "nationalityForm";
    }

    @GetMapping("/nationality")
    public String getNationality(@RequestParam(name = "name") String name, Model model){
        var nationality = client.getNationality(name);
        var countriesWithFullNames = nationality.countries().stream()
                        .map(country -> new Nationality.Country(countryService.getCountryName(country.countryId()), country.probability()))
                                .collect(Collectors.toList());
        model.addAttribute("nationality", new Nationality(nationality.count(), nationality.name(), countriesWithFullNames));
        return "nationalityResult";
    }
}
