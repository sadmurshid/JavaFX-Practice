/**
 * Created by Murshid on 7/12/2017.
 */
public class product {
    private String name;
    private double price;
    private int quantity;


    public product()
    {
        this.name="";
        this.price=0.0;
        this.quantity=0;

    }

    public product(String name, double price, int quantity)
    {
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
