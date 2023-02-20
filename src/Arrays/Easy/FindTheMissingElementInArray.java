package Arrays.Easy;

public class FindTheMissingElementInArray {


    public static int missingElement(int[] arr, int n){

        int xor = 0;
        for(int i = 1; i <= n; i++){
            xor = xor ^ i;
        }

        int xor1 = arr[0];
        for(int i = 1; i < n; i++){
            xor1 = xor1 ^ arr[i];
        }

        return xor^xor1;
    }

    public static void main(String[] args) {

        int[] arr = {3, 0, 1};

        System.out.println(missingElement(arr, 3));


    }
}
