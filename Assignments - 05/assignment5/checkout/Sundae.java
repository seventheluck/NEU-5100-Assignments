package For_Java.assignments.assignment5.checkout;

public class Sundae extends IceCream {


    public Sundae(String name, float cost, String toppingName, float toppingCost) {
        super(toppingName + " with " + name, cost + toppingCost);
    }
}
