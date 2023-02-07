package ibf2022.ssf.day12_workshop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/workshop")
public class WorkshopController {

    @GetMapping()
    public String workshop() {
        return "workshop";
    }

    @PostMapping("/process-number")
    public String processNumber(@RequestParam(name = "inputNumber", defaultValue = "1") Integer unit, Model model) {

        List<Integer> listIntegers = new ArrayList<>();
        Integer loopValue = unit;
        Integer currentValue = 1;
        while (currentValue <= loopValue) {
            int result = (int) (Math.random() * loopValue) + 1;

            if (!listIntegers.contains(Integer.valueOf(result))) {
                listIntegers.add(Integer.valueOf(result));
                currentValue++;
            }
        }
        model.addAttribute("numbers", listIntegers);

        return "workshopresult";
    }

}
