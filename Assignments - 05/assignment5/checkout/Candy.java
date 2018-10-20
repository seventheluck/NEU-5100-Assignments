package For_Java.assignments.assignment5.checkout;

public class Candy extends DessertItem {

    private float weight;

    public float getWeight() {
        return weight;
    }

    public float getPrice() {
        return price;
    }

    private float price;//cents per pound

    public Candy(String name, double weight, float price) {
        super(name);
        this.weight = (float) weight;
        this.price = price;
    }

    @Override
    public int getCost() {
        return Math.round(weight * price);
    }
}
