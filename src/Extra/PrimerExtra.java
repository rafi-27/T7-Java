package Extra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimerExtra{
        //    public static void main(String[] args) {
//
//        String probamos = "Que pasa estas bien?";
//        String getMessaje = JOptionPane.showInputDialog(null, "Entonces bien?");
//
//        //JOptionPane.showMessageDialog(null, getMessaje);
//
//        if (getMessaje.equals("Si")) {
//            System.out.println("Que bien");
//        } else if (getMessaje.equals("No")) {
//            System.out.println("Que mal");
//        } else
//            System.out.println("Joder nada");
//    }
        public static void main(String[] args) {
            JFrame jFrame = new JFrame();

            JDialog jd = new JDialog(jFrame);

            jd.setLayout(new FlowLayout());

            jd.setBounds(500, 500, 500, 500);

            JLabel jLabel = new JLabel("Press close button to close the dialog.");

            JButton jButton = new JButton("Close");
            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jd.setVisible(false);
                }
            });

            jd.add(jLabel);
            jd.add(jButton);
            jd.setVisible(true);
        }
    }
