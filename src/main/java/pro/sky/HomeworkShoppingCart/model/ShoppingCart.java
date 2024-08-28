package pro.sky.HomeworkShoppingCart.model;

import java.util.List;
import java.util.Objects;

public class ShoppingCart {
    private final List<Integer> itemsIdList;

    public ShoppingCart(List<Integer> itemsIdList) {
        this.itemsIdList = itemsIdList;
    }

    public List<Integer> getItemsIdList() {
        return itemsIdList;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "itemsIdList=" + itemsIdList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCart that = (ShoppingCart) o;
        return Objects.equals(itemsIdList, that.itemsIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(itemsIdList);
    }
}
