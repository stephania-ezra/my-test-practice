package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class StringToArray {
    private final Logger log = LogManager.getLogger(StringToArray.class);

    public static void main(String[] args) {
        StringToArray stringToArray = new StringToArray();
        stringToArray.convertStringToArray();
    }

    void convertStringToArray() {
        Scanner sc = new Scanner(System.in);
        log.info("Enter the String");
        String str = sc.nextLine();
        char[] c = str.toCharArray();

        for (char s : c) {
            log.info(s);
        }
    }
}
