package by.itstep.zimin.temp;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadPoByteSymbols {

    public static void main(String[] args) throws IOException, InterruptedException {


        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(new File("1.txt"+File.separator));

            File file = new File("outputFile3.txt"+File.separator);
            file.createNewFile();
            out = new FileOutputStream(file);
            int c;
            while ((c = in.read()) != -1) {
                if (c < 65) out.write(c);//table ASCII
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadPoByteSymbols.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadPoByteSymbols.class.getName()).
                    log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadPoByteSymbols.class.getName()).
                        log(Level.SEVERE, null, ex);
            }

        }
    }
}