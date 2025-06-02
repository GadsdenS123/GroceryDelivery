package com.example.grocerydeliveryapplication;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;

/**
 * @author : GadsdenS123
 * @Description :
 * @created : 2025-05-21, Wednesday
 **/
public class AccountManager {
    private ObservableList<GroceryDeliveryAccount> account = FXCollections.observableArrayList();

    public void addAccount(GroceryDeliveryAccount groceryDeliveryAccount) {
        boolean exists = false;
        for (GroceryDeliveryAccount c : account) {
            if (c.getUsername() == groceryDeliveryAccount.getUsername()) {
                exists = true;
                break;
            }
            if (!exists) {
                account.add(groceryDeliveryAccount);
            }
        }
    }

    public void saveAccountToTextFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (GroceryDeliveryAccount groceryDeliveryAccount : account) {
                writer.println(groceryDeliveryAccount.getUsername() + "," + groceryDeliveryAccount.getPassword());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String accessAccountfromTextFile(String fileName)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] parts = line.split(",");
                String username = parts[0];
                String password = parts[1];
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return account.toString();
    }
}