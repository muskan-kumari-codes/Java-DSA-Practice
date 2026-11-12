package stack;
import java.util.*;

public class sorted_insert {
    public static void sortInsert(Deque<Integer> st, int val){
        if(st.isEmpty() || st.peek()>=val){
            st.push(val);
            return;
        }

        int prev = st.peek();
        st.pop();
        sortInsert(st, val);
        st.push(prev);
    }

    static void print(Deque<Integer> st){
        while(!st.isEmpty()){
            System.out.print(st.peek() + "  ");
            st.pop();
        }
    }

    public static void main(String[] args) {
        Deque<Integer> st = new ArrayDeque<>();
        st.push(5);
        st.push(4);
        st.push(2);
        st.push(1);

        sortInsert(st, 3);
        print(st);
    }
}
