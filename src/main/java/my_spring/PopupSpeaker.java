package my_spring;

import javax.swing.*;

/**
 * @author Evgeny Borisov
 */
public class PopupSpeaker implements Speaker {
    @Override
    public void sayMessage(String message) {
        JOptionPane.showMessageDialog(null,message);
    }
}
