package For_Java.assignments.assignment3.second;

public abstract class Moody {

    protected abstract void expressFeelings();

    public void queryMood() {
        if (this.getMood() == "sad") {
            System.out.println("I feel sad today!");
        } else if (this.getMood() == "happy") {
            System.out.println("I feel happy today!");
        }
    }

    public abstract String getMood();
}
