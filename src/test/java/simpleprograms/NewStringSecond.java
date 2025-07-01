package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/*
input ->StephANIa
output -> SANItepha
 */
public class NewStringSecond {
    private final Logger log = LogManager.getLogger(NewStringSecond.class);

    public static void main(String[] args) {
        NewStringSecond nss = new NewStringSecond();
        nss.stringWithUpperAndChar();
    }

    void stringWithUpperAndChar() {
        Scanner sc = new Scanner(System.in);
        log.info("Enter String");
        String s = sc.nextLine();

        String upper = "";
        String characterString = "";
        String newString = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                upper = upper + c;
            }else{
                characterString = characterString + c;
            }
        }
        newString = upper + characterString;
        log.info("NewString is:{}", newString);
    }
}
