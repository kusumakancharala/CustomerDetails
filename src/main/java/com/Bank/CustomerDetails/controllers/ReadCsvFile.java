package com.Bank.CustomerDetails.controllers;

import com.opencsv.CSVReader;
import java.io.FileReader;

public class ReadCsvFile {
    private static final String CSV_FILE_PATH
            = "C:\\Users\\kusumak\\Desktop\\NewCustomer\\CustomerDetails\\result.csv";

    public static void main(String[] args)
    {

        System.out.println("Read Data Line by Line With Header \n");
        readDataLineByLine(CSV_FILE_PATH);
        System.out.println("_______________________________________________");

    }

    public static void readDataLineByLine(String file)
    {

        try {
            FileReader filereader = new FileReader(file);
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;

            while ((nextRecord = csvReader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
