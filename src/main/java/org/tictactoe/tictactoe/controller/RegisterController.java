package org.tictactoe.tictactoe.controller;

import javafx.stage.Stage;
import org.tictactoe.tictactoe.view.Registration;
import org.tictactoe.tictactoe.view.View;

import javax.swing.*;
import java.awt.*;

public class RegisterController {



    private View view;

    public RegisterController(View view) {
        this.view = view;

    }

  public void handleRegistration(String firstName, String secondName, String email, String password) {

      view.showHomeScene();
      System.out.println("New User Registered");
  }




    public void setLoginController(LoginController loginController) {
    }
}
