package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


/*

input -> "GeeksGeeks"
output -> "GeeksForGeeks"
 */
public class InsertStringToAnother {
    private final Logger log = LogManager.getLogger(InsertStringToAnother.class);

    public static void main(String[] args) {
        InsertStringToAnother ista = new InsertStringToAnother();
        ista.checkStringInsert();
    }

    void checkStringInsert() {

        Scanner sc = new Scanner(System.in);
        log.info("Enter a String");
        String s = sc.nextLine();

        s = s + " ";
        String word = " ";
        String newString = " ";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            word = word + c;
            if (i == 4) {
                word = word + "for";
            }
        }
        log.info("Word After insertion is:{}", word);
    }
}
