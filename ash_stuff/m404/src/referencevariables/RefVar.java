package referencevariables;

/**
 * practice using reference variables
 *
 * @author Alyssa Heimlicher
 * @since 2021-05-18
 * @version 1.0
 */
public class RefVar{

    /**
     * constructor: initialize attributes
     */
    public RefVar() {
    }

    /**
     * starts the execution
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        RefVar program = new RefVar();
        program.run();
    }

    /**
     * declare and use some reference variables and objects
     */
    private void run() {
        Integer nr1, nr2, nr3;
        nr1 = new Integer(1);
        nr2 = new Integer(1);
        nr3 = nr1;

        if(nr1.intValue() == nr2.intValue()){
            System.out.println("Same number!");
        }else{
            System.out.println("Not the same!");
        }
        sepp();
        System.out.println();

        if(nr1 == nr2){
            System.out.println("Same number!");
        }else{
            System.out.println("Not the same!");
        }

        sepp();
        System.out.println();

        if(nr1 == nr3){
            System.out.println("Same number!");
        }else{
            System.out.println("Not the same!");
        }
    }

    private void sepp(){
        for (int i = 0; i < 25; i++) {
            System.out.print("-");
        }

    }
}