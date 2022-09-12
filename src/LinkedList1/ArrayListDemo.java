package LinkedList1;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(1,50);
        System.out.println(arr.get(1));
        System.out.println(arr.size());

    }
}
