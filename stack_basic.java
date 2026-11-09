package stack;

public class basic {
    static class myStack{
        private int[] arr;
        private int top;
        private int capacity;

        public myStack(int capacity){
            this.capacity = capacity;
            this.arr = new int[capacity];
            this.top = -1;
        
        }

        public int peek(){
            if(top==-1){
                System.out.println("stack is empty");
                return -1;
            }
            else{
                return arr[top];       
            }
        }

        public void push(int data){
            if(top==capacity-1){
                System.out.println("stack is full");
                return;
            }
            else{
                top++;
                arr[top] = data;
            }
        }

        public void pop(){
            if(top==-1){
                System.out.println("stack overflow");
                return;
            }
            else{
                top--;
            }
        }

        public boolean isEmpty(){
            if(top==-1){
                return true;
            }
            return false;
        }

        public int size(){
            return top+1;
        }

        public int capacity(){
            return capacity;
        }
    }

    static void print(myStack st){
        while(!st.isEmpty()){
            System.out.print(st.peek() + "  ");
            st.pop();
        }
    }

    public static void main(String[] args) {
        myStack stack = new myStack(3);

        stack.push(10);
        System.out.println(stack.size());

        stack.push(20);
        stack.push(30);
        stack.push(40);

        print(stack);

        // System.out.println("size " + stack.size());
        // System.out.println("stack top " + stack.peek());
        // stack.pop();
        // System.out.println("size " + stack.size());
        // System.out.println("stack top " + stack.peek());
        // System.out.println("capacity " + stack.capacity());

    }
    
}
