package pro.sky.HomeworkShoppingCart.service;

import java.util.Collection;
import java.util.List;

public interface ShoppingCartService {
    List<Long> add(List<Long> itemsIds);

    Collection<Long> get();

}
