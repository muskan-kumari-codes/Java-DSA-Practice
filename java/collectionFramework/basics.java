package collectionFramework;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(41);
        arr.add(5);
        arr.add(6);
        arr.add(7);

        // iteration....
        // Iterator<Integer> iterator = arr.iterator();
        // while(iterator.hasNext()){
        //     System.out.print(iterator.next() + " ");
        // }

        // System.out.println();

        // //max and min...
        // Collections.sort(arr);
        // System.out.println( "minimum value : " + arr.get(0));
        // System.out.println( "maximum value : " + arr.get(arr.size()-1));

        // // sum and average....
        // int sum = 0;
        // for(int i=0; i<arr.size(); i++){
        //     sum+=arr.get(i);
        // }
        // System.out.println("Sum : " + sum);
        // System.out.println("average : " + sum/arr.size());

        // //removing..
        // arr.remove(Integer.valueOf(41));
        // arr.remove(3);
        // System.out.println(arr);

        //contains..
       // System.out.println(arr.contains(41));

        //frequency....
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the element : ");
        // int n = sc.nextInt();
        // int freq = 0;
        // for(int i=0; i<arr.size(); i++){
        //     if(n==arr.get(i)){
        //         freq++;
        //     }
        // }
        // System.out.println("frequency 0f " + n +" is " + freq);

        //reversing...
    //    int left = 0;
    //    int right = arr.size() - 1;
    //    while(right>left){
    //        int temp = arr.get(left);
    //        arr.set(left, arr.get(right));
    //        arr.set(right, temp);

    //        left++;
    //        right--;
    //    }

       System.out.println(arr);

       //sorting...
    //    Collections.sort(arr);     //ascending order....
    //    System.out.println(arr);

    //    Collections.sort(arr, Collections.reverseOrder());   //descending order...
    //    System.out.println(arr);

      //coping...
    // ArrayList<Integer> arr2 = new ArrayList<>();
    // arr2.addAll(arr);
    // System.out.println(arr2);

    //converting into array...
    //arr2.toArray();
    
    // merging...
    // arr2.addAll(arr);
    // System.out.println(arr2);
       
       //second largest....
    ArrayList<Integer> list = new ArrayList<>();
    list.addAll(arr);
    Collections.sort(list);
    int n = list.size();
    System.out.println(list.get(n-2));
    }


}
