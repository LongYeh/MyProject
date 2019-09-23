package yeh.pratice.leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;

        /*if(strs==null)
            prefix="";


        for(int i=0;i<strs.length;i++){
            if(strs[i]==""){
                prefix="";
                break;
            }
            else
            if(strs[i].length()<2&&strs[0].equals(strs[i]))
                prefix=strs[0];
            else
            if(strs[i].length()>2&&strs[0].substring(0,2).equals(strs[i].substring(0,2)))
                prefix=strs[0].substring(0,2);
            else
            if(strs[i].length()==2&&strs[0].equals(strs[i]))
                prefix=strs[0];
            else
            {
                prefix="";
                break;
            }
        }*/

        /*String[] sub = new String[strs.length];
        if (strs != null ) {

            if(strs.length==1)
                for(int i=0;i<1;i++){
                    if(strs[0].matches("[a-z]*")&&strs[0]!="")
                        prefix=strs[0];
                    break;
                }




            for (int i = 0; i < strs.length; i++) {
                if (strs[i].matches("[a-z]*") == true && strs[i].length() >= 3 && strs[i] != "") {
                    sub[i] = strs[i].substring(0, 2);
                    if(sub[0].equals(sub[i])==true)
                        prefix=sub[0];
                    else
                        prefix="";
                        break;
                } else {
                    break;
                }
            }
            }*/

    }
}
