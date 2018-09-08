/**
 * This is the model class for the Reminder, this class only holds the fields and methods that are necessary
 * to successfully make the reminderPanel work.
 */

package model;

import javax.swing.*;
import java.util.Observable;

public class ReminderModel extends Observable {

    private String reminderTextField;
    private DefaultListModel reminderListModel;

    public ReminderModel() {

        reminderListModel = new DefaultListModel();

    }

    public void setReminderTextField(String reminderTextField) {

        this.reminderTextField = reminderTextField;

        /**
         * Adds the text from the textField to the ReminderListModel
         */

        reminderListModel.addElement(reminderTextField);

        super.setChanged();
        super.notifyObservers();
    }

    /**
     * Getter for the DefaultListModel(This is used in the controller Class to get the ReminderListModel and to perform certain events such as removal of elements)
     * @return
     */
    public DefaultListModel getReminderListModel() {
        return reminderListModel;
    }

}
