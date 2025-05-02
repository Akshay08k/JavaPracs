
import java.awt.event.*;
import javax.swing.*;

class StudentFormDemo extends JFrame {

    JLabel nameLbl, AgeLbl, GenderLbl, emailLbl;
    JButton submitBtn;
    JRadioButton maleBtn, femaleBtn;
    JTextField nameField, ageField, emailField;

    StudentFormDemo(String title) {
        setTitle(title);
        setVisible(true);
        setLayout(null);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        nameLbl = new JLabel("Name : ");
        nameLbl.setBounds(50, 50, 100, 30);
        add(nameLbl);

        nameField = new JTextField();
        nameField.setBounds(150, 50, 100, 30);
        add(nameField);

        AgeLbl = new JLabel("Age : ");
        add(AgeLbl);
        AgeLbl.setBounds(50, 100, 100, 30);
        ageField = new JTextField();
        ageField.setBounds(150, 100, 100, 30);
        add(ageField);

        ButtonGroup buttonGroup = new ButtonGroup();
        GenderLbl = new JLabel("Gender");
        GenderLbl.setBounds(50, 150, 100, 30);

        add(GenderLbl);
        maleBtn = new JRadioButton("Male");
        maleBtn.setSelected(true);
        femaleBtn = new JRadioButton("Female");
        buttonGroup.add(maleBtn);
        buttonGroup.add(femaleBtn);

        JPanel genderPanel = new JPanel();
        genderPanel.add(maleBtn);
        genderPanel.add(femaleBtn);
        genderPanel.setBounds(150, 150, 200, 30);

        add(genderPanel);

        emailLbl = new JLabel("Email : ");
        emailLbl.setBounds(50, 200, 100, 30);
        add(emailLbl);
        emailField = new JTextField();
        emailField.setBounds(150, 200, 100, 30);
        add(emailField);

        submitBtn = new JButton("Submit");
        submitBtn.setBounds(150, 250, 100, 30);
        add(submitBtn);

        submitBtn.addActionListener((ActionEvent e) -> {
            String name1 = nameField.getText();
            String age = ageField.getText();
            String gender = "";
            if (maleBtn.isSelected()) {
                gender = "Male";
            } else if (femaleBtn.isSelected()) {
                gender = "Female";
            }
            String email = emailField.getText();
            JOptionPane.showMessageDialog(null, "Name : " + name1 + "\nAge : " + age + "\nGender : " + gender + "\nEmail : " + email);
        });
    }
}

public class StudentForm {

    public static void main(String args[]) {
        @SuppressWarnings("unused")
        StudentFormDemo studentFormDemo = new StudentFormDemo("Student Form");
    }
}
