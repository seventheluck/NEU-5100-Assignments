package For_Java.assignments.assignment3.first;

public class Course {


    private String title;
    private int numberOfStudent;


    private Student[] students;

    public Course(String title) {
        this.title = title;
        this.numberOfStudent = 0;
        this.students = new Student[10];
    }

    public boolean isFull() {
        if (this.numberOfStudent < 10) {
            return false;
        } else {
            return true;
        }
    }

    public void registerStudent(Student student) {
        if (this.numberOfStudent < 10) {
            this.students[this.numberOfStudent] = student;
            this.numberOfStudent++;
            System.out.println("Congratulations, "+student.getName()+", your "+ this.title+" course register successful!");
        } else {
            System.out.println("I'm sorry, "+ student.getName()+", your register fail! " + "course " + this.title + " is full!");
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }
}
