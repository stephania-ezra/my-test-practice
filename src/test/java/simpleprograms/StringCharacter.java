package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class StringCharacter {
    private final Logger log = LogManager.getLogger(StringCharacter.class);

    public static void main(String[] args) {
        StringCharacter stringChar = new StringCharacter();
        stringChar.listEachChar();
    }

    //list each character in the given string
    /*
    i/p string => 1I2L3O4V5E6I7N8D9I0A
    o/p => IlOvEIndIA
     */
    void listEachChar() {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // int countUpperCase = 0;
        //int countLowerCase = 0;
       // int countDigit = 0;
        int vowelCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char u = Character.toUpperCase(c);
            if (u == 'A' || u == 'E' || u == 'I' || u == 'O' || u == 'U') {
                vowelCount++;
            }
        }
        log.info(" {} Vowels", vowelCount);
    }
}
