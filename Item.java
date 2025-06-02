package com.example.grocerydeliveryapplication;

/**
 * @author : GadsdenS123
 * @Description :
 * @created : 2025-06-01, Sunday
 **/
public class Item {
    String itemName;
    int itemPrice;

    public Item()
    { }

    public Item(String itemName)
    {
        this.itemName = itemName;
    }

    public Item(String itemName, int itemPrice)
    {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName()
    {
        return itemName;
    }

    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    public int getItemPrice()
    {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice)
    {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString()
    {
        String item = this.getItemName() + "," + this.getItemPrice();
        return item;
    }
}
