// ArrayDeque

import java.util.ArrayDeque;

public class Arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1 = new ArrayDeque<>();
        ArrayDeque<Integer> l2 = new ArrayDeque<>(5);
        l2.add(2);
        l2.add(3);
        l2.addLast(4);
        l2.addFirst( 5);
        l1.add(52);
        l1.add(6);
        l1.add(18);
        l1.add(49);
        l1.add(116);
        l1.add(34);
        System.out.println(l1);
        System.out.println(l1.contains(54));
        System.out.println(l1.element()); 
        System.out.println(l1.size());
        System.out.println(l1.getLast());
        System.out.println(l1.getFirst());
        System.out.println(l1.isEmpty());
        l1.remove(6);
        l1.remove(2);
        l1.offer(210);
        l1.offerFirst(54);
        l1.offerLast(36);
        System.out.println(l1.peek());
        System.out.println(l1.poll());
        System.out.println(l1.pop());
        System.out.println(l1.removeFirstOccurrence(l2));
        System.out.println(l1.removeLastOccurrence(l2));
        l1.push(63);
        Object l3 = l1.clone();
        System.out.println(l3);
        System.out.println(l1);
        l1.forEach((n) -> {
            n = n + 10;
            System.out.print(n+" ");
        });
        System.out.println(l1);
        // l1.clear();
        l1.removeAll(l2);
        System.out.println(l1);
        l1.removeIf((n) -> (n%37==0));
        System.out.println(l1);

    }
}
