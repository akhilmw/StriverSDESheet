package Arrays.Easy;

import java.util.HashMap;

public class SubArraySumEqualsK {

    public static int allSubArraysWithGivenSum(int[] arr, int n, int k){

        int ans  = 0;
        // (sum, frequency)
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(map.containsKey(sum - k)){
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 7, 1, 9};
        System.out.println(allSubArraysWithGivenSum(arr, 6, 15));
    }
}
