package yeh.works.accounting;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class AccountingRun {
    public static void main(String[] args)throws IOException {
//        使用者輸入
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer=new FileWriter("Account.txt",true);
        String item;
        String cost="0";
        System.out.println("date: ");
        String date=input.readLine();
        LocalDate localDate=LocalDate.parse(date);
        writer.write("date: "+localDate+"\n\r");
        do {
            System.out.println("item:");
            item=input.readLine();
            System.out.println("cost:");
            cost=input.readLine();
//        寫入檔案
            writer.write("item: "+item+" ");
            writer.write("cost: "+cost);
            writer.write("\n\r");
        }while(item.length()>1);
//        如何存檔?
        writer.flush();
        writer.close();
    }
//    如何表格建立?
//    花費加總
}
