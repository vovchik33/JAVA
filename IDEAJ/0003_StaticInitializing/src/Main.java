/**
 * Created by flashconsult on 24.12.13.
 */
public class Main {

    static {
        System.out.println("Main.Static");
    }

    public static void main(String... argv) {
        class Child {
            class SubChild1 {
                {
                    System.out.println("SubChild1.NonStatic");
                }
            }
            {
                class SubChild2 {
                    {
                        System.out.println("SubChild2.NonStatic");
                    }
                }
                SubChild2 sc=new SubChild2();
                System.out.println("Child.NonStatic");
            }
            public void helloWorld() {
                System.out.println("Child.helloWorld()");
                SubChild1 sc=new SubChild1();
            }
        }
        System.out.println("Main.main()");
        Child c=new Child();
        c.helloWorld();
    }
}
