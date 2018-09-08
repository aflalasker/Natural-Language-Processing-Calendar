/**
 * The key controller class for the Panel
 *
 */

package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

import model.ReminderModel;

public class ReminderKeyController implements KeyListener {

    private ReminderModel reminderModel;

    public ReminderKeyController(ReminderModel reminderModel) {

        this.reminderModel = reminderModel;

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
    	
    	/**
    	 * This is a keyPressed event, the keyEvent is the Enter Key(The code in this method will only get executed of the Enter button is pressed )
    	 * Checks if the source is a JTextField, and then JTextField has been casted to the source.
    	 * Then the text from the JTextField is taken and passed to the field 'reminderTextField' that is in the reminderModel.
    	 */
    	    

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {

            if ( e.getSource() instanceof JTextField ) {

                JTextField source = (JTextField)e.getSource();

                reminderModel.setReminderTextField(source.getText());

                source.setText("");

            }

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

}
