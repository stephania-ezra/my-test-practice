package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {
    private final Logger log = LogManager.getLogger(FileCreation.class);

    public static void main(String[] args) throws IOException {
        FileCreation fc = new FileCreation();
        fc.creatingFile();
    }

    void creatingFile() throws IOException {
        //File file = new File("//Users//stephania//Downloads//MyFirstFile.txt");
        try {
            FileWriter filewriter = new FileWriter("//Users//stephania//Downloads//MyFirstFile.txt");
            filewriter.write("My new java file creation");
            filewriter.close();
            log.info("Successfully written into the file");
        } catch (Exception e) {
            log.info("Error while creating file{}", e.getMessage());
        }
    }
}
