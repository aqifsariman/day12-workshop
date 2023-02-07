package ibf2022.ssf.day12_workshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ibf2022.ssf.day12_workshop.model.Country;
import ibf2022.ssf.day12_workshop.service.CountryService;

@Controller
@RequestMapping("/countries")
public class CountryController {

    CountryService countryService;

    public CountryController() {
        countryService = new CountryService();
    }

    @GetMapping
    public @ResponseBody List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @PostMapping()
    public @ResponseBody Boolean createCountry(@RequestBody Country city) {
        return countryService.createCountry(city);
    }

    @GetMapping("/list")
    public String displayCountryList(Model model) {
        List<Country> countrylist = countryService.getAllCountries();
        model.addAttribute("countryList", countrylist);
        return "countryList";
    }
}
