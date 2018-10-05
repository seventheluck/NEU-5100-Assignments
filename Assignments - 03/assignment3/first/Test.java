package For_Java.assignments.assignment3.first;

public class Test {

    public static void main(String[] args) {
        Student john = new Student("John", "0001");
        Student lucy = new Student("Lucy", "0002");
        Student mike = new Student("Mike", "0003");
        Student petter = new Student("Petter", "0004");
        Student lily = new Student("Lily", "0005");
        Student micheal = new Student("Micheal", "0006");
        Student wang = new Student("Wang", "0007");
        Student lee = new Student("Lee", "0008");
        Student bush = new Student("Bush", "0009");
        Student kate = new Student("Kate", "0010");
        Student stone = new Student("Stone", "0011");

        Course course_Java = new Course("Java");
        Course course_Network = new Course("Network");
        Course course_Algorithm = new Course("Algorithm");

        course_Java.registerStudent(john);
        course_Java.registerStudent(lucy);
        System.out.println(course_Java.isFull());


        course_Java.registerStudent(mike);
        course_Java.registerStudent(petter);
        course_Java.registerStudent(lily);
        course_Java.registerStudent(micheal);
        course_Java.registerStudent(wang);
        course_Java.registerStudent(lee);
        course_Java.registerStudent(bush);
        System.out.println(course_Java.isFull());


        course_Java.registerStudent(kate);
        System.out.println(course_Java.isFull());


        course_Java.registerStudent(stone);
        System.out.println(course_Java.isFull());
        showStudents(course_Java);


        course_Network.registerStudent(stone);
        showStudents(course_Network);


        course_Algorithm.registerStudent(stone);
        showStudents(course_Algorithm);


    }

    public static void showStudents(Course course) {
        int number = course.getNumberOfStudent();
        Student[] students = course.getStudents();
        if (number == 0) {
            System.out.println("No students choose this course!");
        } else {
            for (int i = 0; i < number; i++) {
                System.out.print(students[i].getName() + " : " + students[i].getId() + "  ");
            }

            System.out.println("");
        }
    }
}
