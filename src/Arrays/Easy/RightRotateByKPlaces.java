package Arrays.Easy;

import java.util.Arrays;

public class RightRotateByKPlaces {

    public static void right_rotate(int[] arr, int n, int k){

        k = k % n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }

    public static void reverse(int[] arr, int start, int end){

        while(start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        right_rotate(arr, 7, 3);
        System.out.println(Arrays.toString(arr));
    }
}
