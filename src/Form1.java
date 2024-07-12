import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {
    private JPasswordField passwordtxt;
    private JTextField usertxt;
    private JButton enviarButton;
    public JPanel mainPanel;

    public Form1() {
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (passwordtxt.getText().equals("12345") && usertxt.getText().equals("Alejandro")) {
                    JFrame frame = new JFrame();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setTitle("Biografia");
                    frame.pack();
                    frame.setContentPane(new Form2().menuDos);
                    frame.setLocation(460,190);
                    frame.setSize(500, 400);
                    frame.setVisible(true);
                    ((JFrame) SwingUtilities.getWindowAncestor(enviarButton)).dispose();
                }
            }
        });
    }
}
