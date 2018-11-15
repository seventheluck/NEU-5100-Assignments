package For_Java.assignments.assignment8.studentInfo.controller;

import For_Java.assignments.assignment8.studentInfo.model.StudentDataManager;
import For_Java.assignments.assignment8.studentInfo.model.StudentEntity;
import For_Java.assignments.assignment8.studentInfo.view.StudentInfoView;

import java.util.List;

public class StudentInfoManager {

    StudentDataManager studentDataManager;


    public StudentInfoManager() {
        this.studentDataManager = new StudentDataManager();
    }

    public List<StudentEntity> queryStudentInfo() {
        List<StudentEntity> studentList = studentDataManager.queryStudentInfo();
        return studentList;
    }

    public int insertStudentInfo(StudentEntity studentEntity) {
        int result = studentDataManager.insertStudentInfo(studentEntity);
        return result;
    }
}
