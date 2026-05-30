import java.util.*;

public class Store {

    List<Product> products = new ArrayList<>();
    List<Coupon> coupons = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void addCoupon(Coupon c) {
        coupons.add(c);
    }

    public void displayProducts() {
        for(Product p : products) {
            System.out.println(p.id + " | " + p.name + " | " + p.category + " | " + p.price);
        }
    }

    public void displayCoupons() {
        for(Coupon c : coupons) {
            System.out.println(c.code + " | " + c.discount + "% | Min: " + c.minAmount + " | Category: " + c.category);
        }
    }

    public Product getProduct(int id) {
        for(Product p : products) {
            if(p.id == id) return p;
        }
        return null;
    }

    public Coupon getCoupon(String code) {
        for(Coupon c : coupons) {
            if(c.code.equalsIgnoreCase(code)) return c;
        }
        return null;
    }

    public void removeProduct(Product p) {
        products.remove(p);
    }
}