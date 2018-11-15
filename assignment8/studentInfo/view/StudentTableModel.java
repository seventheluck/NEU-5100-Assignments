package For_Java.assignments.assignment8.studentInfo.view;

import For_Java.assignments.assignment8.studentInfo.Setting;
import For_Java.assignments.assignment8.studentInfo.model.StudentEntity;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.List;

public class StudentTableModel implements TableModel {
    private List<StudentEntity> studentList;

    public StudentTableModel(List<StudentEntity> studentList) {
        this.studentList = studentList;
    }

    @Override
    public int getRowCount() {
        return studentList.size();
    }

    @Override
    public int getColumnCount() {
        return Setting.COLUMN_COUNT;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        } else if (columnIndex == 1) {
            return "Name";
        } else if (columnIndex == 2) {
            return "Gender";
        } else if (columnIndex == 3) {
            return "Phone";
        } else if (columnIndex == 4) {
            return "Age";
        } else {
            return "Address";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 4) {
            return int.class;
        } else {
            return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StudentEntity studentEntity = this.studentList.get(rowIndex);
        if (columnIndex == 0) {
            return studentEntity.getId();
        } else if (columnIndex == 1) {
            return studentEntity.getName();
        } else if (columnIndex == 2) {
            return studentEntity.getGender();
        } else if (columnIndex == 3) {
            return studentEntity.getPhoneNumber();
        } else if (columnIndex == 4) {
            return studentEntity.getAge();
        } else {
            return studentEntity.getAddress();
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

}
