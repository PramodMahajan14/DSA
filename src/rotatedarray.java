//33. Search in Rotated Sorted Array
public class rotatedarray {
    public static void main(String[] args) {
       int [] arr = {5,1,2};
//        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr,5));
    }
    static int search(int[] nums, int target) {
        int pivot = pivotElement(nums);
        if(pivot == -1){
            return Binarysearch(nums,target,0,nums.length-1);
        }
        if(target == nums[pivot]){
            return pivot;
        }
        if(target >= nums[0]){
            return Binarysearch(nums,target,0,pivot-1);
        }
        return Binarysearch(nums,target,pivot+1,nums.length-1);
    }
    static int pivotElement(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]<= nums[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    static int Binarysearch(int[]nums,int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;

            if(target<nums[mid]){
                end = mid-1;
            }else if(target>nums[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;

    }

}
