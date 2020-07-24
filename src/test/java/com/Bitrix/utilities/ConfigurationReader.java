package com.Bitrix.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1- We create properties object
    private static Properties properties = new Properties();

    static{ // static yaptik cunku direk yazamayiz method veya block icinde olmak zorunda
        //2- get the path and store in Sting, or directly pass into fileInputStream obj
        String path = "configuration.properties";

        try {
            //3- we need to open the file
            FileInputStream file = new FileInputStream(path); // Error verdiginden try-catch yaptik.
            //4- we need to load the file properties object
            properties.load(file);

            //5- close.file
            file.close();

        } catch (IOException e) { // Exception hepsini kapsar
            System.out.println("Properties file not found");
        }
    }
    // our own custom method to read and get values from configuration.properties file
    public static String getProperty(String keyWord){ // buradaki getproperties bizim kendi methodumuz
        return properties.getProperty(keyWord); // bu java getproperties methoddan geliyor.
        //**GETTER METHOD** BECAUSE PROPERTIES IS PRIVATE ON TOP
    }
}
