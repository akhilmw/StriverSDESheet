package Arrays.Easy;

public class LargestElementInAnArray {

    public static int largest(int[] arr, int n){

        int maxEle = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > maxEle) maxEle = arr[i];
        }
        return maxEle;
    }

    public static void main(String[] args) {

        int[] arr = {1, 5 ,80, 75, 24};
        System.out.println(largest(arr, 5));
    }
}
