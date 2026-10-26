package decorator;

import java.util.ArrayList;
import java.util.List;

public class Order {

    public List<FoodItem> items =  new ArrayList<>();
    public void addItem(FoodItem item){
        items.add(item);
    }

    public double getTotal(){
        double total = 0.0;
        for (FoodItem item:items){
            total = total + item.getCost();
        }
        return total;
    }

}
