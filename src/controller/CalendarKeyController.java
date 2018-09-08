package controller;
/**
 * The key controller class for the calendarPanel
 *
 */

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import model.CalendarModel;

public class CalendarKeyController implements KeyListener {

    private CalendarModel calendarModel;



    public CalendarKeyController(CalendarModel calendarModel) {

        this.calendarModel = calendarModel;

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
 * Then the text from the JTextField is taken and passed to the field 'calendarTextField' that is in the calendarModel.
 */
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {

            if ( e.getSource() instanceof JTextField ) {

                JTextField source = (JTextField)e.getSource();

                calendarModel.setCalendarTextField(source.getText());

                source.setText(""); // Clears the text from the JTextField once the text is set in the JList

            }

        }

    }


    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }


}
