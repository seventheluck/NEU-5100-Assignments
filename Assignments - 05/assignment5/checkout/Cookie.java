package For_Java.assignments.assignment5.checkout;

public class Cookie extends DessertItem {

    public int getNumber() {
        return number;
    }

    public float getPrice() {
        return price;
    }

    private int number;
    private float price;//price per dozen

    public Cookie(String name, int number, float price) {
        super(name);
        this.number = number;
        this.price = price;
    }

    @Override
    public int getCost() {
        return Math.round((price / 12) * number);
    }
}
