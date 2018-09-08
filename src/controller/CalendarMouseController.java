/**
 * The mouse listener class for CalendarPanel
 */
package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JList;

import model.CalendarModel;

public class CalendarMouseController implements MouseListener {

    private CalendarModel calendarModel;

    public CalendarMouseController(CalendarModel calendarModel) {

        this.calendarModel = calendarModel;

    }

    @Override
    public void mouseClicked(MouseEvent e) {
/**
 * checks if the click count is 2, if true, then checks if the click was in a JList
 * Then JList is casted to the source
 * Then gets the selected index of the item in the JList and removes it from the defaultListModel that is in the CalendarModel.
 */

        if (e.getClickCount() == 2) {

            if (e.getSource() instanceof JList) {

                JList source = (JList) e.getSource();

                calendarModel.getCalenderListModel().remove(source.getSelectedIndex());


            }

        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}
