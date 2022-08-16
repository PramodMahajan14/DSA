import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {

        int arr[]={1,24,5,2,3};
        int l=arr.length;
        re(arr,l);
        System.out.println(Arrays.toString(reversearray(arr)));

    }
    public static int maximumWealth(int[][] accounts) {
        int max = -1;
        for(int i =0;i< accounts.length;i++){
            int sum = 0;
            for(int j=0;j<i;j++){
                sum +=accounts[i][j];
            }
            if(max<sum){
                max = sum;
            }
        }
        return max;
    }

    public static void re(int arr[],int n){

        int s=0;
        int e=n-1;

        for(int i=0;i<n;i++){

            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;

        }

        for(int i=0;i<n;i++){

            System.out.println(arr[i]);
        }
    }

    static int[] reversearray(int[] nums){
        int [] arr = new int [nums.length];
        int j = nums.length;
        for(int i=0;i< nums.length;i++){
            arr[j-1] = nums[i];
            j = j-1;
        }
        return arr;
    }

}
