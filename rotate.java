package Practic.array;

public class rotate {
    static void rotateMatrix(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        int[][] trans = new int[m][n];
        for(int i=0; i<n; i++){
           for(int j=0; j<m; j++){
               trans[j][i] = arr[i][j];
           }
        }

        for(int i=0; i<m; i++){
            for(int j=n-1; j>=0; j--){
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        rotateMatrix(arr);
    }
}
