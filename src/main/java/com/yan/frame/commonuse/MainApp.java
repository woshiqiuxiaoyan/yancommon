package com.yan.frame.commonuse;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws FileNotFoundException {
        try (BufferedInputStream bfis = new BufferedInputStream(new FileInputStream("E:\\test.text"))){
            System.out.println(123);
            int a  = 1_000_000;
            System.out.println(a);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

