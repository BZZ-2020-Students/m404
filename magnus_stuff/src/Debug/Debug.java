package Debug;

public class Debug {
    public static void main(String[] args) {
        new Debug().run();
    }
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Hello Person #"+i);
        }
    }
}
