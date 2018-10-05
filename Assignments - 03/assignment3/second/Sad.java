package For_Java.assignments.assignment3.second;

public class Sad extends Moody {
    private String mood;

    @Override
    public void expressFeelings() {
        System.out.println("'wah''boo hoo''weep''sob''weep'");
    }

    @Override
    public String getMood() {
        return this.mood;
    }

    public Sad() {
        this.mood = "sad";
    }

    public String toString() {
        return "Subject cries a lot";
    }
}
