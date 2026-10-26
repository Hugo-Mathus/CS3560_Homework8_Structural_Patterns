package decorator;

public class Onions extends ToppingDecorator{
    public Onions(FoodItem foodItem) {
        super(foodItem);
    }
    @Override
    public double getCost() {
        return foodItem.getCost() + 0.50;
    }
}
