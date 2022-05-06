package by.itstep.zimin;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile <T>{
    private String path;
    private T data;

    public WriteToFile(String fileName,T data){
        this.path =fileName;
        this.data=data;
    }

    public WriteToFile(){}

    public void writeToFile() throws IOException {
        if (path !=null&& path !=""){
            BufferedWriter br=new BufferedWriter(new FileWriter(path));
            br.write((String) data);
            br.flush();
            br.close();

        }

    }
}
