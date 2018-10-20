package For_Java.assignments.assignment5.checkout;

public class DessertShoppe {

    public static final float taxRate = (float) 0.065;
    public static final String nameOfStore = "M & M Dessert Shoppe";
    public static final int maximumWidth = 50;
    public static final int maximumSizeForItemName = 30;

    public static String cents2dollarsAndCents(int cents) {
        float dollar = (float) (cents / 100.00);
        String result = dollar+"";
        if(dollar < 1.0){
            return result.substring(1,result.length());
        }else{
            return result;
        }
    }
}
