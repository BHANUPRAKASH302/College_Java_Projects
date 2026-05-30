
public class Coupon {
    String code;
    double discount;
    double minAmount;
    String category;

    public Coupon(String code, double discount, double minAmount, String category) {
        this.code = code;
        this.discount = discount;
        this.minAmount = minAmount;
        this.category = category;
    }

    public boolean isValid(Product p) {
        return p.price >= minAmount && p.category.equalsIgnoreCase(category);
    }
}