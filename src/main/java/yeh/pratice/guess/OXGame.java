package yeh.pratice.guess;

import java.util.Scanner;

public class OXGame  {
    String O="O";
    String X="X";
    int x,y,set,num=0;
    String[][] OXGame=new String[3][3];
    public void nineTable(){

    }

    public void playGame(){
        for(int i=1;i<10;i++){
            Scanner play1=new Scanner(System.in);
        Scanner play2=new Scanner(System.in);
        System.out.println("play1 enter 0<=x<3: ");
        int x=play1.nextInt();
        System.out.println("play1 enter 0<=y<3: ");
        int y=play1.nextInt();
        System.out.println("play1 enter 1: ");
        int ox=play1.nextInt();
        if(OXGame[x][y]!=null||ox!=1)
            continue;
            else
                gameRule(x,y,ox);
        System.out.println("play2 enter 0<=x<3: ");
        x=play2.nextInt();
        System.out.println("play2 enter 0<=y<3: ");
        y=play1.nextInt();
        System.out.println("play2 enter 2: ");
        ox=play1.nextInt();
        gameRule(x,y,ox);
            if(OXGame[x][y]!=null||ox!=2)
            {System.out.println("mistake");
                continue;}
            else
                gameRule(x,y,ox);
        }
    }

    public void gameRule(int x,int y,int set){
        this.x=x;
        this.y=y;
        this.set=set;

            switch (this.set) {
                case 1:
                    OXGame[this.x][this.y] = O;
                    System.out.println(OXGame[this.x][this.y]);
                    break;
                case 2:
                    OXGame[this.x][this.y] = X;
                    System.out.println(OXGame[this.x][this.y]);
                    break;
                default:
                    ;
            }

    }

}
