import com.sun.javafx.collections.transformation.SortableList;
import com.sun.javafx.collections.transformation.SortedList;

import java.util.*;

/**
 * Created by flashconsult on 25.12.13.
 */
public class Main {
    static class Child {
        public String value;
        public Child(String value) {
            this.value = value;
        }
        public String toString() {
            return value;
        }
    }
    private static LinkedList<Child>list;

    static {
        list = new LinkedList<Child>();
        list.add(new Child("2"));
        list.add(new Child("1"));
        list.addFirst(new Child("4"));
        //list.add(new Object()); // error
    }

    /**
     * Default function
     * @param argv
     */
    public static void main(String... argv){
        System.out.println(list);
        SortedList<Child> sortedList = new SortedList<Child>(list, new Comparator<Child>() {
            @Override
            public int compare(Child o1, Child o2) {
                return o1.toString().compareTo(o2.toString());
            }
        }, SortableList.SortMode.BATCH);
        sortedList.sort();
        System.out.println(sortedList);
        list.addFirst(new Child("3"));
        sortedList = new SortedList<Child>(list, new Comparator<Child>() {
            @Override
            public int compare(Child o1, Child o2) {
                return o1.toString().compareTo(o2.toString());
            }
        }, SortableList.SortMode.BATCH);
        sortedList.sort();
        System.out.println(sortedList);
    }
}
