package sets;


import java.util.PriorityQueue;

public class queue {
    public static void main(String[]args){
       PriorityQueue<Integer> p=new PriorityQueue<>(20);
       p.offer(4);
       p.offer(5);
       p.offer(1);
       System.out.println(p.peek());
        System.out.println(p.poll());
        System.out.println(p.element());
        System.out.println(p);











    }
}
