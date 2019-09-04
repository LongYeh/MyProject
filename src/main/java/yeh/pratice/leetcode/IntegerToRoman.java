package yeh.pratice.leetcode;

import java.util.ArrayList;

public class IntegerToRoman {
    public String intToRoman(int num) {
        String roman;
        ArrayList<String> list = new ArrayList<>();
        if(num>3999&&num<=0)
            return "outOfBounds";
        if(num/1000!=0){
            switch (num/1000){
                case 1:list.add("M");
                break;
                case 2:for(int i=0;i<2;i++){
                    list.add("M");}
                    break;

                case 3:{
                    for(int i=0;i<3;i++){
                    list.add("M");}
                    break;
                }
            }
        }
        int hun=num%1000/100;
        if(hun!=0){
            if(hun<5){
                switch (hun){
                    case 1:list.add("C");
                    case 2:{
                        list.add("C");
                        list.add("C");
                    }
                    break;
                    case 3:{
                        list.add("C");
                        list.add("C");
                        list.add("C");
                    }
                    break;
                    case 4:{
                        list.add("C");
                        list.add("D");
                    }
                    break;
                }
            }
            if(hun>=5&&hun<10){
                switch (hun){
                    case 1:list.add("D");
                    break;
                    case 2:{
                        list.add("D");
                        list.add("C");
                    }
                    break;
                    case 3:{
                        list.add("D");
                        list.add("C");
                        list.add("C");
                    }
                    break;
                    case 4:{
                        list.add("D");
                        list.add("C");
                        list.add("C");
                        list.add("C");
                    }
                    break;
                    case 5:{
                        list.add("C");
                        list.add("M");
                    }
                    break;
                }
            }
        }
            int ten=num%1000%100/10;
            if(ten<5&&ten>0){
                switch (ten){
                    case 1:list.add("X");
                    break;
                    case 2:{
                        list.add("X");
                        list.add("X");
                    }
                    break;
                    case 3:{
                        list.add("X");
                        list.add("X");
                        list.add("X");
                    }
                    break;
                    case 4:{
                        list.add("X");
                        list.add("L");
                    }
                    break;
                }
            }
            if(ten>=5&&ten<10){
                switch (ten){
                    case 5:list.add("L");
                    break;
                    case 6:{
                        list.add("L");
                        list.add("X");
                    }
                    break;
                    case 7:{
                        list.add("L");
                        list.add("X");
                        list.add("X");
                    }
                    break;
                    case 8:{
                        list.add("L");
                        list.add("X");
                        list.add("X");
                        list.add("X");
                    }
                    break;
                    case 9:{
                        list.add("X");
                        list.add("C");
                    }
                    break;
                }
            }
            int one=num%1000%100%10;
            if(one!=0){
                if(one<4){
                    for(int i=0;i<one;i++)
                        list.add("I");
                }
                if(one==4){
                    list.add("I");
                    list.add("V");
                }
                    if(one>=5&&one<9){
                        switch (one){
                            case 5:list.add("V");
                            break;
                            case 6:{
                                list.add("V");
                                list.add("I");
                            }
                            break;
                            case 7:{
                                list.add("V");
                                list.add("I");
                                list.add("I");
                            }
                            break;
                            case 8:{
                                list.add("V");
                                list.add("I");
                                list.add("I");
                                list.add("I");
                            }
                            break;
                            case 9:{
                                list.add("I");
                                list.add("X");
                            }
                            break;
                        }
                    }
            }
        roman=list.toString();


            return roman;



    }
}
