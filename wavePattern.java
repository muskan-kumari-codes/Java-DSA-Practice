package Practic.array;

import java.util.ArrayList;

public class wavePattern {
    static ArrayList<Integer> wave(int[][] arr){
        ArrayList<Integer> list = new ArrayList<>();

        int m = arr[0].length;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(i%2==0){
                for(int j=0; j<m; j++){
                    list.add(arr[j][i]);
                }
            }else{
                for(int j=m-1; j>=0; j--){
                    list.add(arr[j][i]);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(wave(arr));
    }
}
