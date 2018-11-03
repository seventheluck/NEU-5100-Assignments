package assignments.assignment7.question_1;

public class TestException {

    private int[] arr;

    public TestException(int length) {
        this.arr = new int[length];
    }

    public int getNum(int index) throws MyIndexOutOfBoundException {
        int result = 0;
        try {
            result = arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new MyIndexOutOfBoundException(0, this.arr.length - 1, index);
        }
        return result;
    }
}
