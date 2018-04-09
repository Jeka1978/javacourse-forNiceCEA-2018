package inner_classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Evgeny Borisov
 */
public class MyButtonListener implements ActionListener {

    private final ColorFrame colorFrame;

    public MyButtonListener(ColorFrame colorFrame) {
        this.colorFrame = colorFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button was clicked!!!");
    }
}
