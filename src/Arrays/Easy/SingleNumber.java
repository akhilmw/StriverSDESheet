package Arrays.Easy;

public class SingleNumber {


    public static int appearOnes(int[] arr, int n){

        int ans = arr[0];
        for(int i = 1; i < n; i++){
            ans = ans ^ arr[i];
        }

        return ans;
    }


    public static void main(String[] args) {

        int[] arr = {4,1,2,1,2};
        System.out.println(appearOnes(arr, 5));
    }
}
