package Arrays.Easy;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {

    public static int lenOfLongSubArray(int[] arr, int n, int k){

        int max_len = 0;
        HashMap<Integer, Integer> map = new HashMap<>();


        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum == k){
                max_len = i + 1;
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }

            if(map.containsKey(sum - k)){
                max_len = Math.max(max_len, i - map.get(sum - k));
            }
        }

        return max_len;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 7, 1, 9};
        System.out.println(lenOfLongSubArray(arr, 6, 15));
    }
}
