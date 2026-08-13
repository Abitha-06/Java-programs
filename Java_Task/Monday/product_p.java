package Java_Task.Monday;
class Product {

    int productId;
    String productName;
    double price;
    int quantity;

    void setDetails(int id, String name, double p, int q) {
        productId = id;
        productName = name;
        price = p;
        quantity = q;
    }

    double calculateTotal() {
        return price * quantity;
    }

    double applyDiscount(double discountPercent) {
        return calculateTotal() * discountPercent / 100;
    }

    void display() {

        System.out.println("-----------------------------");
        System.out.println("Product ID    : " + productId);
        System.out.println("Product Name  : " + productName);
        System.out.println("Price         : " + price);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Product Total : " + calculateTotal());
    }
}

public class product_p {

    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();
        Product p5 = new Product();

        p1.setDetails(101, "Laptop", 50000, 1);
        p2.setDetails(102, "Mouse", 1000, 2);
        p3.setDetails(103, "Keyboard", 2000, 1);
        p4.setDetails(104, "Monitor", 15000, 2);
        p5.setDetails(105, "Headphone", 3000, 3);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();

        double subtotal =
                p1.calculateTotal()
                + p2.calculateTotal()
                + p3.calculateTotal()
                + p4.calculateTotal()
                + p5.calculateTotal();

        double discount =
                p1.applyDiscount(10)
                + p2.applyDiscount(10)
                + p3.applyDiscount(10)
                + p4.applyDiscount(10)
                + p5.applyDiscount(10);

        double amountAfterDiscount = subtotal - discount;

        double gst = amountAfterDiscount * 18 / 100;

        double finalAmount = amountAfterDiscount + gst;

        Product expensive = p1;

        if (p2.price > expensive.price)
            expensive = p2;
        if (p3.price > expensive.price)
            expensive = p3;
        if (p4.price > expensive.price)
            expensive = p4;
        if (p5.price > expensive.price)
            expensive = p5;

        Product cheapest = p1;

        if (p2.price < cheapest.price)
            cheapest = p2;
        if (p3.price < cheapest.price)
            cheapest = p3;
        if (p4.price < cheapest.price)
            cheapest = p4;
        if (p5.price < cheapest.price)
            cheapest = p5;

        Product highestQuantity = p1;

        if (p2.quantity > highestQuantity.quantity)
            highestQuantity = p2;
        if (p3.quantity > highestQuantity.quantity)
            highestQuantity = p3;
        if (p4.quantity > highestQuantity.quantity)
            highestQuantity = p4;
        if (p5.quantity > highestQuantity.quantity)
            highestQuantity = p5;

        int totalItems =
                p1.quantity + p2.quantity + p3.quantity
                + p4.quantity + p5.quantity;

        System.out.println("\n========== BILL ==========");

        System.out.println("Subtotal       : " + subtotal);
        System.out.println("Discount (10%) : " + discount);
        System.out.println("GST (18%)      : " + gst);
        System.out.println("Final Amount   : " + finalAmount);

        System.out.println("\nMost Expensive : "
                + expensive.productName);

        System.out.println("Cheapest       : "
                + cheapest.productName);

        System.out.println("Highest Quantity: "
                + highestQuantity.productName);

        System.out.println("Total Items    : " + totalItems);
    }
}