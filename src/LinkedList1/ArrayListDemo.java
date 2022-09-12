package LinkedList1;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(60);
        arr.add(80);
        arr.add(1,50);
        arr.remove(1);
        System.out.println(arr.get(1));
        System.out.println(arr.size());
        System.out.println(arr.get(1));

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        System.out.println();
        for (int i:arr){
            System.out.println(i);
        }
    }
}
