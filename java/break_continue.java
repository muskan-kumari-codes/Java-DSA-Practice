public class break_continue {
    public static void main(String[] args) {
        int n = 3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==2){
                    continue;
                }
                System.out.print(j + " " );
            }
            System.out.println();
        }
    }
}
