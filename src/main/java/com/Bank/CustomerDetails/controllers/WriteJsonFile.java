package com.Bank.CustomerDetails.controllers;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJsonFile {
    public static void main(String args[]) {
        //Creating a JSONObject object
        JSONObject jsonObject = new JSONObject();
        //Inserting key-value pairs into the json object
        jsonObject.put("ID", "1");
        jsonObject.put("First_Name", "Kusuma");
        jsonObject.put("Last_Name", "k");
        jsonObject.put("Date_Of_Birth", "11-10-1999");
        jsonObject.put("Place_Of_Birth", "Nellore");
        jsonObject.put("Country", "India");

        JSONArray listOfStates = new JSONArray();
        listOfStates.add("Madhya Pradesh");
        listOfStates.add("Maharastra");
        listOfStates.add("Rajasthan");

        jsonObject.put("States", listOfStates);

        try {
            FileWriter file = new FileWriter("C:\\Users\\kusumak\\Desktop\\NewCustomer\\customerdetails\\output.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("JSON file created: "+jsonObject);
    }
}
