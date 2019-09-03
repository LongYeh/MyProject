package yeh.pratice.leetcode;

public class ReverseInteger {
    private int answer;
    private String str;

    public void getReverse (int nums)
    {



            if (nums > Integer.MAX_VALUE||nums < Integer.MIN_VALUE)
                System.out.println(0);
            else if (nums < 0) {
                int n = Math.abs(nums);
                str = Integer.toString(n);
                char[] chars = str.toCharArray();
                char[] test = new char[chars.length+1];
                test[0]='-';
                System.out.print(test[0]);
                for (int i = 1; i <chars.length+1; i++) {

                    test[i] = chars[chars.length - i ];
                    System.out.print(test[i]);
                }

//                Array.getInt(test,0);
                //str = test.toString();

            } else {
                str = Integer.toString(nums);
                char[] chars = str.toCharArray();
                char[] test = new char[chars.length];

                for (int i = 0; i < chars.length; i++) {

                    test[i] = chars[chars.length - i - 1];
                    System.out.print(test[i]);
                }
                //str = test.toString();
            }
    }
}
