package by.itstep.zimin.task2;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {


    private String fileNameAndPath;

    public CreateNewFile(String fileNameAndPath) {
        this.fileNameAndPath = fileNameAndPath;
    }

    public CreateNewFile() {
    }

    public String getFileName() {
        return fileNameAndPath;
    }


    public boolean createFile() {
        boolean isCreated = false;
        File file = new File(getFileName() + File.separator);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            isCreated = true;
        }
        return isCreated;
    }
}
