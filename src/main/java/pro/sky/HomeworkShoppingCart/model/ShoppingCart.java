package pro.sky.HomeworkShoppingCart.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Component
@SessionScope
public class ShoppingCart {
    private final List<Long> itemsList;

    public ShoppingCart(List<Long> itemsList) {
        this.itemsList = itemsList;
    }

    public List<Long> getItemsList() {
        return itemsList;
    }

    public List<Long> addItemsToCart(List<Long> items){
        itemsList.addAll(items);
        return itemsList;
    }

    public Collection<Long> getItemsFromCart(){
        return Collections.unmodifiableCollection(itemsList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCart that = (ShoppingCart) o;
        return Objects.equals(itemsList, that.itemsList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(itemsList);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "itemsList=" + itemsList +
                '}';
    }

}

