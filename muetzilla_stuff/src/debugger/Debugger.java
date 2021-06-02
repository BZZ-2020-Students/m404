package debugger;

/**
 * short description of this program
 *
 * @author
 * @version 1.0
 * @date 2021.06.01
 */
public class Debugger {

    public Debugger() {
    }

    /**
     * starts the execution
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Debugger debugger = new Debugger();
        debugger.run();
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello World #" + i);
        }

    }

}
