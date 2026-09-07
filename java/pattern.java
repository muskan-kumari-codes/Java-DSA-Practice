//import java.util.*;
public class pattern {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println(("enter a number "));
        // int n = sc.nextInt();
        // for (int i=1;i<=5;i++){
        //     for(int j=4;j>=i;j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=5;k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();


        // //pattern 2
        // for(int i=1;i<=5;i++){
        //     for(int j=5;j>=i;j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //pattern 3
        
        // for(int i =1; i<=n;i++){
        //     for(int j=1; j<=(n-i); j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=(2*i-1); k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //pattern 5 
        // for(int i=n;i>=1;i--){
        //     for(int j=0;j<=(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     for( int k=1; k<=(2*i-1);k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //pattern 6
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=6;j++){
//                 if(i==1 || i==n){
//                     System.out.print("* ");
//                 }else {
//                     if(j==1){
//                     System.out.print("* ");
//                 }else if(j==6){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             }
//             System.out.println();
//         }
//     }
    // int n=5;
    // // pattern 7......
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         if(i==1 || i==2 || i==n){
    //             System.out.print("* ");
    //         }else{
    //             if(j==1 || j==i){
    //                 System.out.print("* ");
    //             }else{
    //                 System.out.print("  ");
    //             }
    //         }
            
    //     }
    //     System.out.println();
    // } 

    // pattern 8......
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=n;j>i;j--){
    //         System.out.print("  ");
    //     }
    //     for(int k=1;k<=(2*i-1);k++){
    //         if(i==1 || i==n){
    //             System.out.print("* ");
    //         }else{
    //             if(k==1 || k==(2*i-1)){
    //                 System.out.print("* ");
    //             }else{
    //                 System.out.print("  ");
    //             }
    //         }
    //     }
    //     System.out.println();
    // }

    //pattern 9......
    // int n=4;
    // for(int i=1;i<=n;i++){
    //     for(int j=n;j>i;j--){
    //         System.out.print("  ");
    //     }
    //     for(int k=1;k<=(2*i-1);k++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }
    // for(int i=n;i>1;i--){
    //     for(int j=0;j<=(n-i);j++){
    //         System.out.print(" ");
    //     }
    //     for(int k=1;k<=(2*i-1);k++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }


    // practice....

    // pattern 1....
    // int n=5;
    // for(int i=0; i<n; i++){
    //     for(int j=0; j<=i; j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }
    // for(int i=0; i<n-1;i++){
    //     for(int j=n-1; j>i; j--){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }
     
    // pattern 2.....
    // int n=5;
    // for(int i=0; i<n; i++){
    //     for(int j=0; j<=i; j++){
    //         if(i%2==0){
    //             if(j%2==0){
    //                 System.out.print("1 ");
    //             }else{
    //                 System.out.print("0 ");
    //             }
    //         }else{
    //             System.out.print(j%2 + " ");
    //         }
    //     }
    //     System.out.println();
    // }

    // pattern 3....
    // int n=4;
    // for(int i=1; i<=n; i++){
    //     for(int j=1; j<=i; j++){
    //         System.out.print(j + " ");
    //     }
    //     for(int k=1; k<=2*(n-i); k++){
    //         System.out.print("  ");
    //     }
    //     for(int l=i; l>=1; l--){
    //         System.out.print(l + " ");
    //     }
    //     System.out.println();
    // }

    // pattern 4...
    // int n=5;
    // int count = 1;
    // for(int i=1; i<=n; i++){
    //     for(int j=0; j<i; j++){
    //        System.out.print(count + " ");
    //        count++;
    //     }
    //     System.out.println();
    // }

    // // pattern 5...
    // int n=5;
    // int ascii = 64+n;
    // for(int i=1; i<=n; i++){ 
    //     for(int j=0; j<i; j++){
    //         char ch = (char)(ascii+j);
    //         System.out.print(ch + " ");     
    //     }
    //     ascii--;
    //     System.out.println();
    // }
    
    // pattern 6....
    // int n=5;
    // int ascii = 65;
    // for(int i=0; i<n; i++){
    //     for(int j=0; j<=i; j++){
    //         char ch = (char)(ascii+i);
    //         System.out.print(ch + " "); 
    //     }
    //     System.out.println();
    // }

    // pattern 7...
    // int n=4;
    // int ascii = 64;
    // for(int i=1; i<=n; i++){
    //     for(int j=n; j>i; j--){
    //         System.out.print("  ");
    //     }
    //     for(int k=1; k<=i; k++){
    //         char ch = (char)(ascii+k);
    //         System.out.print(ch + " ");
    //     }
    //     for(int l=i-1; l>=1; l--){
    //         char ch = (char)(ascii+l);
    //         System.out.print(ch + " ");
    //     }
    //     System.out.println();
    // }

    // pattern 8....
    // int n=5;
    // for(int i=1; i<=n; i++){
    //     for(int j=n;j>=i; j--){
    //         System.out.print("* ");
    //     }
    //     for(int k=1; k<=2*(i-1); k++){
    //         System.out.print("  ");
    //     }
    //     for(int j=n; j>=i; j--){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }
    // for(int i=1; i<=n; i++){
    //     for(int j=1;j<=i; j++){
    //         System.out.print("* ");
    //     }
    //     for(int k=1; k<=2*(n-i); k++){
    //         System.out.print("  ");
    //     }
    //     for(int j=1; j<=i; j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }
    

}   
}  



