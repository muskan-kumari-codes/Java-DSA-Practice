import java.util.*;
public class array2D {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // printing elements of a jaged array...

        // int arr[][] = {
        //     {1,2},
        //     {2,3,45,6,7},
        //     {4,6,5},
        //     {19}
        // };
        // int rowLength=arr.length;
        // for(int row=0; row<rowLength; row++){
        //     int colLength = arr[row].length;
        //     for(int col=0; col<colLength; col++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        //allocation of different number of columns to each row
        // arr = new int[5][];
        // for(int i=0; i<5; i++){
        //     for
        // }


        // sum of elements in 2D array....

        // int arr[][]= {
        //     {1,2,3},
        //     {4,5},
        //     {6,7,8}
        // };
        // int sum=0;
        // for(int row=0; row<arr.length; row++){
        //     for(int col=0; col<arr[row].length; col++){
        //         sum+=arr[row][col];
        //     }
        // }
        // System.out.println(sum);


        // multiplication of each element...

        // int arr[][]= {
        //     {1,2,3},
        //     {4,5},
        //     {6,7,8}
        // };
        // int multi=1;
        // for(int row=0; row<arr.length; row++){
        //     for(int col=0; col<arr[row].length; col++){
        //         multi*=arr[row][col];
        //     }
        // }
        // System.out.println(multi);


        // max element....

        // int arr[][] = {
        //     {1,2,3},
        //     {49,91},
        //     {19}
        // };
        // int max = arr[0][0];
        // for(int row=0; row<arr.length; row++){
        //     for(int col=0; col<arr[row].length; col++){
        //         if(arr[row][col]>max){
        //             max = arr[row][col];
        //         }
        //     }
        // }
        // System.out.println(max);


        // minimum element....

        //  int arr[][] = {
        //     {1,2,3},
        //     {49,91},
        //     {19}
        // };
        // int mini = arr[0][0];
        // for(int row=0; row<arr.length; row++){
        //     for(int col=0; col<arr[row].length; col++){
        //         if(arr[row][col]<mini){
        //             mini = arr[row][col];
        //         }
        //     }
        // }
        //System.out.println(mini);


        // row wise sum....

        // int arr[][] = {
        //     {1,2},
        //     {2,3,45,6,7},
        //     {4,6,5},
        //     {19}
        // };
        // for(int i=0; i< arr.length; i++){
        //     int sum = 0;
        //     for(int j=0; j<arr[i].length; j++){
        //         sum+=arr[i][j];
        //     }
        //     System.out.println("sum of " + (i+1) + " row is " + sum);
        // }

        // column wise sum;

        // for(int j=0; j<arr[0].length; j++){
        //     int sum = 0;
        //     for(int i=0; i<arr.length; i++){
        //         sum += arr[i][j];
        //     }
        //     System.out.println("sum of column is " + sum);
        // }
        

        // transpose of a matrix....

        // int [][] matrix = {
        //     {1,2,3},
        //     {4,5,6}
        // };
        // for(int j=0; j<matrix[0].length; j++){
        //     for(int i=0; i<matrix.length; i++){
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        //printing diagonal elements....

        // int[][] matrix = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        // int sum = 0;
        // if(matrix.length == matrix[0].length){
        //     for(int i=0; i<matrix.length; i++){
        //         for(int j=0; j<matrix[i].length; j++){
        //             if(i==j){
        //                 sum += matrix[i][j];
        //                 System.out.println(matrix[i][j]);
        //             }
        //         }
        //     }
        // }
        // System.out.println("sum of diagonal is " + sum);


        // searching an element..

        // boolean found = false;
        // int[][] matrix = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        // System.out.println("enter an element for searching : ");
        // int n = sc.nextInt();
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[i].length; j++){
        //         if(n == matrix[i][j]){
        //             System.out.println("Element found at index " + i + " " + j);
        //             found = true;
        //         }
        //     }
        // }
        // if(found!=true){
        //     System.out.println("element not found");
        // }


        // symmetric matrix...

        // int[][] matrix ={
        //     {1,2,3},
        //     {2,5,6},
        //     {3,6,9}
        // };
        // int[][] original = matrix;
        // int[][] transpose = new int[matrix[0].length][matrix.length] ;
        // for(int j=0; j<matrix[0].length; j++){
        //     for(int i=0; i<matrix.length; i++){
        //         transpose[j][i] = matrix[i][j];
        //     }
        // }
        // boolean areEqual = Arrays.deepEquals(original,transpose);
        // if(areEqual==true){
        //     System.out.println("symmetrix matrix");
        // }
        // else{
        //     System.out.println("not symmetric");
        // }


        // allocating different numbers of columns to each row....

        System.out.println("enter number of rows ");
        int n = sc.nextInt();
        int[][] arr = new int[n][];
        System.out.println();
        
        for(int i=0; i<n; i++){
            System.out.println("enter number of columns for " + i + " row");
            int col = sc.nextInt();
            arr[i] = new int[col];
        }
        // taking input..
        System.out.println();
        System.out.println("enter elements of array ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // display the array
        System.out.println();
        System.out.println("array.....");
        System.out.println();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
