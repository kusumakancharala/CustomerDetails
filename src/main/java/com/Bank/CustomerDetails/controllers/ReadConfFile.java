package com.Bank.CustomerDetails.controllers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Objects;
import java.util.Properties;

public class ReadConfFile {
    public static void main(String[] args) {
        Properties prop = new Properties();
        try {
            String fileName = ".conf";
            ClassLoader classLoader = WriteConfFile.class.getClassLoader();
            URL res = Objects.requireNonNull(classLoader.getResource(fileName),
                    "Can't find configuration file config.properties");
            InputStream is = new FileInputStream(res.getFile());
            prop.load(is);
            System.out.println(prop.getProperty("Name"));
            System.out.println(prop.getProperty("Designation"));
            System.out.println(prop.getProperty("Emp ID"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
