package scanner;

public class DemoInput {
    public static void main(String[] args) {
        new DemoInput().run();
    }

    private void run() {
        InputReader ir = new InputReader();

        System.out.print("Enter bool:");
        System.out.println(ir.readBool());

        System.out.print("Enter char:");
        System.out.println(ir.readChar());

        System.out.print("Enter double:");
        System.out.println(ir.readDouble());

        System.out.print("Enter int:");
        System.out.println(ir.readInt());

        System.out.print("Enter date:");
        System.out.println(ir.readLocalDate());
    }
}
