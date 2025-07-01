package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


/*

input -> 10coll456ethan
output -> 10456collethan
 */

public class DigitAndCharString {
    private final Logger log = LogManager.getLogger(DigitAndCharString.class);

    public static void main(String[] args) {
        DigitAndCharString dacs = new DigitAndCharString();
        dacs.stringWithDigitAndChar();
    }

    void stringWithDigitAndChar() {
        Scanner sc = new Scanner(System.in);
        log.info("Enter String");
        String s = sc.nextLine();

        String digitString = "";
        String characterString = "";
        String newString = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                digitString = digitString + c;
            }else{
                characterString = characterString + c;
            }
        }
        newString = digitString + characterString;
        log.info("NewString is:{}", newString);
    }
}
