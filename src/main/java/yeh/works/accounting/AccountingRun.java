package yeh.works.accounting;

import java.util.Scanner;

public class AccountingRun {
    public static void main(String[] args) {
        String item,date,select;
        int money,total=0;
        Scanner Yeh=new Scanner(System.in);
        System.out.println("enter the date:(yyyy/mm/dd) ");
        date=Yeh.next();
        System.out.println("enter the item name: ");
        item=Yeh.next();
        System.out.println("enter the item money: ");
        money=Yeh.nextInt();
        total+=money;
        System.out.println(date+" cost= "+total+" dollar");


    }
}
