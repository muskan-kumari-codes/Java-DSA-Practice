public class collection{
  public static void main(String[] args){
    Queue<Integer> queue3 = new PriorityQueue<>(Collections.reverseOrder());
            queue3.offer(34);
            queue3.offer(56);
            queue3.offer(32);
            queue3.offer(9);
            queue3.offer(45);

            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();

            for(int i=1; i<=x; i++){
                if(i==x){
                    System.out.println(x + " th largest num : " + queue3.poll());
                }else{
                    queue3.poll();
                }
            }
  }
}
