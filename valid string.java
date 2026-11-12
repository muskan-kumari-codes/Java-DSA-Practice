package stack;
import java.util.*;

public class checkValisString {
    public static boolean isValid(String s){
        Deque<Character> st = new ArrayDeque<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='b'){
                st.push(ch);
            }
            else{
                if(st.size()<2){
                    return false;
                } 
                
                if(st.peek() != 'b'){
                    return false;
                }
                st.pop();

                if(st.peek() != 'a'){
                    return false;
                }
                st.pop();
            }
        }

        if(st.isEmpty()) return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(isValid(s));
    }
}
