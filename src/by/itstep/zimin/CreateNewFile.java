package by.itstep.zimin;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

    private String filePathName;

    public CreateNewFile(String filePathName) {
        this.filePathName = filePathName;
    }

    public CreateNewFile() {
    }

    public File createFile() {
        File file = new File(filePathName);

        if (!file.exists()) {
            try {

                file.createNewFile();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("The file had already existed ");
            return file;
        }
        return file;
    }
}
