package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrintEven {
    private final Logger log = LogManager.getLogger(PrintEven.class);

    public static void main(String[] args) {
        PrintEven wl = new PrintEven();
        wl.checkNested();
    }

    void checkNested() {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "," + j + " ");
            }
        }
    }
}