package collectionFramework;

import java.util.*;

public class level3 {
    public static void main(String[] args) {
             //.....stack............
        // Stack<Integer> stack = new Stack<>();
        // stack.push(20);
        // stack.push(9);
        // stack.push(29);
        // stack.push(60);
        // stack.push(30);
        // System.out.println(stack + " \n");
        
        // System.out.println(stack.pop());
        // System.out.println(stack + "\n");

        // System.out.println(stack.peek());
        // System.out.println(stack + "\n");

        // String str = new String();
        // str = "raam is a boy";
        // System.out.println(str);
        // String[] str2 = str.split(" ");
        // Stack<String> stack2 = new Stack<>();
        // for(String word : str2){
        //    stack2.push(word);
        // }

        // String rev = new String();
        // while(stack2.size()>0){
        //     rev = rev + " " + stack2.peek();
        //     stack2.pop();
        // }
        //  System.out.println(rev);

          /// brackets  order....
        // String str = "{[)]}";
        // Stack<Character> stack = new Stack<>();
        // for(char c : str.toCharArray()){
        //     if(c =='(' || c == '{' || c=='['){
        //         stack.push(c);
        //     }else {
        //         if(str.isEmpty()){
        //             System.out.println("wrong order");
        //             break;
        //         }else{
        //             char ch = stack.peek();
        //             if((ch=='(' && c==')') || (ch=='{' && c=='}') || (ch=='[' && c==']')){
        //                 stack.pop();
        //             }else{
        //                 System.out.println("wrong answer");
        //                 break;
        //             }
        //         }
        //     }

        // }
        //     if(stack.isEmpty()){
        //         System.out.println("correct order");
        //     }else{
        //         System.out.println("wrong order");
        //     }

                // valid parentheses............
        //String s = "{}()";




                 //queue......
        // Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        //     queue.offer(23);
        //     queue.offer(30);
        //     queue.offer(34);
        //     queue.offer(50);
        
            // System.out.println(queue);
            // System.out.println(queue.peek());
            // System.out.println(queue.poll());
            // System.out.println(queue);
              
                // k smallest elements..........

            Queue<Integer> queue = new PriorityQueue<>();
            queue.offer(23);
            queue.offer(30);
            queue.offer(34);
            queue.offer(50);
            int k = 2;
            for(int i=0; i<k; i++){
                System.out.println(queue.poll());
            }

        }


        
    } 

