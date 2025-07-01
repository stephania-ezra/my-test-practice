package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DisplayCurrentDate {
    private final Logger log = LogManager.getLogger(DisplayCurrentDate.class);

    public static void main(String[] args) {
        DisplayCurrentDate displayCurrentDate = new DisplayCurrentDate();
        displayCurrentDate.showCurrentDate();
    }

    void showCurrentDate() {
        java.util.Date date = new java.util.Date();
        log.info(date.toString());
    }
}
