package Arrays.Easy;

import java.util.Arrays;

public class MoveZeroesToEnd {


    public static void moveZeroes(int[] arr){

        int l = 0;
        for(int r = 0; r < arr.length; r++){
            if(arr[r] != 0){
                swap(arr, l , r);
                l++;
            }
        }

    }

    public static void swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }


    public static void main(String[] args) {

        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }
}
