package For_Java.assignments.assignment8.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    private static final String C_TITLE = "Calculator";
    private static final String C_ADD = "+";
    private static final String C_SUB = "-";
    private static final String C_MUL = "*";
    private static final String C_DIV = "/";
    private static final String C_ACTION_OPERATOR = "operator";
    private static final String C_ACTION_COMPUTE = "compute";
    private static final String C_ACTION_NUMBER = "number";
    private static final String C_ZERO = "0";
    private static final int C_WIDTH = 400;
    private static final int C_HEIGHT = 300;
    private static final int C_X_COORDINATE = 700;
    private static final int C_Y_COORDINATE = 300;
    private static final String C_FONT_NAME = Font.SANS_SERIF;
    private static final int C_FONT_STYLE = Font.ROMAN_BASELINE;
    private static final int C_FONT_SIZE = 20;


    private JFrame jFrame;
    private JTextField screen;
    private JButton add, subtract, multiply, divide, compute, point, clear;
    private JButton numbers[];
    private Font font;
    private String preOperation;
    private String preAction;
    private double first, second;

    public Calculator() {
        this.reset();
        this.createComponents();
        this.setLayout();
        this.addComponents();
        this.addBehaviors();
        this.display();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }

    public void reset() {
        this.first = 0;
        this.second = 0;
        this.preOperation = "+";
        this.preAction = "";
    }

    private void addBehaviors() {
        OperatorActionListener oa = new OperatorActionListener();
        NumberActionListener na = new NumberActionListener();
        ComputeActionListener ca = new ComputeActionListener();
        ClearActionListener cla = new ClearActionListener();
        for (int i = 0; i < 10; i++) {
            this.numbers[i].addActionListener(na);
        }
        this.point.addActionListener(na);
        this.add.addActionListener(oa);
        this.subtract.addActionListener(oa);
        this.multiply.addActionListener(oa);
        this.divide.addActionListener(oa);
        this.compute.addActionListener(ca);
        this.clear.addActionListener(cla);
    }

    private void setLayout() {

    }

    private void createComponents() {
        this.jFrame = new JFrame(C_TITLE);
        this.font = new Font(C_FONT_NAME, C_FONT_STYLE, C_FONT_SIZE);

        this.clear = new JButton("C");
        this.clear.setFont(font);
        this.screen = new JTextField("0", 30);
        this.screen.setFont(font);

        this.add = new JButton("+");
        this.add.setFont(font);
        this.subtract = new JButton("-");
        this.subtract.setFont(font);
        this.multiply = new JButton("*");
        this.multiply.setFont(font);
        this.divide = new JButton("/");
        this.divide.setFont(font);
        this.compute = new JButton("=");
        this.compute.setFont(font);
        /*this.compute.setBackground(Color.PINK);
        this.compute.setOpaque(true);
        this.compute.setBorderPainted(false);*/
        this.point = new JButton(".");
        this.point.setFont(font);

        numbers = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = new JButton(i + "");
            numbers[i].setFont(font);
        }
    }

    private void addComponents() {
        //button = new JButton("Button 1");
        Container pane = this.jFrame.getContentPane();
        pane.setLayout(new GridBagLayout());
        this.addComponentsForEach(pane, this.screen, 0, 0, 0);
        int k = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.addComponentsForEach(pane, numbers[k++], 0.5, j, i);
            }
        }
        this.addComponentsForEach(pane, this.add, 0.5, 3, 1);
        this.addComponentsForEach(pane, this.subtract, 0.5, 3, 2);
        this.addComponentsForEach(pane, this.multiply, 0.5, 3, 3);
        this.addComponentsForEach(pane, numbers[0], 0.5, 0, 4);
        this.addComponentsForEach(pane, point, 0.5, 1, 4);
        this.addComponentsForEach(pane, this.divide, 0.5, 2, 4);
        this.addComponentsForEach(pane, this.compute, 0.5, 3, 4);
        this.addComponentsForEach(pane, this.clear, 0.5, 0, 5);
    }

    private void addComponentsForEach(Container pane, Component jButton, double weightx, int gridx, int gridy) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = weightx;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        if (jButton == screen)
            gbc.gridwidth = 4;
        if (jButton == clear)
            gbc.gridwidth = 4;
        pane.add(jButton, gbc);
    }

    private void display() {
        this.jFrame.setBounds(C_X_COORDINATE, C_Y_COORDINATE, C_WIDTH, C_HEIGHT);
        this.jFrame.setVisible(true);
    }

    private double compute(double first, double second, String operator) {
        if (C_ADD.equals(operator)) {
            return first + second;
        } else if (C_SUB.equals(operator)) {
            return first - second;
        } else if (C_MUL.equals(operator)) {
            return first * second;
        } else {
            if (second != 0) {
                return first / second;
            } else {
                return Double.MAX_VALUE;
            }
        }
    }

    class OperatorActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (C_ACTION_COMPUTE.equals(preAction)) {
                second = 0;
            } else {
                second = Double.valueOf(screen.getText());
            }
            first = compute(first, second, preOperation);
            screen.setText(String.valueOf(first));
            preAction = C_ACTION_OPERATOR;
            if (e.getSource() == add) {
                //first = compute(first, second, preOperation);
                preOperation = C_ADD;
            } else if (e.getSource() == subtract) {
                //first = compute(first, second, preOperation);
                preOperation = C_SUB;
            } else if (e.getSource() == multiply) {
                //first = compute(first, second, preOperation);
                preOperation = C_MUL;
            } else {
                //first = compute(first, second, preOperation);
                preOperation = C_DIV;
            }
        }


    }

    class ComputeActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            second = Double.valueOf(screen.getText());
            first = compute(first, second, preOperation);
            screen.setText(String.valueOf(first));
            second = 0;
            preOperation = C_ADD;
            preAction = C_ACTION_COMPUTE;
        }
    }

    class NumberActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == point) {
                if (!C_ACTION_OPERATOR.equals(preAction) && !C_ACTION_COMPUTE.equals(preAction)) {
                    screen.setText(screen.getText() + ".");
                } else if (C_ACTION_OPERATOR.equals(preAction)) {
                    screen.setText("0.");
                } else {
                    screen.setText("0.");
                    first = 0;
                    second = 0;
                }

                preAction = C_ACTION_NUMBER;
                return;
            }
            for (int i = 0; i < 10; i++) {
                if (e.getSource() == numbers[i]) {
                    if (!C_ACTION_OPERATOR.equals(preAction) && !C_ACTION_COMPUTE.equals(preAction)) {
                        if (C_ZERO.equals(screen.getText())) {
                            screen.setText(i + "");
                        } else {
                            screen.setText(screen.getText() + i);
                        }
                    } else if (C_ACTION_OPERATOR.equals(preAction)) {
                        screen.setText(i + "");
                    } else {
                        screen.setText(i + "");
                        first = 0;
                        second = 0;
                    }
                    preAction = C_ACTION_NUMBER;
                    break;
                }
            }
        }
    }

    class ClearActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            reset();
            screen.setText("0");
        }
    }
}

