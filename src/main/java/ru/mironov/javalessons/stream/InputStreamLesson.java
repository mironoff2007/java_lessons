package ru.mironov.javalessons.stream;

import java.io.*;

public class InputStreamLesson {

    public  static  void  main(String[] args) throws IOException {

        /*
        * JavaRush task
         */
        InputStream inputStream = System.in;

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name1 = bufferedReader.readLine();

        String name2 = bufferedReader.readLine();

        String name3 = bufferedReader.readLine();

        inputStreamReader.close();

        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}
