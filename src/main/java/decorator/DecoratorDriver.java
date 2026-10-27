package decorator;

public class DecoratorDriver {

    public static void main(String[] args) {

        FoodItem burger = new Cheese(new Burger());
        FoodItem fries = new Ketchup(new Fries());
        FoodItem hotDog = new Onions(new HotDog());

        Order order = new Order();

        order.addItem(burger);
        order.addItem(fries);
        order.addItem(hotDog);


        System.out.println("===== RESTAURANT ORDER =====");
        System.out.println("Burger + Cheese: $" + burger.getCost());
        System.out.println("Fries + Ketchup: $" + fries.getCost());
        System.out.println("HotDog + Onions: $" + hotDog.getCost());

        double total = order.getTotal();
        System.out.println("Subtotal: $" + total);

        LoyaltyStatus regular = new LoyaltyStatus("Regular");
        LoyaltyStatus silver = new LoyaltyStatus("Silver");
        LoyaltyStatus diamond = new LoyaltyStatus("Diamond");

        System.out.printf("Regular Total: $%.2f%n", regular.applyDiscount(total));
        System.out.printf("Silver Total: $%.2f%n", silver.applyDiscount(total));
        System.out.printf("Diamond Total: $%.2f%n", diamond.applyDiscount(total));

        FoodItem burgerWithTwoToppings = new Onions(new Cheese(new Burger()));
        System.out.println("Burger + Cheese + Onions: $" + burgerWithTwoToppings.getCost());
    }
}