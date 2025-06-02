package com.example.grocerydeliveryapplication;

/**
 * @author : GadsdenS123
 * @Description :
 * @created : 2025-05-21, Wednesday
 **/
public class GroceryDeliveryAccount {
    String username;
    String password;

    public GroceryDeliveryAccount()
    { }

    public GroceryDeliveryAccount(String username)
    {
        this.username = username;
    }

    public GroceryDeliveryAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    public String toString()
    {
        String Account = this.getUsername() + "" + this.getPassword();
        return Account;
    }
}
