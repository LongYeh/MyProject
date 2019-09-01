package yeh.pratice.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        //map
        HashMap<String, String> stocks=new HashMap<>();
        stocks.put("2330","台積電");
        stocks.put("2317","鴻海");
        stocks.put("2330","tsmc");
        System.out.println(stocks.get("2330"));
        System.out.println(stocks);
        for(String key:stocks.keySet()){
            System.out.println(stocks.get(key));
        }

        //set();
        //list();
    }

    public static void set() {
        //set
        //HashSet不排序,不重複
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(6);
        set.add(10);
        //set.add(10);
        System.out.println(set);
        for(int n:set){
            System.out.println(n);
        }
    }

    public static void list() {
        //list 特性 順序,索引,重複性
        ArrayList<Integer> list=new ArrayList();
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(1);
        System.out.println(list);
        int n1=list.get(0);
        System.out.println(list.size());
        List<Integer> score= Arrays.asList(68,55,77,88,90);
        for(int n:score){
            System.out.println(n);
        }
        //String str=(String)list.get(2);
        int[] number=new int[5];
        number[0]=5;
        number[4]=3;
        //number[5]=6;
        /*int[] score={68,88,90,67,99};
        System.out.println(score);
        for(int i=0;i<5;i++){
            System.out.println(score[i]);
        }*/
        //for each =for(資料型態 名稱:物件)
        for(int n:score){
            System.out.println(n);
        }
    }
}
