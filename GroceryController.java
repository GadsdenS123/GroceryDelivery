package com.example.grocerydeliveryapplication;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author : GadsdenS123
 * @Description :
 * @created : 2025-05-20, Tuesday
 **/

public class GroceryController implements Initializable {

    @FXML
    private Button btnSignUp;

    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtSignUp;

    @FXML
    private PasswordField passSignUp;

    @FXML
    private Text txtSignUpError;

    @FXML
    private Button btnSignUpEnter;

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField passLogin;

    @FXML
    private Text txtLoginError;

    @FXML
    private Button btnLoginEnter;

    AccountManager accountManager = new AccountManager();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

    }

    @FXML
    void SignUp() {
        String username = txtSignUp.getText();
        String password = passSignUp.getText();
        GroceryDeliveryAccount tmpAccount = new GroceryDeliveryAccount(username, password);
        accountManager.addAccount(tmpAccount);
        Save();
    }

    public void Save() {
        accountManager.saveAccountToTextFile("account.txt");
    }

    @FXML
    void Login() {
        String accountList = accountManager.accessAccountfromTextFile("account.txt");
        String loginInformation = txtLogin + "," + passLogin;

        if (accountList == loginInformation)
        {
            txtLoginError.setText("Login Successful");
            GroceryLauncher2.main();
        }
        else
        {
            txtLoginError.setText("Wrong username or password");
        }
    }
}

