import javax.swing.*;
import java.awt.*;

public class OneTwoThree extends JFrame {
    public static void main(String[] args) {
        new OneTwoThree().GUI();
    }

    public void GUI() {
        new OneTwoThree();
        setTitle("123");
        setSize(500, 240);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JTextArea in = new JTextArea();
        in.setPreferredSize(new Dimension(500, 80));
        in.setWrapStyleWord(true);
        in.setLineWrap(true);
        c.add(in);
        JButton convert = new JButton("Convert");
        c.add(convert);
        JTextArea out = new JTextArea();
        out.setPreferredSize(new Dimension(500, 80));
        out.setEditable(false);
        out.setWrapStyleWord(true);
        out.setLineWrap(true);
        c.add(out);

        setVisible(true);
        convert.addActionListener(e -> {
            String drieLetters = "";
            for (int i = 0; i < in.getText().length(); i++) {
                try {
                    drieLetters += Translator.one2three(Character.toString(in.getText().charAt(i))) + " ";
                    out.setText(drieLetters);
                } catch (NotAnAA notAnAA) {
                    out.setText(String.valueOf(notAnAA));
                }
            }

        });

    }
}
