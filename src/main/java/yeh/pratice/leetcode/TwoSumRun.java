package yeh.pratice.leetcode;

public class TwoSumRun {
    public static void main(String[] args) {
        int [] nums={1,8,5,7};
        int target=9;
        TwoSum twoSum=new TwoSum();
        int []test=twoSum.Target(nums,target);
        for(int i=0;i<test.length;i++){
            System.out.println(test[i]);
        }

    }
}
