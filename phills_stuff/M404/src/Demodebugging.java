import com.sun.corba.se.impl.orbutil.DenseIntMapImpl;

public class Demodebugging {

    public static void main(String[] args) {
        Demodebugging program = new Demodebugging();
        program.run();

    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        //Ab hier hat man die Schleife verlassen
    }
}
