import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIcalc implements ActionListener {
    private static JTextField inputBox;

    GUIcalc() {}

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.charAt(0) == 'C') {
            inputBox.setText("");
        } else if (command.charAt(0) == '=') {
            inputBox.setText(evaluate(inputBox.getText()));
        } else {
            inputBox.setText(inputBox.getText() + command);
        }
    }

    public static String evaluate(String expression) {
        char[] arr = expression.toCharArray();
        String operand1 = "";
        String operand2 = "";
        String operator = "";
        double result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
                if (operator.isEmpty()) {
                    operand1 += arr[i];
                } else {
                    operand2 += arr[i];
                }
            }
            if (arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') {
                operator += arr[i];
            }
        }
        if (operator.equals("+")) {
            result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
        } else if (operator.equals("-")) {
            result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
        }
        else if (operator.equals("/")) {
            result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
        }
        else  {
            result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));
        }
        return operand1 + operator + operand2 +"="+result;
    }

    private static void createWindow() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createUI(frame);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void createUI(JFrame frame) {
        JPanel panel = new JPanel();
        GUIcalc calc = new GUIcalc();
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(layout);
        inputBox = new JTextField(10);
        inputBox.setEditable(false);
        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");

        JButton buttonPlus = new JButton("+");
        JButton buttonDivide = new JButton("/");
        JButton buttonMultiply = new JButton("*");
        JButton buttonMinus = new JButton("-");
        JButton buttonDot = new JButton(".");
        JButton buttonClear = new JButton("C");
        JButton buttonEquals = new JButton("=");

        b1.addActionListener(calc);
        b2.addActionListener(calc);
        b3.addActionListener(calc);
        b4.addActionListener(calc);
        b5.addActionListener(calc);
        b6.addActionListener(calc);
        b7.addActionListener(calc);
        b8.addActionListener(calc);
        b9.addActionListener(calc);
        b0.addActionListener(calc);

        buttonPlus.addActionListener(calc);
        buttonMinus.addActionListener(calc);
        buttonMultiply.addActionListener(calc);
        buttonDivide.addActionListener(calc);
        buttonDot.addActionListener(calc);
        buttonClear.addActionListener(calc);
        buttonEquals.addActionListener(calc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(b1, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(b2, gbc);
        gbc.gridx = 2;
        gbc.gridy = 0;
        panel.add(b3, gbc);
        gbc.gridx = 3;
        gbc.gridy = 0;
        panel.add(buttonPlus, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(b4, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(b5, gbc);
        gbc.gridx = 2;
        gbc.gridy = 1;
        panel.add(b6, gbc);
        gbc.gridx = 3;
        gbc.gridy = 1;
        panel.add(buttonMinus, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(b7, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(b8, gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        panel.add(b9, gbc);
        gbc.gridx = 3;
        gbc.gridy = 2;
        panel.add(buttonDivide, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(buttonDot, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(b0, gbc);
        gbc.gridx = 2;
        gbc.gridy = 3;
        panel.add(buttonClear, gbc);
        gbc.gridx = 3;
        gbc.gridy = 3;
        panel.add(buttonMultiply, gbc);
        gbc.gridwidth = 3;
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(inputBox, gbc);
        gbc.gridx = 3;
        gbc.gridy = 4;
        panel.add(buttonEquals, gbc);

        frame.getContentPane().add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        createWindow();
    }
}
