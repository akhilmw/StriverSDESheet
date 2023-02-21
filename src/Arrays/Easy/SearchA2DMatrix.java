package Arrays.Easy;

public class SearchA2DMatrix {


    // better - approach
    public static boolean matrixSearch(int[][] arr, int target){

        int rows = arr.length;
        int cols = arr[0].length;

        int i = 0, j = cols - 1;

        while(i < rows && j >= 0){
            if(arr[i][j] == target){
                return true;
            }
            if(arr[i][j] < target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }

    public static boolean searchMatrix(int[][] arr, int target){

        int rows = arr.length;
        int cols = arr[0].length;

        int lo = 0;
        int hi = rows*cols - 1;

        while (lo <= hi){

            int mid = lo + (hi-lo)/2;
            if(arr[mid/cols][mid%cols] == target){
                return true;
            }
            else if(arr[mid/cols][mid%cols] < target){
                lo = mid + 1;
            }
            else{
                hi = mid - 1;
            }
        }


        return false;
    }

    public static void main(String[] args) {

        int[][] arr  = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        System.out.println(matrixSearch(arr, 23));
        System.out.println(searchMatrix(arr, 31));
    }
}
