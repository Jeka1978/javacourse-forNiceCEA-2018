package inner_classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {
    public ColorFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocation(200,200);
        JButton button = new JButton("click to change color");
        final int[] xxxxx = {4};

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(xxxxx[0]++);
                getContentPane().setBackground(Color.RED);
            }
        });

        this.add(button, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorFrame();
    }
}
