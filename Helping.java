package com.game;

import javax.swing.*;

public class Helping {
  
    public static void displayArray(char[][] arr)
    {
        int i,j;
        System.out.println("     (1) (2) (3) (4) (5) (6) (7)");
        System.out.println("    -----------------------------");
        for( i = 2; i <= 7; i++)
        {
            System.out.print("(" + (i-1) + ") ");
            for( j = 2; j <= 8; j++)
            {
                System.out.print("| " + arr[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
            System.out.println("    -----------------------------");
        }
    }
  
    public static void displayOutOfRange(String type)
    {
        JOptionPane.showMessageDialog(null, "....Input out of range. Enter a valid " + type +" number.");
    }
  
    public static void displayOccupiedPlace(int r, int c)
    {
        JOptionPane.showMessageDialog(null,  "Row: " + (r-1) +  " & Column: " + (c-1) + " is occupied. Please choose another place." );
    }
  
}
