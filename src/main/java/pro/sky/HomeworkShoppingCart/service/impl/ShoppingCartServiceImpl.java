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
    private final List<Integer> productList = new ArrayList<>();

    @Override
    public ShoppingCart add(List<Integer> itemsList) {
        ShoppingCart shoppingCart = new ShoppingCart(itemsList);
        productList.addAll(itemsList);
        return shoppingCart;
    }

    @Override
    public Collection<Integer> get() {
        return Collections.unmodifiableCollection(productList);
    }

}
