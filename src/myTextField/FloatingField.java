/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myTextField;

import java.awt.event.KeyEvent;

/**
 *
 * @author Reakkidingg_
 */
public class FloatingField {

    private boolean commaAllowed = true;
    private boolean commaInputted = false;

    public void handleKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            // Allow digits
            commaAllowed = true; // Reset commaAllowed when a digit is typed
        } else if (c == ',' && commaAllowed && !commaInputted) {
            commaInputted = true;
            commaAllowed = false;
        } else if (c == KeyEvent.VK_BACK_SPACE) {
            // Allow deletion of comma and reset commaInputted and commaAllowed
            if (commaInputted) {
                commaInputted = false;
                commaAllowed = true;
            }
        } else {
            evt.consume(); // Ignore non-numeric input
        }
    }
}





