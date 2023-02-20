package Arrays.Easy;

public class SecondLargestElementInArray {

    public static int secondLargest(int[] arr, int n){

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2 && arr[i] != max1){
                max2 = arr[i];
            }
        }

        if(max2 == Integer.MIN_VALUE){
            return  -1;
        }

        return  max2;
    }

    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(secondLargest(arr, 6));
    }
}
