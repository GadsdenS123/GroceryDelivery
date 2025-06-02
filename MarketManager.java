package com.example.grocerydeliveryapplication;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;

/**
 * @author : GadsdenS123
 * @Description :
 * @created : 2025-06-01, Sunday
 **/
public class MarketManager {
    private ObservableList<Item> items = FXCollections.observableArrayList();
    private ObservableList<Location> location = FXCollections.observableArrayList();

    public void addItem(Item item) {
        boolean exists = false;
        for (Item c : items) {
            if (c.getItemName() == item.getItemName()) {
                exists = true;
                break;
            }
        }
        if (!exists) { // sinon on peut afficher un message pour dire que ça n'a pas été ajouté
            items.add(item);
        }
    }

    public void saveItemsToTextFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Item item : items) {
                writer.println(item.getItemName() + "," + item.getItemPrice());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<Item> getItems() {
        return items;
    }

    public void addLocation(Location destination) {
        boolean exists = false;
        for (Location c : location) {
            if (c.getLocation() == destination.getLocation()) {
                exists = true;
                break;
            }
        }
        if (!exists) { // sinon on peut afficher un message pour dire que ça n'a pas été ajouté
            location.add(destination);
        }
    }
}
