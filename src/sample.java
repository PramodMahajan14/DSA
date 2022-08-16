public class sample {
    public static void main(String[] args) {
//        String s="s12";
//        char ch;
//        for (int i = 0; i < s.length(); i++) {
//
//            ch=s.charAt(i);
//            if(ch-'0'>0 && ch-'0'<9)
//                System.out.println(ch-'0');
//
//        }
        int [] arr = {1,5,2};
        int t =2;
        System.out.println(mountainsmallindex(arr,t));

    }

    public static int mountainsmallindex(int []num,int target){
        int peak = peakmountain(num);
//        finding first ascending order
        int left = mountainArrays(num,0,peak,target,true);
//        if index got then return ans;
        if(left != -1){
            return left;
        }
//        if ans is does not exist in ascending order then find desceding order
        //        finding  ascending order and return ans.
        return mountainArrays(num,peak+1,num.length-1,target,false);
//        if also not exist in descending order then return -1
    }
    public static int peakmountain(int[]nums){
        int start =0;
        int end = nums.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
//                desc part of array
                end = mid;
            }else{
//               incres part of array
                start = mid+1;
            }

        }
        return start;
    }
    public static int mountainArrays(int []nums,int start,int end,int target,boolean isAsc){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target<nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }

            }else{
                if(target>nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }

    }

