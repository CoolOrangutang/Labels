import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("Inspirobot.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel();

        label.setText("Mary, im fucking ballin'");
        label.setIcon(image);

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        label.setForeground(new Color(0x000000));

        label.setFont(new Font("Times New Roman",Font.PLAIN,100));

        label.setIconTextGap(-25);
        label.setBackground(Color.white);
        label.setOpaque(true);

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(label);


        frame.pack();
    }
}
