package be.intecbrussel.alexander_oplossingen.theorie_fundamentels.multipleChoice.second_2;

/**
 * Created by Mrrobot on 4/06/2018 javabasics-workspace.
 */
public class OuterClass {

    private int numb = 7;
    private final String name = "Some name";

    private static int counter = 1;

    public OuterClass(int numb, int counter) {
        this.numb = numb;
        this.counter = counter;
    }

    class InnerClass {


        private void method() {
            System.out.println(numb);
            System.out.println(name);
            System.out.println(counter);
        }

    }

    public static void main (String[] args) {

        OuterClass outerClass = new OuterClass(8,2);
        InnerClass innerClass = outerClass.new InnerClass();

        innerClass.method();

    }


}
