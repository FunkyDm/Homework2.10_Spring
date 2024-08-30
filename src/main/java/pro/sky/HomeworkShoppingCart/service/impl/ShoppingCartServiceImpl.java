package pro.sky.HomeworkShoppingCart.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.HomeworkShoppingCart.model.ShoppingCart;
import pro.sky.HomeworkShoppingCart.service.ShoppingCartService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    private final ShoppingCart shoppingCart;

    public ShoppingCartServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public List<Long> add(List<Long> itemsIds) {
        return shoppingCart.addItemsToCart(itemsIds);
    }

    @Override
    public Collection<Long> get() {
        return shoppingCart.getItemsFromCart();
    }

}
