import java.util.Arrays;

public class searchInmatrix {
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
//        System.out.println(Arrays.toString(searchmatrix(arr,7)));
//findelement(arr);
//        System.out.println(diagonal(arr));
        System.out.println(secondary(arr));
    }
    static int[] searchmatrix(int[][] num, int target){
        int rows = 0;
        int cols = num.length-1;
        while(rows< num.length && cols>=0){
            if(num[rows][cols] == target){
                 return new int []{rows,cols};
            }
            if(num[rows][cols] <target){
                rows++;
            }else {
                cols--;
            }

        }
        return new int[]{-1,-1};
    }
//    find element in sorted matric using binary search technique

    static void findelement(int [][] matric){
        System.out.println(matric.length);
        System.out.println(matric[0].length);
    }
//    ===========================sum of diagonal of given matrix =============================
//    primary diagonal
    static int diagonal(int[][] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){

            for(int j = 0;j<arr[i].length ;j++){
//                sum = sum+arr[i][j];
                if(i==j){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
//    Secondary diagonal
static int secondary(int[][] arr){
    int sum = 0;
    for(int i = 0;i<arr.length;i++){

     sum += arr[i][i];

    }
    return sum;
}

}
