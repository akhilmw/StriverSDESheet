package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfTwoSortedArrays {


    public static ArrayList<Integer> findUnion(int[] a, int n, int[] b, int m){

        ArrayList<Integer> ans = new ArrayList<Integer>();

        int i = 0, j = 0;

        while (i < n && j < m){

            if(a[i] == b[j]){
                if(ans.size() ==0 || ans.get(ans.size() - 1) != a[i]){
                    ans.add(a[i]);
                }
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                if(ans.size() ==0 || ans.get(ans.size() - 1) != a[i]){
                    ans.add(a[i]);
                }
                i++;
            }
            else{
                if(ans.size() ==0 || ans.get(ans.size() - 1) != b[j]){
                    ans.add(b[j]);
                }
                j++;
            }
        }

        while (i < n){
            if(ans.size() ==0 || ans.get(ans.size() - 1) != a[i]){
                ans.add(a[i]);
            }
            i++;
        }

        while (j < m){
            if(ans.size() ==0 || ans.get(ans.size() - 1) != b[j]){
                ans.add(b[j]);
            }
            j++;
        }


        return  ans;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 7};

        ArrayList<Integer> result = findUnion(a, 5, b, 3);

        System.out.println(result);

    }
}
