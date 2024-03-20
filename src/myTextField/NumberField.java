/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myTextField;
import javax.swing.JTextField;


/**
 * Custom JTextField that allows only numeric input.
 * Extend this class to include additional validation or behavior.
 *
 * @author Reakkidingg_
 */
public class NumberField {

    public static void handleKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        JTextField textField = (JTextField) evt.getSource();

        if (!Character.isDigit(c)) {
            evt.consume(); // Ignore non-numeric input
        }

        String currentText = textField.getText();
        if (currentText.length() >= 5) {
            evt.consume(); // Ignore input if the text field already has 10 digits
        }
    }
}

