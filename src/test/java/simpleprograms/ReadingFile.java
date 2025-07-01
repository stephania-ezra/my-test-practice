package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {
    private final Logger log = LogManager.getLogger(ReadingFile.class);

    public static void main(String[] args) throws FileNotFoundException {
        ReadingFile rf = new ReadingFile();
        rf.readFile();
    }

    void readFile() throws FileNotFoundException {
        try {
            File file = new File("//Users//Stephania//Downloads//MyFirstFile.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String text = sc.nextLine();
                log.info("Details in the file is:{}", text);
            }
            sc.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
