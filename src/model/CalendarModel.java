/**
 * This is the model class for the Calendar, this class only holds the fields and methods that are necessary
 * to successfully make the calendarPanel work.
 */

package model;

import java.util.Observable;
import javax.swing.DefaultListModel;

public class CalendarModel extends Observable {

    /**
     * ----------------------Private Fields---------------------------
     */
    private String calendarTextField;
    private DefaultListModel calenderListModel; // The defaultListModel for the JList(Specifically for CalendarList)

    public CalendarModel() {

        /**--------------------------Instantiating the fields----------------*/
    	
        calenderListModel = new DefaultListModel();

    }

    public void setCalendarTextField(String calendarTextField) {

        this.calendarTextField = calendarTextField;

    /**
     * Adds the text from the textField to the CalendarListModel
     */

        calenderListModel.addElement(calendarTextField);

        super.setChanged();
        super.notifyObservers();

    }

    /**
     * Getter for the DefaultListModel(This is used in the controller Class to get the calendarListModel and to perform certain events such as removal of elements)
     * @return
     */

    public DefaultListModel getCalenderListModel() {
        return calenderListModel;
    }

}

