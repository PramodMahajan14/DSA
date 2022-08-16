import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int []arr = {12,14,6,4,7,2,5};
        System.out.println(Arrays.toString(selectionsort(arr)));
    }
    static int[] sort(int [] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        return nums;
    }
    static int[] selectionsort(int[] nums){
        for(int i=0;i< nums.length-2;i++){
            for(int j = i+1;j<= nums.length-1;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
