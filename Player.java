package com.game;

public class Player
{
   public boolean test(char [][] arr , int row , int column, char ch)
   {
        int c,r;
        r = row;
        c = column;
        //all possible conditions for a point to be true. They are 12 conditions.
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
            return true;
        else
            return false;
   }
}
