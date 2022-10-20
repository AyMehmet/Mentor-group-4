package Week_26.PassByValue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));
        System.out.println("original list : " + list);
        addToList(list);
        System.out.println("after addition : " + list);
        deleteList(list);
        System.out.println("after deletion : " + list);
        clearList(list);
        System.out.println("after clear : " + list);
        assignNewList(list);
        System.out.println("after assigning new list : " + list);
    }

    static void addToList(List<Integer> nums) {
        nums.add(4);
    }

    static void deleteList(List<Integer> nums) {
        nums = null;
    }

    static void clearList(List<Integer> nums) {
        nums.clear();
    }

    static void assignNewList(List<Integer> nums) {
        nums = new LinkedList<>();
        nums.add(5);
    }
}
