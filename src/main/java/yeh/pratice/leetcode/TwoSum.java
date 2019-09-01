package yeh.pratice.leetcode;

public class TwoSum {
    private int[] answer = new int[2];


        /*for(int n:nums){
            System.out.println(n);
        }*/
        public int[] Target(int arr[],int target){



        for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==target)
            {
                //answer = new int[]{arr[i], arr[j]};
                answer=new int[]{i,j};
            }

        }
    }
        return answer;
        }

}
