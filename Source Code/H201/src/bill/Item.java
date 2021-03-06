package bill;

/**
 *
 * @author NNPhuong
 */
public class Item {

    private String name;
    private double price;
    private double discount;

    public Item(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    
    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Price: " + price + " | Discount: " + discount;
    }
    
}
