
//find index of an element in sorted infinite array
public class findIndex {
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5,6,7,8,9,11,33,44,55,667,887};
       int t=887;
        System.out.println(search(arr,t));
    }
    static int search(int[] nums,int target){
       int start =0;
       int end = 1;
       while(target>nums[end]){
           int temp = end+1;
           end = end+(end-start+1)*2;
           start = temp;
       }
       return find(nums,target,start,end);
    }
    static int find(int[]nums,int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target == nums[mid]){
                return mid;
            }
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
