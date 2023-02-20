package Arrays.Easy;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArrays {



    public static ArrayList<Integer> findIntersection(int[] a, int n, int[] b, int m){

        ArrayList<Integer> ans = new ArrayList<Integer>();

        int i = 0, j= 0;

        while(i < n && j < m){
            if(a[i] == b[j]){

                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else{
                j++;
            }
        }

        return ans;

    }

    public static void main(String[] args) {

        int[] a = {1 ,2 ,3 ,3 ,4 ,5 ,6};
        int[] b = {3, 3, 5};

        ArrayList<Integer> result =  findIntersection(a, 7, b, 3);

        System.out.println(result);

    }
}
