package recursion;

public class printingName {
    static int printName(int n){
        if(n==0) return 0;
        System.out.println("Muskan Yadav");
        return printName(n-1); 
    }
    public static void main(String[] args) {
        printName(5);
    }
}
