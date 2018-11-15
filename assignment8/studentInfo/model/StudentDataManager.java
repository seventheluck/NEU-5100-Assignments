package For_Java.assignments.assignment8.studentInfo.model;

import For_Java.assignments.assignment3.first.Student;
import For_Java.assignments.assignment8.studentInfo.Setting;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDataManager {

    private String filePath;
    private String fileName;

    public StudentDataManager() {
        this.filePath = Setting.FILE_PATH;
        this.fileName = Setting.FILE_NAME;
    }

    public List<StudentEntity> queryStudentInfo() {

        List<StudentEntity> result = new ArrayList<StudentEntity>();
        if (!checkFile())
            return result;
        File file = new File(this.filePath + this.fileName);
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] fileByte = new byte[fis.available()];
            fis.read(fileByte);
            String wholeStudents = new String(fileByte);
            if ("".equals(wholeStudents))
                return result;
            String[] students = wholeStudents.split("\n");
            for (int i = 0; i < students.length; i++) {
                String[] information = students[i].split("\\|");
                StudentEntity studentEntity = new StudentEntity();
                studentEntity.setId(information[0]);
                studentEntity.setName(information[1]);
                studentEntity.setGender(information[2]);
                studentEntity.setPhoneNumber(information[3]);
                studentEntity.setAge(Integer.valueOf(information[4]));
                studentEntity.setAddress(information[5]);
                result.add(studentEntity);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }


    /**
     * @param studentEntity
     * @return -3: close file fail
     * -2: write file fail
     * -1: create file fail
     * 1: success
     * 2: duplicate
     */
    public int insertStudentInfo(StudentEntity studentEntity) {
        if (!checkFile())
            return -1;
        File file = new File(this.filePath + this.fileName);
        List<StudentEntity> studentList = queryStudentInfo();
        for (int i = 0; i < studentList.size(); i++) {
            StudentEntity oneStudent = studentList.get(i);
            if (oneStudent.getId().equals(studentEntity.getId())) {
                return 2;
            }
        }
        String preStr = "";
        if (studentList.size() != 0) {
            preStr = "\n";
        }
        String studentInfo = preStr + studentEntity.getId() + "|"
                + studentEntity.getName() + "|"
                + studentEntity.getGender() + "|"
                + studentEntity.getPhoneNumber() + "|"
                + studentEntity.getAge() + "|"
                + studentEntity.getAddress();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file, true);
            fos.write(studentInfo.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            return -2;
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
                return -3;
            }
        }
        return 1;
    }

    public boolean deleteStudentInfo(String id) {
        return true;

    }

    public boolean updateStudentInfo(String id) {
        return true;

    }

    private boolean checkFile() {
        File file = new File(this.filePath + this.fileName);
        File folder = new File(this.filePath);
        if (file.exists()) {
            return true;
        } else {
            try {
                if (!folder.exists() && !folder.isDirectory()) {
                    folder.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
            return true;
        }
    }
}
