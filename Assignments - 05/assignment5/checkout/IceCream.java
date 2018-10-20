package For_Java.assignments.assignment5.checkout;

public class IceCream extends DessertItem {

    private float cost;

    public IceCream(String name, float cost) {
        super(name);
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return Math.round(this.cost);
    }
}
