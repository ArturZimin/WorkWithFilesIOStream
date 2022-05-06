package by.itstep.zimin.task2;

import java.io.File;

public class CreateNewDirectory {
    private String pathAndNameDirectory;

    public CreateNewDirectory(String pathAndNameDirectory) {
        this.pathAndNameDirectory = pathAndNameDirectory;
    }

    public CreateNewDirectory() {
    }

    public String getPathAndNameDirectory() {
        return pathAndNameDirectory;
    }

    public boolean createDirectory() {
        boolean flag = false;
        File file = new File(getPathAndNameDirectory() + File.separator);
        flag = file.mkdir();
        return flag;
    }
}
