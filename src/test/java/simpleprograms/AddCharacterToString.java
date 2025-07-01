package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
input -> Hello
output-> HelGeekslo
 */
public class AddCharacterToString {
    private final Logger log = LogManager.getLogger(AddCharacterToString.class);

    public static void main(String[] args) {
        AddCharacterToString acts = new AddCharacterToString();
        acts.checkAddCharacter();
    }

    void checkAddCharacter() {
        String s = "Hello";
        String word = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            word = word + c;
            if (i == 2) {
                word = word + "Geeks" + s.substring(3);
                log.info("New word is:{}", word);
            }
        }
    }
}
