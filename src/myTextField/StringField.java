/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myTextField;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Reakkidingg_
 */
public class StringField {

    public void handleKeyTyped(KeyEvent evt) {
        String text = ((JTextField) evt.getSource()).getText();
        int length = text.length();

        if (length >= 10) {
            evt.consume(); // Ignore input if the maximum length has been reached
        }
    }
}
