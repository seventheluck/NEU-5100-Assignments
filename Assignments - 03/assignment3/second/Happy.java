package For_Java.assignments.assignment3.second;

public class Happy extends Moody {
    private String mood;

    @Override
    public void expressFeelings() {
        System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");
    }

    @Override
    public String getMood() {
        return this.mood;
    }

    public Happy() {
        this.mood = "happy";
    }

    public String toString() {
        return "Subject laughs a lot";
    }
}