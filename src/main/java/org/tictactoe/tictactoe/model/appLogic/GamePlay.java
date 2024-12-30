package org.tictactoe.tictactoe.model.appLogic;

import javax.swing.*;

/**Class to handle the player turn management and the moves of the players
int 1;
int 2

once player 1  then swith player to 2
Until the board is full or a player wins

 Check if the board is full :
    All i or j are not null;

 Check if player has won:
    Check if any row has all i or j are equal
    Check if any column has all i or j are equal
    Check if any diagonal has all i or j are equal

 check available moves by knowing the status of the table at all times.
    After each play check if the board is full or if a player has won.
 */
public class GamePlay {
    char array[][] = new char[3][3];

    //Method to check if the board is full
    public boolean checkFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    //Method to check if a player has won
     boolean checkWin() {
        //Check if any row has all i or j are equal
        for (int i = 0; i < 3; i++) {
            if (array[i][0] == array[i][1] && array[i][1] == array[i][2] && array[i][0] != ' ') {
                return true;
            }
        }
        //Check if any column has all i or j are equal
        for (int j = 0; j < 3; j++) {
            if (array[0][j] == array[1][j] && array[1][j] == array[2][j] && array[0][j] != ' ') {
                return true;
            }
        }
        //Check if any diagonal has all i or j are equal
        if (array[0][0] == array[1][1] && array[1][1] == array[2][2] && array[0][0] != ' ') {
            return true;
        }
        if (array[0][2] == array[1][1] && array[1][1] == array[2][0] && array[0][2] != ' ') {
            return true;
        }
        return false;
    }

    boolean checkDraw() {
        return checkFull() && !checkWin();
    }

    public int switchPlayer(int player) {
        checkWin();

        if (checkWin()) {
            return player;
        }
        if (checkDraw()) {
            return 0;
        }
        if (player == 1) {
            player = 2;
        } else {
            player = 1;
        }

        return player;
    }
}
/**
gameboard {
    int currentPlayer = 1;
    int status = 0;
    status = switchPlayer(currentplayer);

    if status == 0{
        //draw and game ends
        } else if (status == currentPlayer) {
        //current player has won
        }


 represent playing table as 2d array
 {
 [x] [o] []
 [] [] []
 [] [] []
 }
 rows i
 columns j
 [i][j]
*/