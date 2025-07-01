package ColllectionsFromBook;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConvertSetInToArray {
    private final Logger log = LogManager.getLogger(ConvertSetInToArray.class);

    public static void main(String[] args) {
        ConvertSetInToArray csinta = new ConvertSetInToArray();
        csinta.getArrayFromSet();
    }

    void getArrayFromSet() {

        //create a Set
        HashSet<String> names = new HashSet<String>();

        names.add("Ethan");
        names.add("Ritchie");
        names.add("Ezra");
        names.add("Collins");
        names.add("Einstein");

        String[] namesArray = names.toArray(new String[0]);

        for (String name : namesArray) {
            log.info(name);
        }

       /* Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            log.info(it.next());
        }*/
    }
}
