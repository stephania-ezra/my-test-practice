package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class FileMethodsLearn {
    private final Logger log = LogManager.getLogger(FileMethodsLearn.class);

    public static void main(String[] args) {
        FileMethodsLearn fml = new FileMethodsLearn();
        fml.checkFileMethods();
    }

    void checkFileMethods() {
        File file = new File("//Users//Stephania//Downloads//MyFirstFile.txt");
        if(file.exists()) {
            log.info("Name of the File:{}", file.getName());
            log.info("Path of the file is:{}", file.getAbsolutePath());
            log.info("File Readable:{}", file.canRead());
            log.info("File write:{}", file.canWrite());
            log.info("Length of the file is:{}", file.length());
        }else{
            log.info("no file available");
        }
    }
}
