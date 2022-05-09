package by.itstep.zimin.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WorkWithDirectory {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the path of exist directory!");
        String pathExistDirectory = br.readLine();
        System.out.println("Enter the path of new  directory!");
        String pathNewDirectory = br.readLine();
        MyCollable myCollable = new MyCollable(pathExistDirectory, pathNewDirectory);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> result= executorService.submit(myCollable) ;
        executorService.shutdown();
        br.close();


    }


}

/**
 * Задание 3
 * Пользователь с клавиатуры вводит путь к существующей директории и к новой директории.
 * После чего запускается поток, который должен скопировать содержимое
 * директории в новое место. Необходимо сохранить структуру директории.
 * В методе main необходимо отобразить
 * статистику выполненных операций.
 */
