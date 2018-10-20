package For_Java.assignments.assignment5.checkout;

public abstract class DessertItem {

    private String name;

    public DessertItem() {

    }

    public DessertItem(String name) {
        this.name = name;
    }

    public final String getName() {
        return this.name;
    }

    public abstract int getCost();
}
