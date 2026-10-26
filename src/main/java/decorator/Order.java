package decorator;

import java.util.ArrayList;
import java.util.List;

public class Order {

    public List<FoodItem> items =  new ArrayList<>();
    public void addItem(FoodItem item){

    }

    public double getTotal(){
        return 0.0;
    }

}
