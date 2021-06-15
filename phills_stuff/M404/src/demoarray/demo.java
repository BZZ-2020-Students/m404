package demoarray;

public class demo {
    public static void main(String[] args) {
        demo demo = new demo();
        demo.run();
    }

    public void run(){
        String[] namen = new String[5];

        for (int i = 0;i < namen.length; i++){
            namen[i] = "hallo"+i;
        }
        for(int i = 0; i< namen.length;i++){
            System.out.println(namen[i]);
        }

        //Zwei dimensionales Array
        int[][] zahlen = new int[2][5];
        int k = 1;

        for (int i = 0; i < zahlen.length; i++) {
            for (int j = 0; j < zahlen[i].length; j++) {
                zahlen[i][j] = k;
                k++;
            }
        }
        for (int i = 0; i < zahlen.length; i++) {
            for (int j = 0; j < zahlen[i].length; j++) {
                System.out.println(zahlen[i][j]);
            }
        }

    }
}
