package stack;
import java.util.*;
public class midElement {
    public static void printMid(Deque<Integer> st, int size, int count){
        if(count==size/2){
            System.out.println(st.peek());
            return;
        }
        st.pop();
        printMid(st, size, count+1);
    }

    public static void main(String[] args) {
        Deque<Integer> st = new ArrayDeque<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int size = st.size();

        printMid(st, size, 0);
    }
}
