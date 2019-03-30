// Ex19-10
// Zachary Elmore
// 11/14/16
// returns the largest varaiable in an array

import java.util.ArrayList;

public class LargestElement {

	public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(9);
        list.add(7);
        list.add(5);
        list.add(4);
        list.add(10);
        list.add(2);
        list.add(7);
        list.add(11);
        list.add(11);
        System.out.println(max(list));
        
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        E max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }

        return max;
    }
}
