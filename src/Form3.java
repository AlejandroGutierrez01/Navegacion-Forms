import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form3 {
    public JPanel menuTres;
    private JLabel imgLabel;
    private JButton regresarButton;


    public Form3() {
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Biografia");
                frame.pack();
                frame.setContentPane(new Form2().menuDos);
                frame.setLocation(460,190);
                frame.setSize(500, 400);
                frame.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(regresarButton)).dispose();
            }
        });
    }

    private void createUIComponents() {
        ImageIcon imagen = new ImageIcon("C:\\Users\\PC\\IdeaProjects\\NavegacionForms\\src\\Images\\hobbie.jpg");
        Image img = imagen.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH);
        imgLabel = new JLabel(new ImageIcon(img));
    }
}
