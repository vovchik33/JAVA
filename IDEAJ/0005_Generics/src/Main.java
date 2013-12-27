import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by flashconsult on 25.12.13.
 */
public class Main {
    private static ArrayList<Child> childList;

    static class Child {
        private int index=0;
        Child(int index) {
            this.index = index;
        }
        @Override
        public String toString() {
            return "Super Child "+this.index;
        }
    }
    public static void main(String... argv) {
        childList = new ArrayList<>();
        childList.add(new Child(1));
        childList.add(new Child(2));

        for (Child child:childList) {
            System.out.println(child.toString());
        }

        Iterator<Child> i=childList.listIterator();
        while(i.hasNext()) {
            System.out.println(i.next().toString());
            System.out.println(i.toString());
        }
    }
}
