
import java.awt.event.*;
import javax.swing.*;

class AuthSystemSupport extends JFrame {

    private final String userName = "akshay";
    private final String password = "admin";
    JButton loginBtn;

    public AuthSystemSupport() {
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel usrNameLbl = new JLabel("Username : ");
        usrNameLbl.setBounds(50, 50, 100, 30);
        add(usrNameLbl);

        JTextField usrNameField = new JTextField();
        usrNameField.setBounds(150, 50, 100, 30);
        add(usrNameField);

        JLabel passwordLbl = new JLabel("Password : ");
        passwordLbl.setBounds(50, 100, 100, 30);
        add(passwordLbl);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 100, 30);
        add(passwordField);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(150, 150, 100, 30);
        add(loginBtn);

        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (usrNameField.getText().equals(userName) && String.valueOf(passwordField.getPassword()).equals(password)) {
                    JOptionPane.showMessageDialog(null, "Login Success");
                    new showingFileDemo();
                } else {
                    JOptionPane.showMessageDialog(null, "Login Failed");
                }
            }
        });
    }
}

public class AuthSystemDemo {

    public static void main(String[] args) {
        AuthSystemSupport authSystemSupport = new AuthSystemSupport();
    }
}
