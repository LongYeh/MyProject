package yeh.pratice.guess;

import java.util.Scanner;

public class OXGameClone {
    public static void display(int[][] game) {
        for(int i = 0; i < game.length;i++) {
            System.out.println("-------");
            for(int j = 0; j < game[0].length; j ++) {
                if(game[i][j] == 1)
                    System.out.print("|X");
                else if(game[i][j] == 2)
                    System.out.print("|O");
                else
                    System.out.print("| ");
            }
            System.out.println("|");

        }
        System.out.println("-------");
    }

    //記錄並檢驗一個人下棋
    public static void people (int[][] game, char[] word, int i) {
        Scanner input = new Scanner(System.in);
        int row,column;
        System.out.printf("Enter a row (0, 1 or 2) for Player %c :",word[i]);
        row = input.nextInt();
        System.out.printf("Enter a column (0, 1 or 2) for Player %c :",word[i]);
        column = input.nextInt();
        if(i == 0 && game[row][column] == 0)
            game[row][column] = 1;
        else if(i == 1 && game[row][column] == 0)
            game[row][column] = 2;
        else {
            System.out.println("error！");
            System.exit(0);
        }
        display(game);
    }

    //檢測勝負
    public static void check(int[][] game) {
        int i = 0;
        boolean row = game[i][0] == game[i][1] && game[i][0] == game[i][2] && game[i][0] > 0;
        boolean column = game[0][i] == game[1][i] && game[0][i] == game[2][i] && game[0][i] > 0;
        boolean leftDown = game[0][0] == game[1][1] && game[1][1] == game[2][2] && game[1][1] > 0;
        boolean rightDown = game[0][2] == game[1][1] && game[1][1] == game[2][0] && game[1][1] > 0;
        if(row || column) {
            for(i = 0; i < game.length; i++) {
                if(game[i][i] == 1) {
                    System.out.println("player X win! 遊戲結束");
                    System.exit(0);
                }
                else if(game[i][i] == 2){
                    System.out.println("player O win! 遊戲結束");
                    System.exit(0);
                }
            }

        }

        if(leftDown || rightDown) {
            if(game[1][1] == 1) {
                System.out.println("player X win! 遊戲結束");
                System.exit(0);
            }
            else if(game[1][1] == 2){
                System.out.println("player O win! 遊戲結束");
                System.exit(0);
            }
        }
    }

    //執行
    public static void run(int[][] game) {
        char[] word = {'X','O'};
        int i = 0, count = 0;
        while(count < 10) {
            people(game,word,i);
            check(game);
            count++;
            if(count%2 == 1)
                i++;
            else
                i--;
            if(count == 9) {
                System.out.println("平局，遊戲結束！");
                System.exit(0);
            }
        }
    }
}
