/**
 * Driver Class for the Entire Program...
 */

import controller.CalendarKeyController;
import controller.CalendarMouseController;
import controller.ReminderKeyController;
import controller.ReminderMouseController;
import model.CalendarModel;
import model.ReminderModel;
import view.View;

public class Main {

    public static void main(String[] args) {

        CalendarModel calendarModel = new CalendarModel();
        ReminderModel reminderModel = new ReminderModel();
        CalendarKeyController calendarController = new CalendarKeyController(calendarModel);
        ReminderKeyController reminderController = new ReminderKeyController(reminderModel);
        CalendarMouseController calendarMouseController = new CalendarMouseController(calendarModel);
        ReminderMouseController reminderMouseController = new ReminderMouseController(reminderModel);
        View view = new View(calendarController, calendarModel, reminderModel, reminderController, calendarMouseController, reminderMouseController);

        calendarModel.addObserver(view); // Passes an object of View to the Model, so that it can be observed
        reminderModel.addObserver(view);// Passes an object of View to the Model, so that it can be observed
        view.setVisible(true);
    }

}
