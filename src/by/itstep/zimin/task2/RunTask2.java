package by.itstep.zimin.task2;

import java.io.*;

public class RunTask2 {

    public static void main(String[] args) throws IOException {

        CreateNewFile create1 = new CreateNewFile("1.txt");
        CreateNewFile create2 = new CreateNewFile("Результат\\2.txt");

        create1.createFile();
        WriteToFile write = new WriteToFile("1.txt", "Миша ездит на Жигули, а Катя на Мерседес");
        try {
            write.writeTxtToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        CreateNewDirectory createDirectory = new CreateNewDirectory("Результат");
        createDirectory.createDirectory();
        create2.createFile();

        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("1.txt"));


        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("Результат/2.txt"));
        byte[] arrayByte = inputStream.readAllBytes();
        System.out.println(new String(arrayByte,"UTF-8"));
        String str = new String(arrayByte).replace("Жигули", "BMW") .replace("Мерседес", "Рено");
        byte[] arrayResult = str.getBytes();
        System.out.println(new String(arrayResult,"UTF-8"));
        outputStream.write(arrayResult);
        inputStream.close();
        outputStream.close();
    }

    /**
     * ЗАДАНИЕ 2. Напиши программу в которой.:
     * 1. Создайте файл “1.txt” в корне проекта и запишите с помощью потока
     * вывода фразу “Миша ездит на Жигули, а Катя на Мерседес”. (Если пока
     * сложно, можно после создания файла записать фразу руками)
     * 2. Создайте в папке с проектом папку “Результат”.
     * 3. Создайте в папке Результат файл “2.txt”.
     * 4. Откройте два потока для ввода и вывода данных. Поток для ввода
     * читает информацию из файла “1.txt” массив байт.
     * 5. Преобразуйте массив байт в тип String, замените “Жигули” на “BMW”,
     * а “Мерседес” на “Рено”.
     * 6. Запишите результат п.4 в файл “2.txt”.
     */
}
