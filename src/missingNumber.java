import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int i=0;

        while(i< nums.length){
            int check = nums[i];
            if(nums[i]<nums.length && nums[i] != nums[check]){
                swap(nums,i,check);
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }
   static  void swap(int [] arr,int start, int second){
        int temp =  arr[start];
        arr[start]= arr[second];
        arr[second] = temp;
    }

//


   }
