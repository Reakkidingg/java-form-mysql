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
public class LetterField {
    private int characterCount = 0;

    public void handleKeyTyped(KeyEvent evt) {
        char c = evt.getKeyChar();

        if (Character.isLetter(c) || c == ' ') {
            if (characterCount < 5) {
                characterCount++; // Increment character count
            } else {
                evt.consume(); // Ignore input if the maximum 5 characters have been reached
            }
        } else if (c == KeyEvent.VK_BACK_SPACE) {
            if (characterCount > 0) {
                characterCount--; // Decrement character count
            }
        } else {
            evt.consume(); // Ignore non-alphabetic input
        }
    }
}

