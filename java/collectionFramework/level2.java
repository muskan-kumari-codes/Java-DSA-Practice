package collectionFramework;

import java.util.*;
public class level2 {
    public static void main(String[] args) {
               //sets...........
        // Set<Integer> set = new HashSet<>();
        // set.add(10);
        // set.add(10);
        // set.add(30);
        // set.add(40);
        // set.add(20);
        // System.out.println(set);
        // System.out.println(set.size());
        
        // Set<Integer> set2 = new HashSet<>();
        // set2.add(40);
        // set2.add(101);
        // set2.add(10);
        
            //inersection...
        // set.retainAll(set2);
        // System.out.println(set);
        // System.out.println(set2);

            //union...
        // set.addAll(set2);
        // System.out.println(set);

           //dublicates...
        // int[] arr = {1,2,5,7,3};
        // HashSet<Integer> set = new HashSet<>();

        // HashSet<Integer> dublicates = new HashSet<>();
        // for(int num : arr){
        //     if(!set.add(num)){
        //         dublicates.add(num);
        //     }
        // }
        // System.out.println(dublicates);

          // first repeated element...
        // for(int num : arr){
        //     if(!set.add(num)){
        //         System.out.println("first repeated element : " + num);
        //         break;
        //     }else{
        //         System.out.println("none");
        //         break;
        //     }
        // }
  
                //maps......
        // HashMap<String, Integer> student = new HashMap<>();
        // student.put("Ekta ", 19);
        // student.put("Mina ", 10);
        // student.put("Abha ", 18);
        // System.out.println(student);
              
                //2nd largest and 2nd smallest....
        // TreeSet<Integer> set3 = new TreeSet<>();
        // set3.add(90);
        // set3.add(4);
        // set3.add(56);
        // set3.add(9);
        // System.out.println("2nd largest : " + set3.lower(set3.last()));
        // System.out.println("2nd smallest : " + set3.higher(set3.first()));

               // HashSet, LinkedHashSet, TreeSet...
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(300);
        hashSet.add(10);
        hashSet.add(20); 

        HashSet<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(10);
        linkedSet.add(300);
        linkedSet.add(10);
        linkedSet.add(20);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(300);
        treeSet.add(10);
        treeSet.add(20);

        System.out.println("hashed Set : " + hashSet);
        System.out.println("linkedHashSet : " + linkedSet);
        System.out.println("TreeSet : " + treeSet);
    }
}
