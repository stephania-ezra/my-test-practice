package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
input ->Encyclopedia
output -> E
n
c
y
c
l
o
p
e
d
i
a
 */
public class StringTraversal {
    private final Logger log = LogManager.getLogger();

    public static void main(String[] args) {
        StringTraversal st = new StringTraversal();
        st.printCharacters();
    }

    void printCharacters() {
        String s = "Encyclopedia";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(c);
            System.out.print(" ");
            //log.info(c);
        }
    }
}
