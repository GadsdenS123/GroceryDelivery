package com.example.grocerydeliveryapplication;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author : GadsdenS123
 * @Description :
 * @created : 2025-06-01, Sunday
 **/

public class GroceryController2 implements Initializable {

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnConfirm;

    @FXML
    private Button btnPay;

    @FXML
    private ComboBox<?> cboItem;

    @FXML
    private TextField txtAmount;

    @FXML
    private TextField txtLocation;

    MarketManager marketManager = new MarketManager();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    { }

    public void Save2()
    {
        marketManager.saveItemsToTextFile("items.txt");
    }

    @FXML
    void AddItem()
    {
        String itemName = cboItem.itemsProperty().getName();
        int itemPrice = Integer.parseInt(txtAmount.getText());
        Item tmpitem = new Item(itemName, itemPrice);
        marketManager.addItem(tmpitem);
        Save2();
        ClearAll();
    }

    void ClearAll()
    {
        cboItem.setItems(null);
        txtAmount.setText("");
        btnAdd.setDisable(false);
    }

    public void Save3()
    {
        marketManager.saveLocationToTextFile("location.txt");
    }

    @FXML
    void AddLocation()
    {
        String location = txtLocation.getText();
        Location tmplocation = new Location(location);
        marketManager.addLocation(tmplocation);
        Save3();
    }
}