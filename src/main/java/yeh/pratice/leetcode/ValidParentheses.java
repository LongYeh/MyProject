package yeh.pratice.leetcode;

public class ValidParentheses {
    public boolean isValid(String s) {

        boolean answer=false;
        String parentheses=s;

        String[] strings=parentheses.split(parentheses);
        String[] pt={"{","}","[","]","(",")"};
        

        if(parentheses.length()>0&&parentheses.length()<=2){
            if(parentheses.indexOf("{}")>=0||parentheses.indexOf("[]")>=0||parentheses.indexOf("()")>=0)
                return answer=true;
            else
                return answer;
        }


        return answer;

    }
}
