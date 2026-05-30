import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store store = new Store();

        // Sample Data
        store.addProduct(new Product(1, "Laptop", "Electronics", 50000));
        store.addProduct(new Product(2, "Shoes", "Fashion", 3000));

        store.addCoupon(new Coupon("SAVE10", 10, 1000, "Electronics"));
        store.addCoupon(new Coupon("FASHION20", 20, 2000, "Fashion"));

        int productIdCounter = 3;

        System.out.println("=== Welcome to GiftCart ===");

        while(true) {
            System.out.println("\n1. View Products");
            System.out.println("2. Buy Product");
            System.out.println("3. View Coupons");
            System.out.println("4. Add Product");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    store.displayProducts();
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    int pid = sc.nextInt();
                    Product p = store.getProduct(pid);

                    if(p == null) {
                        System.out.println("Invalid Product!");
                        break;
                    }

                    System.out.print("Enter Coupon Code (or NONE): ");
                    String code = sc.next();

                    double finalPrice = p.price;

                    if(!code.equalsIgnoreCase("NONE")) {
                        Coupon c = store.getCoupon(code);
                        if(c != null && c.isValid(p)) {
                            double discount = (p.price * c.discount)/100;
                            finalPrice -= discount;
                            System.out.println("Coupon Applied! Discount: " + discount);
                        } else {
                            System.out.println("Invalid Coupon!");
                        }
                    }

                    System.out.println("Final Price: " + finalPrice);

                    // ✅ Remove product after purchase
                    store.removeProduct(p);
                    System.out.println("Product purchased and removed from store!");

                    break;

                case 3:
                    store.displayCoupons();
                    break;

                case 4:
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    sc.nextLine();
                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    store.addProduct(new Product(productIdCounter++, name, category, price));
                    System.out.println("Product Added Successfully!");
                    break;

                case 5:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}