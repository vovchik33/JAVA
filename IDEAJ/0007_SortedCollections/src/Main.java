import com.sun.javafx.collections.transformation.SortableList;
import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.util.*;

/**
 * Created by flashconsult on 25.12.13.
 */
public class Main {
    static class Child {
        public String value;
        Child(String value) {
            this.value = value;
        }
    }
    /**
     * Default constructor
     */
    public Main() {

    }
    /**
     * Main Function to start programm
     * @param argv Aruments of command line
     */
    public static void main(String... argv) {
        ArrayList<Child> list=new ArrayList<Child>();
        list.add(new Child("2"));
        list.add(new Child("1"));
        list.add(new Child("3"));
    }
}
