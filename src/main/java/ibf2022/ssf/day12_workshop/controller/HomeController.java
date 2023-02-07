package ibf2022.ssf.day12_workshop.controller;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = { "/home", "/index", "/" })
public class HomeController {

    @GetMapping()
    public String home(Model model) {
        Calendar calendar = Calendar.getInstance();
        model.addAttribute("currentHour", calendar.get(Calendar.HOUR_OF_DAY));
        model.addAttribute("currentTime", new Date().toString());
        return "index";
    }
}
