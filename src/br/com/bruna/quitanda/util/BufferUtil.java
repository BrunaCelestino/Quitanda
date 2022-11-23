package br.com.bruna.quitanda.util;

import java.io.*;

public class BufferUtil<T> {
    public  void writeFile(T t, String fileName) {


        String path = "src/resources/" + fileName + ".txt";

        try (BufferedWriter csvWriter = new BufferedWriter(new FileWriter(path, true))) {


            csvWriter.write(t.toString());
            csvWriter.newLine();


        } catch (
                IOException e) {
            System.out.println("error:" + e.getMessage());
        }

    }

    public static void readFile (String path) {
        try (BufferedReader file = new BufferedReader(new FileReader(path))) {
            String row = file.readLine();
            System.out.println(row);
            while (row != null) {
                row = file.readLine();
                if(row != null) {
                    System.out.println(row);
                }
            }


        } catch (
                IOException e) {
            System.out.println("error:" + e.getMessage());
        }
    }
}
