package yeh.pratice.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<=10;i++){
            sum+=i;
        }
        System.out.println(sum);
        int unknown=new Random().nextInt(10)+1;
        System.out.println(unknown);
        Scanner scanner=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            System.out.println("please enter number: ");
        int number=scanner.nextInt();
        System.out.println("No."+i+" turn");
        if(number==unknown){
            System.out.println("bingo");
            break;
        }
        }
        System.out.println("end");
    }
}
