package ibf2022.ssf.day12_workshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibf2022.ssf.day12_workshop.model.Item;
import ibf2022.ssf.day12_workshop.repository.ItemRepo;

@Service
public class ItemService {

    @Autowired
    ItemRepo ItemRepo;

    public List<Item> retrieveItemList() {
        return ItemRepo.getCartItems();
    }
}
