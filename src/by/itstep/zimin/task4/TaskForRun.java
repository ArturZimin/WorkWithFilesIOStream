package by.itstep.zimin.task4;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskForRun {

    public static void main(String[] args) throws IOException, InterruptedException {
        String wordsForbidden=System.getProperty("user.dir")+File.separator+"forbiddenWords.txt";
        File file=new File(wordsForbidden);
        file.createNewFile();
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(wordsForbidden));
        bufferedWriter.write("Hello,day,house");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the path to directory!");
        String path = br.readLine();
        System.out.println("Enter the word for search!");
        String word = br.readLine();
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        thread2.setName("Cut");
        thread1.setName("Find");
        thread1.start();
        thread1.join();
        thread2.start();
        br.close();


    }
}

/**
 * Задание 4
 * Пользователь с клавиатуры вводит путь к существующей
 * директории и слово для поиска. После чего запускаются
 * два потока. Первый должен найти файлы, содержащие
 * искомое слово и слить их содержимое в один файл. Второй
 * поток ожидает завершения работы первого потока. После
 * чего проводит вырезание всех запрещенных слов (список
 * этих слов нужно считать из файла с запрещенными словами) из полученного файла.
 * В методе main необходимо
 * отобразить статистику выполненных операций.
 */
