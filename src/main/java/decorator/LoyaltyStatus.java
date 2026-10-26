package decorator;

public class LoyaltyStatus {
    private String status;

    public LoyaltyStatus(String status){
        this.status = status;
    }

    public double applyDiscount(double total){
        return 0.0;
    }

}
