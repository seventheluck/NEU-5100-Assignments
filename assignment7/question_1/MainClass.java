package assignments.assignment7.question_1;

public class MainClass {
    public static void main(String[] args) {
        TestException testException = new TestException(10);
        int result = 0;
        try {
            result = testException.getNum(10);
        } catch (MyIndexOutOfBoundException exception) {
            System.out.print(exception);
        }
        System.out.print(result);
    }
}
