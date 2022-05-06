package by.itstep.zimin;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        CreateNewFile createFile = new CreateNewFile("file.txt");
        createFile.createFile();


        String txt = "How are you?";
        WriteToFile wf = new WriteToFile("file.txt", txt);
        wf.writeToFile();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file path to display content!  ");
        String path = "";
        try {
            path = br.readLine();
            ReadFromFile readFromFile = new ReadFromFile(path);
            readFromFile.readFile();
        } catch (IOException e) {
            System.out.println("The path is wrong!Try again!");

        }


        br.close();


    }
}

/**
 * ЗАДАНИЕ 1. Пользователь с клавиатуры вводит путь к файлу. После чего
 * содержимое файла отображается на экране.
 */

