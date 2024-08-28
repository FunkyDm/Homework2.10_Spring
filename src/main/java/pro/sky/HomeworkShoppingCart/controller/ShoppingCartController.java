package pro.sky.HomeworkShoppingCart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.HomeworkShoppingCart.model.ShoppingCart;
import pro.sky.HomeworkShoppingCart.service.impl.ShoppingCartServiceImpl;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class ShoppingCartController {
    private final ShoppingCartServiceImpl shoppingCartServiceImpl;

    public ShoppingCartController(ShoppingCartServiceImpl shoppingCartServiceImpl) {
        this.shoppingCartServiceImpl = shoppingCartServiceImpl;
    }

    @GetMapping("/add")
    public ShoppingCart add(@RequestParam(value = "id") List<Integer> itemsList){
        return shoppingCartServiceImpl.add(itemsList);
    }

    @GetMapping("/get")
    public Collection<Integer> get(){
        return shoppingCartServiceImpl.get();
    }

}
