package pro.sky.HomeworkShoppingCart.service;

import pro.sky.HomeworkShoppingCart.model.ShoppingCart;

import java.util.Collection;
import java.util.List;

public interface ShoppingCartService {
    ShoppingCart add(List<Integer> itemsList);

    Collection<Integer> get();

}
