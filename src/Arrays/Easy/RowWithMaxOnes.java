package Arrays.Easy;

public class RowWithMaxOnes {


    public static int rowWithMax1s(int[][] arr, int n, int m){

        int col = m - 1;
        int row = -1;
        for(int i = 0; i < n; i++){
            for(int j = col; j >= 0; j--){
                if(arr[i][j] == 1){
                    row = i;
                    col--;
                }
                else{
                    break;
                }
            }
        }


        return row;
    }

    public static void main(String[] args) {

        int[][] arr = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};


        System.out.println(rowWithMax1s(arr, 4, 4));

    }
}
