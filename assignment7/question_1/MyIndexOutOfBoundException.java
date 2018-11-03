package assignments.assignment7.question_1;

public class MyIndexOutOfBoundException extends IndexOutOfBoundsException {
    private int lowerBound;
    private int upperBound;
    private int index;

    public MyIndexOutOfBoundException(int lowerBound, int upperBound, int index) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.index = index;
    }

    public String toString() {
        return "Error Message: Index: " + index + ", but Lower bound: " + lowerBound + ", Upper bound: " + upperBound;
    }
}
