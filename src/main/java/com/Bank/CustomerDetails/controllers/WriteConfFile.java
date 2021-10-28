package com.Bank.CustomerDetails.controllers;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteConfFile {
    public static void main( String[] args )
    {
        Properties prop = new Properties();

        try {
            //set the properties value
            prop.setProperty("Name", "Kusuma");
            prop.setProperty("Designation", "Graduate SDE");
            prop.setProperty("Emp ID", "5073");

            //save properties to project root folder
            prop.store(new FileOutputStream("C:\\Users\\kusumak\\Desktop\\NewCustomer\\customerdetails\\src\\main\\resources\\.conf"), null);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
