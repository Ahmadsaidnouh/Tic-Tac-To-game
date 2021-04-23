package com.game;

public class Helping 
{
    public static void displayArray(char[][] arr)
    {
        int i,j;
        System.out.println("     (1) (2) (3) (4) (5) (6) (7)");
        System.out.println("    -----------------------------");
        for( i = 2; i <= 7; i++)
        {
            System.out.print("(" + (i+1) + ") ");
            for( j = 2; j <= 8; j++)
            {
                System.out.print("| " + arr[i][j] + " | ");
            }
            //System.out.print("|");
            //System.out.println();
            System.out.println("    -----------------------------");
        }
    }
    public static boolean isValidRow(int row)
    {
        if( row < 2 || row > 7 )
        {
            System.out.println("....ERROR....(OUT OF RANGE) or (NOT INTEGER TYPE) Input. Enter a valid row number please.");
            return false;
        }
        else
            return true;
    }
    public static boolean isValidColumn(int column)
    {
        if( column < 2 || column > 8 )
        {
            System.out.println("....ERROR....(OUT OF RANGE) or (NOT INTEGER TYPE) Input. Enter a valid column number please.");
            return false;
        }
        else
            return true;
    }
    public  static boolean isXOrO(char ch)
    {
        if( ch == 'x' || ch == 'o' )
            return true;
        else
        {
            System.out.println("....ERROR.... You can choose either 'x' or 'o' only. Choose again please.");
            return false;
        }
    }
    public  static boolean isEmptyPlace(char ch, int row, int column)
    {
        if( ch != ' ' )
        {
            System.out.println("Row: " + (row+1) +  " & Column: " + (column+1) + " is occupied. Please choose another place." );
            return false;
        }
        else
            return true;
    }
}
