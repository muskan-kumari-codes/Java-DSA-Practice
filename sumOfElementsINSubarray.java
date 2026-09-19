package Practic;

import java.util.ArrayList;

public class sumOfElementsINSubarray {
    static ArrayList<Integer> sumOfElements(int[][] arr){
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=0; j<arr[i].length; j++){
                sum+=arr[i][j];
            }
            list.add(sum);
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(sumOfElements(arr));
    }
}
