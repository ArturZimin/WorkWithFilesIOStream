package by.itstep.zimin.task3;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public class MyCollable implements Callable<Integer> {


    private String path;
    private String newPath;

    public MyCollable(String path, String newPath) {
        this.path = path;
        this.newPath = newPath;
    }

    public MyCollable() {
    }

    public String getPath() {
        return path;
    }

    public String getNewPath() {
        return newPath;
    }


    @Override
    public Integer call() throws Exception {
        Integer statistic = null;
        try {
            statistic = copyDirectory(getPath(), getNewPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return statistic;
    }

    public int copyDirectory(String sourceDirectoryLocation, String destinationDirectoryLocation) throws IOException {
        ArrayList<String> fileNames = new ArrayList<>();
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(getPath()));
        for (Path path : directoryStream) {
            fileNames.add(path.toString());
            System.out.println("The file "+path.toString()+ " contains in directory");
        }
        System.out.println("The file count: "+fileNames.size());
        int statistic=fileNames.size();

        Files.walk(Paths.get(sourceDirectoryLocation))
                .forEach(source -> {
                    Path destination = Paths.get(destinationDirectoryLocation, source.toString()
                            .substring(sourceDirectoryLocation.length()));
                    try {
                        Files.copy(source, destination);//destination -назначение
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                });
        return statistic;
    }


}
