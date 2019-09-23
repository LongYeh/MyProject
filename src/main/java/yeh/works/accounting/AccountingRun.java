package yeh.works.accounting;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class AccountingRun {
    public static void main(String[] args)throws IOException {
//        使用者輸入
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer=new FileWriter("Account.txt");
        String item="0";
        String cost="0";
        do {
            System.out.println("item:");
            item=input.readLine();
            System.out.println("cost:");
            cost=input.readLine();
//        寫入檔案
            writer.write("item: "+item+" ");
            writer.write("cost: "+cost);
        }while(Integer.parseInt(cost)!=0);
//        如何存檔?
        writer.close();
    }
//    如何表格建立?
//    花費加總
}
