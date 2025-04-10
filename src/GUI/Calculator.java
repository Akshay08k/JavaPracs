import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CalculatorPanel extends JPanel {
    private final JTextField display;
    private final StringBuilder currentInput;
    private double result;
    private String operator;
    private boolean startNewNumber;

    public CalculatorPanel() {
        setLayout(new BorderLayout());

        display = new JTextField("0");
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        currentInput = new StringBuilder();
        operator = "";
        result = 0;
        startNewNumber = true;

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if ("0123456789".contains(command)) {
                if (startNewNumber) {
                    currentInput.setLength(0);
                    startNewNumber = false;
                }
                currentInput.append(command);
                display.setText(currentInput.toString());
            } else if ("+-*/".contains(command)) {
                calculate();
                operator = command;
                //clears the current input and sets the startNewNumber flag to true
                startNewNumber = true;
            } else if (command.equals("=")) {
                calculate();
                operator = "";
                display.setText(Double.toString(result));
                startNewNumber = true;
            } else if (command.equals("C")) {
                currentInput.setLength(0);
                result = 0;
                operator = "";
                display.setText("0");
                startNewNumber = true;
            }
        }

        private void calculate() {
            double input = currentInput.length() > 0 ? Double.parseDouble(currentInput.toString()) : 0;
            if (operator.isEmpty()) {
                result = input;
            } else {
                switch (operator) {
                    case "+" -> result += input;
                    case "-" -> result -= input;
                    case "*" -> result *= input;
                    case "/" -> result = input != 0 ? result / input : 0;
                }
            }
            display.setText(Double.toString(result));
            currentInput.setLength(0);
        }
    }
}

class CalculatorFrame extends JFrame {
    public CalculatorFrame() {
        setSize(500, 600);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true); //used to maximize and minimise
        add(new CalculatorPanel());
        // pack();
        // setLocationRelativeTo(null);
    }
}

public class Calculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorFrame frame = new CalculatorFrame();
            frame.setVisible(true);
        });
    }
}
