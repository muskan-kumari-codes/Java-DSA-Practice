package stack;

import java.util.*;

public class sorted {

    public static boolean isSorted(Deque<Integer> st){
        if(st.size() <= 1){
            return true;
        }
        int prev = st.peek();
        st.pop();
        int curr = st.peek();
        boolean ans = (prev <= curr);
        boolean recAns = isSorted(st);
        st.push(prev);
        return (ans && recAns);
    }

    public static void main(String[] args) {
        Deque<Integer> st = new ArrayDeque<>();
        st.push(50);
        st.push(40);
        st.push(30);
        st.push(40);
        st.push(10);
        st.push(5);

        System.out.println(isSorted(st));
    }
}
