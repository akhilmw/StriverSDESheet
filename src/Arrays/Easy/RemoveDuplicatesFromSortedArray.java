package Arrays.Easy;


public class RemoveDuplicatesFromSortedArray {

    public static  int remove_duplicate(int[] arr, int n){

        int i = 0;
        for(int j = 1; j < n; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }

        return  i+1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        System.out.println(remove_duplicate(arr, 7));
    }
}
