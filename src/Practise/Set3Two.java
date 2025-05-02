
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Set3Two {

    public static void main(String[] args) {
        // Create a GUI window
        JFrame frame = new JFrame("Pattern Printer");
        JButton button = new JButton("Print Pattern");

        // Set up frame and button
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        button.setBounds(80, 70, 130, 40);
        frame.add(button);
        frame.setVisible(true);

        // Add action listener to button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a thread using Runnable
                Runnable task = new PatternTask();
                Thread thread = new Thread(task);
                thread.start();
            }
        });
    }
}

// Runnable class to print the pattern
class PatternTask implements Runnable {

    @Override
    public void run() {
        // Printing the pattern in console
        try {
            for (int i = 1; i <= 3; i++) {
                for (int j = 1; j <= i; j++) {
                     Thread.sleep(1000);
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
