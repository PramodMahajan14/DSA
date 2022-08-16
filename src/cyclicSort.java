import java.lang.reflect.Array;
import java.util.Arrays;

public class cyclicSort  {

    public static void main(String[] args) {
       int [] arr = {3,2,4,5,6,1};
       sort(arr);
        System.out.println(Arrays.toString(arr));
    }
     static void sort(int [] nums){
        int i=0;
        while(i< nums.length){
            int check = nums[i]-1;
            if(nums[i] != nums[check]){
                swap(nums,i,check);
            }else{
                i++;
            }
        }

     }
     static void swap(int [] arr,int start,int correct){
        int temp = arr[start];
        arr[start] = arr[correct];
        arr[correct] = temp;
     }
}
