package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


/*
input -> STEPHANIA
OUTPUT -> AINAHPETS
 */
public class ReverseString {

    private final Logger log = LogManager.getLogger(ReverseString.class);

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        rs.checkStringReverse();
    }

    void checkStringReverse() {
        Scanner sc = new Scanner(System.in);
        log.info("Enter String");
        String s = sc.nextLine();

        String reverseString = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            reverseString = c + reverseString;
            /*
            c = S
            reverseString = S+ "" = S
            reverseString = T+S =TS
            reverseString = E+TS = ETS
            reverseString = P+ETS = PETS
            reverseString = H + PETS = HPETS
            reverseString = A +HPETS = AHPETS
            reverseString = N + AHPETS = NAHPETS
            reverseString = I +NAHPETS = INAHPETS
            reverseString = A +INAHPETS = AINAHPETS
             */
        }
        log.info("Reverse String is:{}", reverseString);
    }
}
