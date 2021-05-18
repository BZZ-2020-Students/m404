package demos;

/**
 * practice using reference variables
 *
 * @author Marc Fuchs
 * @since 2021-05-18
 * @version 1.0
 */
public class ComparisonDemo {

    /**
     * constructor: initialize attributes
     */
    public ComparisonDemo() {
    }

    /**
     * starts the execution
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        ComparisonDemo program = new ComparisonDemo();
        program.run();
    }

    /**
     * declare and use some reference variables and objects
     */
    private void run() {
        Integer nr1 = new Integer(1);
        Integer nr2 = new Integer(1);
        Integer nr3 = nr1;

        if (nr1 == nr2) {
            System.out.println("nr1 & nr2 = equal");
        } else {
            System.out.println("nr1 & nr2 = not equal");
        }

        if (nr1.equals(nr2)) {
            System.out.println("nr1 & nr2 = equal");
        } else {
            System.out.println("nr1 & nr2 = not equal");
        }

        if (nr1.equals(nr3)) {
            System.out.println("nr1 & nr2 = equal");
        } else {
            System.out.println("nr1 & nr2 = not equal");
        }
    }
}