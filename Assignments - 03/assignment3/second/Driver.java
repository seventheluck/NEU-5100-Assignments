package For_Java.assignments.assignment3.second;

public class Driver {

    public static void main(String[] args){
        Psychiatrist psychiatrist = new Psychiatrist();
        Happy happy = new Happy();
        Sad sad = new Sad();
        psychiatrist.examine(happy);
        psychiatrist.observe(happy);
        psychiatrist.examine(sad);
        psychiatrist.observe(sad);
    }
}
