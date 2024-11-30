package org.tictactoe.tictactoe.controller;

import org.tictactoe.tictactoe.view.View;

public class RegisterController {



    private View view;

    public RegisterController(View view) {
        this.view = view;

    }

  public void handleRegistration(String firstName, String secondName, String email, String userName, String password) {

      view.showLoginScene();
      System.out.println("New User Registered");
  }




    public void setLoginController(LoginController loginController) {
    }
}
