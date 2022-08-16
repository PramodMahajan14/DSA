import java.util.Arrays;

public class reversarray {
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(RArray(arr)));
    }
    public static int[] RArray(int[]nums){
        int[]newarray = new int[nums.length];
        int j = nums.length;
        for(int i=0;i<nums.length;i++){
            newarray[j-1] = nums[i];
            j = j-1;
        }
        return newarray;
    }
}
