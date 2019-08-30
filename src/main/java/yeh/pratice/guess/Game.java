package yeh.pratice.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int secret= new Random().nextInt(10)+1;
        Scanner scanner=new Scanner(System.in);
        int number=1;
        while (number!=secret){
            System.out.println("please enter a number: ");
        number =scanner.nextInt();
        if(number>secret)
        System.out.println("to big");
        else if(number<secret)
            System.out.println("to small");
        }
        System.out.println("bingo!!! secret number= "+number);
    }
}
