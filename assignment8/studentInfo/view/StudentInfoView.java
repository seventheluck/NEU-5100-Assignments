package For_Java.assignments.assignment8.studentInfo.view;

import For_Java.assignments.assignment8.studentInfo.Setting;
import For_Java.assignments.assignment8.studentInfo.controller.StudentInfoManager;
import For_Java.assignments.assignment8.studentInfo.model.StudentEntity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class StudentInfoView {

    private JTextField[] textFields;
    private JLabel[] labels;
    private JFrame jFrame;
    private JTable jTable;
    private JScrollPane jScrollPane;
    private StudentTableModel studentTableModel;
    private StudentInfoManager studentInfoManager;
    private JButton add;
    private JButton query;
    private JPanel buttonPanel;
    private SpringLayout springLayout;
    private List<StudentEntity> studentList;

    public StudentInfoView() {
        this.labels = new JLabel[Setting.COLUMN_NAMES.length];
        this.textFields = new JTextField[Setting.COLUMN_NAMES.length];
        this.studentInfoManager = new StudentInfoManager();
        this.add = new JButton("ADD");
        this.query = new JButton("Query");
        this.jFrame = new JFrame();
        this.studentList = queryList();
        this.studentTableModel = new StudentTableModel(studentList);
        this.jTable = new JTable(studentTableModel);
        this.jScrollPane = new JScrollPane(jTable);
        this.buttonPanel = new JPanel();
        this.springLayout = new SpringLayout();
        creatComponents(studentList);
        setLayout();
        display();
        addBehavior();
    }

    private void addBehavior() {
        AddActionListener al = new AddActionListener();
        QueryActionListener ql = new QueryActionListener();
        add.addActionListener(al);
        query.addActionListener(ql);
    }

    private void setLayout() {
        this.buttonPanel.setLayout(this.springLayout);
    }

    private void creatComponents(List<StudentEntity> list) {

        Container jFrameContainer = jFrame.getContentPane();


        for (int i = 0; i < Setting.COLUMN_NAMES.length; i++) {
            labels[i] = new JLabel(Setting.COLUMN_NAMES[i]);
            textFields[i] = new JTextField("", 24);
            buttonPanel.add(labels[i]);
            buttonPanel.add(textFields[i]);
        }


        buttonPanel.add(add);
        buttonPanel.add(query);
        jFrameContainer.add(jScrollPane, BorderLayout.NORTH);
        jFrameContainer.add(buttonPanel);


        for (int i = 0; i < labels.length; i++) {
            springLayout.putConstraint(SpringLayout.NORTH, labels[i], 25 * (i + 1), SpringLayout.NORTH, buttonPanel);
            springLayout.putConstraint(SpringLayout.WEST, labels[i], 50, SpringLayout.WEST, buttonPanel);
            springLayout.putConstraint(SpringLayout.NORTH, textFields[i], 25 * (i + 1), SpringLayout.NORTH, buttonPanel);
            springLayout.putConstraint(SpringLayout.WEST, textFields[i], 150, SpringLayout.WEST, buttonPanel);
        }
        springLayout.putConstraint(SpringLayout.NORTH, add, 25 * 7, SpringLayout.NORTH, buttonPanel);
        springLayout.putConstraint(SpringLayout.WEST, add, 150, SpringLayout.WEST, buttonPanel);
        springLayout.putConstraint(SpringLayout.NORTH, query, 25, SpringLayout.NORTH, buttonPanel);
        springLayout.putConstraint(SpringLayout.WEST, query, 450, SpringLayout.WEST, buttonPanel);
    }


    private void display() {
        this.jFrame.setBounds(600, 300, 600, 700);
        this.jScrollPane.setSize(600, 300);
        this.jFrame.setVisible(true);
    }


    private List<StudentEntity> queryList() {
        return studentInfoManager.queryStudentInfo();
    }

    private void refresh() {
        this.studentList = queryList();
        studentTableModel = new StudentTableModel(studentList);
        jTable.setModel(studentTableModel);
        jTable.repaint();
    }

    class AddActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int result = -4;
            StudentEntity studentEntity = new StudentEntity();
            try {
                studentEntity.setId(textFields[0].getText());
                studentEntity.setName(textFields[1].getText());
                studentEntity.setGender(textFields[2].getText());
                studentEntity.setPhoneNumber(textFields[3].getText());
                studentEntity.setAge(Integer.valueOf(textFields[4].getText()));
                studentEntity.setAddress(textFields[5].getText());
                result = studentInfoManager.insertStudentInfo(studentEntity);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            if (result != 1) {
                if (result == -3) {
                    JOptionPane.showMessageDialog(jFrame, "Open file fail! Please check your file: " + Setting.FILE_PATH + Setting.FILE_NAME);
                } else if (result == -2) {
                    JOptionPane.showMessageDialog(jFrame, "Write file fail! Please check your file: " + Setting.FILE_PATH + Setting.FILE_NAME);
                } else if (result == -1) {
                    JOptionPane.showMessageDialog(jFrame, "Create file fail! Please check your path: " + Setting.FILE_PATH);
                } else if (result == 2) {
                    JOptionPane.showMessageDialog(jFrame, "Student Id already exist! Please input a new Id!");
                } else if (result == -4) {
                    JOptionPane.showMessageDialog(jFrame, "Student info error, please input again!");
                }
            }
            refresh();
        }
    }

    class QueryActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            refresh();
        }
    }
}
