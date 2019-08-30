package yeh.pratice;

public class First {
    public static void main(String[] args) {

        Person p=new Person("chen long yeh",66.5,1.77);
        String str="hello";
        char ch=str.charAt(3);
        System.out.println(ch);
        System.out.println(str.length());
        String K=str.substring(3);
        System.out.println(K);
        /*p.height=1.77;
        p.weight=66.6;
        p.name="chen long yeh";*/
        p.show(70,20,"chen long yeh");
        p.show();

        int score=90;
        System.out.println(score>60);
        char B='B';
        System.out.println(B>60);




    }
}
