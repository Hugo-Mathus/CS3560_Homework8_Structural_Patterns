package decorator;

public class Cheese extends ToppingDecorator {
    public Cheese(FoodItem foodItem) {
        super(foodItem);
    }
    @Override
    public double getCost(){
        return foodItem.getCost() + 1.0;
    }
}
