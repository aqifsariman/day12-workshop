package ibf2022.ssf.day12_workshop.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ibf2022.ssf.day12_workshop.model.Item;
import ibf2022.ssf.day12_workshop.service.ItemService;

@Controller
@RequestMapping("/shoppingcart")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping(produces = "text/html")
    public String displayCart(Model model) {
        List<Item> items = itemService.retrieveItemList();
        model.addAttribute("cartItems", items);
        return "cart";
    }

    @GetMapping({ "{itemname}" })
    public String filteredCart(@PathVariable(name = "itemname") String itemName, Model model) {
        List<Item> items = itemService.retrieveItemList();
        List<Item> foundItem = items.stream().filter(item -> item.getItemName().equalsIgnoreCase(itemName))
                .collect(Collectors.toList());
        model.addAttribute("cartItems", foundItem);
        return "cart";
    }

}
