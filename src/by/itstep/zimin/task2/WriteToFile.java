package by.itstep.zimin.task2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    private String path;
    private String txt;

    public WriteToFile(String path, String txt) {
        this.path = path;
        this.txt = txt;
    }

    public WriteToFile() {
    }

    public String getPath() {
        return path;
    }

    public String getTxt() {
        return txt;
    }

    public void writeTxtToFile() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(getPath() + File.separator));
        bw.write(getTxt());


        bw.flush();
        bw.close();

    }

}