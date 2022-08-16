import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class missingRange {
    public static void main(String[] args) {
       int[] arr = {4,3,2,7,8,2,3,1};
       List<Integer> l =  new ArrayList<>();

        System.out.println();
    }
    public static List<Integer> findDisappearedNumbers(int [] nums){
        List<Integer> list = new ArrayList<>();
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
               list.add(j);
            }
        }
        return list;
    }
    static  void swap(int [] arr,int start, int second){
        int temp =  arr[start];
        arr[start]= arr[second];
        arr[second] = temp;
    }
}
