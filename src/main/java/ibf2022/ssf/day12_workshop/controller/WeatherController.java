package ibf2022.ssf.day12_workshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/weather")
public class WeatherController {

    @GetMapping
    public String weather(@RequestParam(required = true) String city,
            @RequestParam(name = "units", defaultValue = "kilometers") String units, Model model) {
        model.addAttribute("city", city);
        model.addAttribute("units", units);
        return "weather";
    }

    @GetMapping("{country}")
    public String weather2(@PathVariable(name = "country", required = true) String city,
            @RequestParam(name = "units", defaultValue = "kilometers") String units, Model model) {
        model.addAttribute("city", city);
        model.addAttribute("units", units);
        return "weather";
    }

}
