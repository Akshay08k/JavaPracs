
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class GUIFrame extends JFrame {

    JLabel nameLbl, durationLbl, priceLbl;
    JTextField nameField, durationField, priceField;
    JButton submitBtn;

    GUIFrame(String title) {
        setVisible(true);
        setSize(500, 500);
        setLayout(null);
        setTitle(title);

        nameLbl = new JLabel("Name : ");
        nameLbl.setBounds(100, 80, 100, 30);
        durationLbl = new JLabel("Duration : ");
        durationLbl.setBounds(100, 120, 100, 30);
        priceLbl = new JLabel("Price : ");
        priceLbl.setBounds(100, 160, 100, 30);

        add(nameLbl);
        add(durationLbl);
        add(priceLbl);

        nameField = new JTextField();
        nameField.setBounds(150, 80, 100, 30);
        durationField = new JTextField();
        durationField.setBounds(150, 120, 100, 30);
        priceField = new JTextField();
        priceField.setBounds(150, 160, 100, 30);

        add(nameField);
        add(durationField);
        add(priceField);

        submitBtn = new JButton("Submit");
        submitBtn.setBounds(100, 200, 200, 30);

        add(submitBtn);

        submitBtn.addActionListener((actionEvent) -> {
            String movieDetails = new String();
            movieDetails += "Movie : " + nameField.getText() + "\n";
            movieDetails += "Duration : " + durationField.getText() + "\n";
            movieDetails += "Price : " + priceField.getText() + "\n";
            try {

                FileWriter fw = new FileWriter("MovieName.txt",true);
                fw.write(movieDetails);
                fw.close();
            } catch (IOException e) {
                System.err.println("Some error Occured" + e);
            }

        });

    }
}

public class Set1Two {

    public static void main(String[] args) {
        GUIFrame gi = new GUIFrame("Frame");
    }
}
