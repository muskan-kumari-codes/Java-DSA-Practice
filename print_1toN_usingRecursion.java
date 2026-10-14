package recursion;

public class count {
    static int printCount(int n, int count){
       if(count>n) return 0;
       System.out.println(count);
       count++;
       return printCount(n, count);
    }
    public static void main(String[] args) {
        printCount(10,1);
    }
}
