//1929. Concatenation of Array

import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args) {
   int []arr = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int[] nums) {
       int [] ans = new int[nums.length*2];
       int n = nums.length;
       for(int i = 0;i<nums.length;i++){
           ans[i] = nums[i];
           ans[n+i] = nums[i];
       }
       return ans;
    }
}
