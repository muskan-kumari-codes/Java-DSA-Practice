public class method {
    // homework questions.....
    static void printWelcomeMessage(){
        System.out.println("Hello ma'am");
        System.out.println("welcome in the world of coding!!");
    }

    static int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    static boolean isEven(int num){
        if(num%2==0) return true;
        else return false;
    }

    static int getmax(int a, int b){
        if(a>b) return a;
        return b;
    }

    static float cal_percentage(int obtain, int total){
        float ans = (obtain*100)/total;
        return ans;
    }

    static void display(int num){
        System.out.println(num);
    }
    static void display(String str){
        System.out.println(str);
    }

    static void updateValue(int num){
        num*=10;
        System.out.println(num);
    }

    public static void main(String[] args) {
        printWelcomeMessage();
        System.out.println("sum of 4 and 5 is " + add(4,5));
        isEven(15);
        System.out.println("max between 34 and 61 is " + getmax(34,61));
        System.out.println("percentage is " + cal_percentage(400, 500));
        display(19);
        display("Hello world");
        int num = 7;
        updateValue(num);
        System.out.println(num);
    }
}
