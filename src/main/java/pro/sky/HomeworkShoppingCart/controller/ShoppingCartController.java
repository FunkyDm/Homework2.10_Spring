package pro.sky.HomeworkShoppingCart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.HomeworkShoppingCart.service.ShoppingCartService;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartServiceImpl;

    public ShoppingCartController(ShoppingCartService shoppingCartServiceImpl) {
        this.shoppingCartServiceImpl = shoppingCartServiceImpl;
    }

    @GetMapping("/add")
    public List<Long> add(@RequestParam(value = "id") List<Long> itemsIds) {
        return shoppingCartServiceImpl.add(itemsIds);
    }

    @GetMapping("/get")
    public Collection<Long> get() {
        return shoppingCartServiceImpl.get();
    }

}
