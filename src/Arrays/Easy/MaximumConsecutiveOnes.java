package Arrays.Easy;

public class MaximumConsecutiveOnes {


    public static int maxOnes(int[] arr, int n){

        int curr_max = 0;
        int max_ans = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                curr_max++;
                max_ans = Math.max(curr_max, max_ans);
            }
            else{
                curr_max = 0;
            }
        }

        return max_ans;
    }


    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println(maxOnes(arr, 6));
    }
}
