package com.game;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        char plX_O;
        String plName;
        char pl2X_O;
        String pl2Name;
        String testingXOrOLength;
        Scanner plNameSc = new Scanner(System.in);
        Scanner plX_OSc = new Scanner(System.in);
        Scanner pl2NameSc = new Scanner(System.in);
        Scanner pl2X_OSc = new Scanner(System.in);
        //scan the information of player 1.
        System.Out.println("Please enter the name of player 1: ");
        plName = plNameSc.next();
        do
        {
            System.Out.println("choose 'X' or 'O' [please enter either X or O only]: ");
            testingXOrOLength = plX_OSc.next();
            if(testingXOrOLength.length() != 1)
                plX_O = 'z';
            else
                plX_O = testingXOrOLength.charAt(0);
        }while( !Helping.isXOrO(plX_O) );
        //constructing player1 object and setting the information to it.
        Player player1 = new Player(plName, plX_O);
        System.out.println();
        //scan the information of player 2.
        System.Out.println("Please enter the name of player 2: ");
        pl2Name = pl2NameSc.next();
        if( player1.getPlayerX_O() == 'x' )
        {
            pl2X_O = 'o';
            System.out.println("Player 2 you are playing with 'o'.");
        }
        else
        {
            pl2X_O = 'x';
            System.out.println("Player 2 you are playing with 'x'.");
        }
        //constructing player2 object and setting the information to it.
        Player player2 = new Player(pl2Name, pl2X_O);
        System.out.println();
        System.out.println("!!!........THE GAME STAAAARTS........!!!");
        Scanner rowSc = new Scanner(System.in);
        Scanner columnSc = new Scanner(System.in);
        boolean isWinnerFound = false;
        int row,column,revolver=1;
        int i,j;        //for iterating in for loops
        char[][] arr = new char[10][11];
        //setting the default character in the 2D array to be a space character ' '.
        for( i = 0; i < 10; i++)
            for( j = 0; j < 11; j++)
                arr[i][j] = ' ';

        String testingStringLength;
        while( (!isWinnerFound) && (revolver <= 42) )
        {
            Helping.displayArray(arr);
            //if revolver is odd, then it's player1 turn, remember it starts counting from 1.
            if(revolver % 2 == 1)
            {
                System.out.println(player1.getPlayerName());
                //entering row and column and validating that the chosen place is empty.
                do
                {
                    //entering and validating that row is an integer in range{1--->6}
                    do
                    {
                        System.out.print("Enter '" + player1.getPlayerX_O() + "' in the row: ");
                        testingStringLength = rowSc.next();
                        if( testingStringLength.length() != 1)
                            row = 100; // why row = 100 ?? 
                        else
                            row = testingStringLength.charAt(0) - 48 + 1; // need explenation !!
                    }while( !Helping.isValidRow(row) );
                    //entering and validating column is an integer in range{1--->7}
                    do
                    {
                        System.out.print("Enter '" + player1.getPlayerX_O() + "' in the column: ");
                        testingStringLength = columnSc.next();
                        if( testingStringLength.length() != 1)
                            column = 100;
                        else
                            column = testingStringLength.charAt(0) - 48 + 1;
                    }while( !Helping.isValidColumn(column) );
                }while(!Helping.isEmptyPlace(arr[row][column], row, column));
                arr[row][column] = player1.getPlayerX_O();
                isWinnerFound = player1.test(arr, row, column, player1.getPlayerX_O() );
            }
            //if revolver is even, then it's player2 turn.
            else
            {
                System.out.println(player2.getPlayerName());
                //entering row and column and validating that the chosen place is empty
                do
                {
                    //entering and validating row is in range{1--->6}
                    do
                    {
                        System.out.print("Enter '" + player2.getPlayerX_O() + "' in the row: ");
                        testingStringLength = rowSc.next();
                        if( testingStringLength.length() != 1)
                            row = 100;
                        else
                            row = testingStringLength.charAt(0) - 48 + 1;
                    }while( !Helping.isValidRow(row) );
                    //entering and validating column is in range{1--->7}
                    do
                    {
                        System.out.print("Enter '" + player2.getPlayerX_O() + "' in the column: ");
                        testingStringLength = columnSc.next();
                        if( testingStringLength.length() != 1)
                            column = 100;
                        else
                            column = testingStringLength.charAt(0) - 48 + 1;
                    }while( !Helping.isValidColumn(column) );
                }while(!Helping.isEmptyPlace(arr[row][column], row, column));
                arr[row][column] = player2.getPlayerX_O();
                isWinnerFound = player2.test(arr, row, column, player2.getPlayerX_O() );
            }
            revolver++;
            System.out.println();
        }
        //case of draw
        if(!isWinnerFound)
        {
            System.out.println();
            System.out.println("...Game Draw...");
        }
    }
}
