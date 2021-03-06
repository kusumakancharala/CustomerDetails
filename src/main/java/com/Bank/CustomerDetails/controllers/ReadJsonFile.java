package com.Bank.CustomerDetails.controllers;

import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;
public class ReadJsonFile {
    public static void main(String args[]) {
        JSONParser jsonParser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("C:\\Users\\kusumak\\Desktop\\NewCustomer\\customerdetails\\output.json"));
            String id = (String) jsonObject.get("ID");
            String first_name = (String) jsonObject.get("First_Name");
            String last_name = (String) jsonObject.get("Last_Name");
            String date_of_birth = (String) jsonObject.get("Date_Of_Birth");
            String place_of_birth = (String) jsonObject.get("Place_Of_Birth");
            String country = (String) jsonObject.get("Country");
            //Forming URL
            System.out.println("Contents of the JSON are: ");
            System.out.println("ID :"+id);
            System.out.println("First name: "+first_name);
            System.out.println("Last name: "+last_name);
            System.out.println("Date of birth: "+date_of_birth);
            System.out.println("Place of birth: "+place_of_birth);
            System.out.println("Country: "+country);
            System.out.println(" ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
