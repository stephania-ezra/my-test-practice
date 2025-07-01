package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
swap 2nd and 1st letter
and the other adjacent letters
keep the last letter constant

 */
public class SwappingAdjacentChar {
    private final Logger log = LogManager.getLogger(SwappingAdjacentChar.class);

    public static void main(String[] args) {
        SwappingAdjacentChar sac = new SwappingAdjacentChar();
        sac.checkSwap();
    }

    void checkSwap() {
        String s = "javas";

        char[] ch = s.toCharArray();
        int lengthCount = ch.length;

        for (int i = 0; i < ch.length - 1; i += 2) {
            char temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;
        }
        log.info("{}", new String(ch));
    }
}

