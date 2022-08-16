import java.util.Arrays;

//1365. How Many Numbers Are Smaller Than the Current Number
public class NumbersAreSmallerThan {
    public static void main(String[] args) {
      int []arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));

    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
     int[]ans = new int[nums.length];
     for(int i = 0;i<nums.length;i++){
         int emp = 0;
         for(int j = 0;j< nums.length;j++){
             if(nums[i]>nums[j]){
                 emp = emp+1;
             }
         }
         ans[i] = emp;
     }
     return ans;
    }
}
