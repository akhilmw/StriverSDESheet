package Arrays.Easy;

public class LinearSearch {

    public static int searchInArray(int arr[], int N, int K)
    {
        for(int i = 0; i < N; i++){
            if(arr[i] == K){
                return 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int[] arr = {1,2,6,4,3};
        System.out.println(searchInArray(arr, 6, 6));

    }
}
