package by.itstep.zimin.task4;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Objects;

public class MyRunnable implements Runnable {
    private Path path;
    private Path pathForbidden;
    private String one;

    public MyRunnable(Path path, Path pathForbidden) {
        this.pathForbidden = pathForbidden;
        this.path = path;
    }

    public MyRunnable() {
    }

    public Path getPath() {
        return path;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyRunnable that = (MyRunnable) o;
        return Objects.equals(path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path);
    }

    @Override
    public void run() {
        BufferedReader readFile = null;
        BufferedReader readWords = null;
        BufferedWriter write = null;
        ArrayList<String> filesNames = new ArrayList<String>();
        ArrayList<String> findWords = new ArrayList<String>();
        this.one = Thread.currentThread().getName();
        if (Thread.currentThread().getName().equals("Find")) {
            try {
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(getPath());
                for (Path path : directoryStream) {
                    filesNames.add(path.toString());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            int countFiles = filesNames.size();
            try {
                readFile = new BufferedReader(new FileReader(filesNames.get(countFiles) + File.separator));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            String readN = new String(readFile.toString());
            try {
                readWords = new BufferedReader(new FileReader("forbiddenWords.txt" + File.separator));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            String readWordsForbidden = new String(readWords.toString());
            String [] wordsForbidden=readWordsForbidden.split(",");
            while (countFiles > 0) {

                for (int i = 0; i < wordsForbidden.length; i++) {
                    if (readN.contains(wordsForbidden[i])){

                    }
                }
            }


        }

    }
}
