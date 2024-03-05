// Collections Framework & Arraylist - Starting of Advanced Java

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(0, 5);
        l1.add(52);
        l1.add(6);
        l1.add(18);
        l1.add(1, 52);
        l1.add(0, 37);
        l1.add(49);
        l1.add(116);
        l1.add(34);
        l1.addAll(0, l2);
        System.out.println(l1.contains(54));
        l1.ensureCapacity(20);
        System.out.println(l1.size());
        System.out.println(l1.indexOf(52));
        System.out.println(l1.lastIndexOf(52));
        l1.remove(6);
        l1.remove(2);
        l1.set(2, 53);
        Object l3 = l1.clone();
        System.out.println(l3);
        System.out.println(l1);
        l1.forEach((n) -> {
            n = n + 10;
            System.out.print(n+" ");
        });
        System.out.println(l1);
        // l1.clear();
        Iterator<Integer> iter = l1.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next()+" ");
        }
        System.out.println(l1.isEmpty());
        System.out.println(l1.size());
        ListIterator<Integer> list = l1.listIterator(10);
        ListIterator<Integer> list1 = l1.listIterator();
        System.out.println(list.hasNext());
        System.out.println(list.hasPrevious());
        System.out.println(list1.hasPrevious());
        l1.removeAll(l2);
        System.out.println(l1);
        l1.removeIf((n) -> (n%37==0));
        System.out.println(l1);
        l1.trimToSize();
        System.out.println(l1);

        // for (int i = 0; i < l1.size(); i++) {
        // System.out.print(l1.get(i));
        // System.out.print(", ");
        // }
    }
}
