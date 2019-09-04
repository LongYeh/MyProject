package yeh.pratice.leetcode;

public class RomanToInteger {
    public int romanToInt(String s) {
        s.toUpperCase();
        int integer=0;
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            //尾數4和9的判斷
           if(chars[i]=='I'&&i+1<chars.length)
           {
               if(chars[i+1]=='V')
               {integer-=1;
           continue;}
           }
           if(chars[i]=='I'&&i+1<chars.length)
           {
               if(chars[i+1]=='X')
               {integer-=1;
                   continue;}
           }
            if(chars[i]=='I'&&i+1<chars.length){
                if(chars[i+1]=='L')
                {integer-=1;
                    continue;}
            }
            if(chars[i]=='I'&&i+1<chars.length){
                if(chars[i+1]=='C')
                {integer-=1;
                    continue;}
            }
            if(chars[i]=='I'&&i+1<chars.length){
                if(chars[i+1]=='D')
                {integer-=1;
                    continue;}
            }
            if(chars[i]=='I'&&i+1<chars.length){
                if(chars[i+1]=='M')
                {integer-=1;
                    continue;}
            }
            //40和90的判斷
           if(chars[i]=='X'&&i+1<chars.length){
               if(chars[i+1]=='L')
               {integer-=10;
                   continue;}
           }
           if(chars[i]=='X'&&i+1<chars.length){
               if(chars[i+1]=='C')
               {integer-=10;
                   continue;}
           }
           //400和900的判斷
           if(chars[i]=='C'&&i+1<chars.length){
               if(chars[i+1]=='D')
               {integer-=100;
                   continue;}
           }
            if(chars[i]=='C'&&i+1<chars.length){
                if(chars[i+1]=='M')
                {integer-=100;
                    continue;}
            }

           switch (chars[i]){
               case'I':integer+=1;
               break;
               case 'V':integer+=5;
               break;
               case 'X':integer+=10;
               break;
               case 'L':integer+=50;
               break;
               case 'C':integer+=100;
               break;
               case 'D':integer+=500;
               break;
               case 'M':integer+=1000;
               break;
               default:integer=0;
           }




    }
        if(integer>0&&integer<=3999)
            return integer;
        else
            return 0;
    }
}
