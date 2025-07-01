package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
o/p
GFG
gfg
 */
public class PrintNewLine {
    private final Logger log = LogManager.getLogger(PrintNewLine.class);

    public static void main(String[] args) {
        PrintNewLine pnl = new PrintNewLine();
        pnl.checkNewLine();
    }

    void checkNewLine() {
        String s = "GFG";
        log.info("{}\ngfg", s);
    }
}
