package com.company;

import java.util.Random;

public class Main {


    public static final int SIZE_X=150;
    public static final int SIZE_Y=35;
    public static final char EMPTY=0;
    public static final char FULL= 'o';
    public static final char DIED='+';

    public static char [][] pole= new char [SIZE_Y][SIZE_X];
    public static char [][] poleD= new char [SIZE_Y][SIZE_X];

    public static void show() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++)
                System.out.print(pole[i][j]);
            System.out.println();
        }
    }
    public static int isNeighbor(int i, int j) {
        if (i < 0 || i >= SIZE_Y)
            return 0;
        if (j < 0 || j >= SIZE_X)
            return 0;
        if (pole[i][j] == EMPTY||pole[i][j]==DIED)
            return 0;
        return 1;
    }

public static void makeLoop(){
Random random = new Random();
    for (int i=0; i<SIZE_Y; i++)
        for(int j=0; j<SIZE_X; j++)
            if (pole[i][j]==FULL|| pole[i][j]==DIED)
        poleD[i][j]=DIED;
    else
        poleD[i][j]=EMPTY;
    for (int i=0; i<SIZE_Y; i++)
        for(int j=0; j<SIZE_X; j++)
    {
            int neighborAliveCount=0;
            neighborAliveCount += isNeighbor(i + 1, j + 1);
            neighborAliveCount += isNeighbor(i + 1, j);
            neighborAliveCount += isNeighbor(i + 1, j - 1);
            neighborAliveCount += isNeighbor(i, j + 1);
            neighborAliveCount += isNeighbor(i , j -1);
            neighborAliveCount += isNeighbor(i - 1, j + 1);
            neighborAliveCount += isNeighbor(i - 1, j);
            neighborAliveCount += isNeighbor(i - 1, j - 1);
            if ((pole[i][j] == EMPTY ||pole[i][j]==DIED)&&neighborAliveCount == 3)
                poleD[i][j] = FULL;
            if (pole[i][j] == FULL &&
                    (neighborAliveCount == 2 || neighborAliveCount == 3))
                poleD[i][j] = FULL;
        }
        char[][] temp=poleD;
    poleD=pole;
    pole=temp;
        }


    public static void main(String[] args) throws InterruptedException {
        Random random= new Random();
      for(int i=0; i<SIZE_Y; i++)
          for (int j = 0; j < SIZE_X; j++)
              pole[i][j]=random.nextInt(8)==0?FULL:EMPTY;
          while (true) {
              show();
              makeLoop();
              Thread.sleep(10);
          }



	// write your code here
    }
}
