package com.game;

public class Player {
    private String playerName = "";
    private char playerX_O;

    public Player(String playerName, char playerX_O)
    {
        this.playerName = playerName;
        this.playerX_O = playerX_O;
    }
    public String getPlayerName()
    {
        return playerName;
    }
    public char getPlayerX_O()
    {
        return playerX_O;
    }
    public void displayWinMessage()
    {
        System.out.println();
        System.out.println("..........................................");
        System.out.println(":Congratulations " + playerName + ". You won the game:");
        System.out.println("..........................................");
    }
    public boolean test(char [][] arr , int row , int column, char ch)
    {
        int c,r;
        r = row;
        c = column;
        if( (arr[r-2][c] == ch && arr[r-1][c] == ch) ||
                (arr[r+1][c] == ch && arr[r+2][c] == ch) ||
                (arr[r][c-2] == ch && arr[r][c-1] == ch) ||
                (arr[r][c+1] == ch && arr[r][c+2] == ch) ||
                (arr[r-1][c+1] == ch && arr[r-2][c+2] == ch) ||
                (arr[r+1][c+1] == ch && arr[r+2][c+2] == ch) ||
                (arr[r-2][c-2] == ch && arr[r-1][c-1] == ch) ||
                (arr[r+1][c-1] == ch && arr[r+2][c-2] == ch) ||
                (arr[r][c-1] == ch && arr[r][c+1] == ch) ||
                (arr[r-1][c] == ch && arr[r+1][c] == ch) ||
                (arr[r-1][c+1] == ch && arr[r+1][c-1] == ch) ||
                (arr[r-1][c-1] == ch && arr[r+1][c+1] == ch)  )
        {
            Helping.displayArray(arr);
            this.displayWinMessage();
            return true;
        }
        else
            return false;
    }
}
