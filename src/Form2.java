import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form2 {
    public JPanel menuDos;
    private JTextArea bibliografia;
    private JButton btnPantallaTres;

    public Form2() {
        btnPantallaTres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Panel 3");
                frame.setContentPane(new Form3().menuTres);
                frame.pack();
                frame.setLocation(460,190);
                frame.setSize(500, 400);
                frame.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(btnPantallaTres)).dispose();

            }
        });
    }
}
