package decorator;

public class LoyaltyStatus {
    private String status;

    public LoyaltyStatus(String status){
        this.status = status;
    }

    public double applyDiscount(double total){
        switch (status){
            case "Silver":
                return total*0.95;
            case "Diamond":
                return total*0.90;
            default:
                return total;
        }
    }
}
