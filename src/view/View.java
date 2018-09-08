/**
 *This class holds all the properties that are needed to make up the GUI
 * The method 'Update' from the abstract class 'Observer' has been overridden
 */
package view;

import java.awt.BorderLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import controller.CalendarKeyController;
import controller.CalendarMouseController;
import controller.ReminderKeyController;
import controller.ReminderMouseController;
import model.CalendarModel;
import model.ReminderModel;

/**
 * The View Class extends a superclass called JFrame and it implements an abstract class called Observer
 */

public class View extends JFrame implements Observer {

  /**------------------------Private Fields-----------------------*/

    private JPanel calendarPanel, reminderPanel;
    private JList calendarList, reminderList;
    private JTextField calendarField, reminderField;
    private JTabbedPane tabbedPane;
    private CalendarModel calendarModel;
    private JScrollPane calendarListScrollPane, reminderListScrollPane;
    private ReminderModel reminderModel;

    public View(CalendarKeyController calendarController, CalendarModel calendarModel, ReminderModel reminderModel, ReminderKeyController reminderController, CalendarMouseController calendarMouseController, ReminderMouseController reminderMouseController) {

/**-----------------------Instantiating the Fields that was created above---------------------------*/

        calendarPanel = new JPanel(new BorderLayout()); // The calendarPanel has been set to have a BorderLayout
        reminderPanel = new JPanel(new BorderLayout()); // The ReminderPanel has been set to have a BorderLayout
        calendarList = new JList();
        reminderList = new JList();
        calendarField = new JTextField();
        reminderField = new JTextField();
        tabbedPane = new JTabbedPane();
        calendarListScrollPane = new JScrollPane(calendarList); // Adding the CalendarList(JList) to the ScrolPane
        reminderListScrollPane = new JScrollPane(reminderList); // Adding the ReminderList(JList) to the ScrolPane

        this.calendarModel = calendarModel;
        this.reminderModel = reminderModel;

        calendarField.addKeyListener(calendarController); // Adding the KeyListener called calendarController to the calendarField
        reminderField.addKeyListener(reminderController); // Adding the KeyListener called reminderController to the reminderField
        calendarList.addMouseListener(calendarMouseController); // Adding the MouseListener called calendarMouseController to the calendarList
        reminderList.addMouseListener(reminderMouseController); // Adding the MouseListener called reminderMouseController to the reminderList

        calendarPanel.add(calendarListScrollPane, BorderLayout.CENTER);
        calendarPanel.add(calendarField, BorderLayout.SOUTH);

        reminderPanel.add(reminderListScrollPane, BorderLayout.CENTER);
        reminderPanel.add(reminderField, BorderLayout.SOUTH);


        tabbedPane.addTab("Calendar", calendarPanel); // Adding the calendarPanel to the tabbedPane
        tabbedPane.addTab("Reminder", reminderPanel); // Adding the ReminderPanel to the tabbedPane

        add(tabbedPane);


        pack();
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void update(Observable o, Object arg) {

        calendarList.setModel(calendarModel.getCalenderListModel()); // Gets the default list model for the CalendarList from the CalendarModel class and sets it to the calendarList
        reminderList.setModel(reminderModel.getReminderListModel()); // Gets the default list model for the ReminderList from the ReminderModel class and sets it to the reminderList

    }

}
