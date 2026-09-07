import java.util.*;
public class takingInput{
    public static void main(){
        System.out.println("enter your name ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("enter you age ");
        int age = sc.nextInt();
        System.out.println("your name is " + name + " and your age is " + age);
    }

    
}