import java.util.Arrays;

//find first and last index of an element in sorted array
public class findFirstLastindex {
    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,8,10};
        int target = 8;
        findFirstLastindex fs = new findFirstLastindex();
        System.out.println(Arrays.toString(fs.firstlastt(arr,target)));


    }
    public int[] firstlastt(int[] nums,int target){
        int[] ans = {-1,-1};
        ans[0] = search(nums,target,true);
        ans[1] = search(nums,target,false);
        return ans;
    }
    public int search(int[]nums,int target,boolean isFirst){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<nums[mid]){
                end = mid-1;
            }else if(target>nums[mid]){
                start = mid+1;
            }else{
                ans = mid;
                if(isFirst == true){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
