package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class NewString {
    private final Logger log = LogManager.getLogger(NewString.class);

    public static void main(String[] args) {
        NewString ns = new NewString();
        ns.createNewString();

    }

    /* creating a new String
    Input String  -> ILOVEYOUqwdvvevwfvfd
    Output String-> ILOVEYOU
     */
    void createNewString() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String sn = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                sn = sn + c;
            }
        }
        log.info("New String is:{}", sn);
    }
}
