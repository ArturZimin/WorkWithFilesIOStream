package by.itstep.zimin;

import java.io.*;

public class ReadFromFile {

   private String path;

    public ReadFromFile(String path) {
        this.path = path;
    }

    public ReadFromFile() {
    }


    public void readFile() throws IOException {

        File file = new File(path+File.separator);
        System.out.println(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

           while ((line=br.readLine())!=null){
               System.out.println(line);
           }

        br.close();

    }
}
