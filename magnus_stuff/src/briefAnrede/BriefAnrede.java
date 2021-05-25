package briefAnrede;

import java.util.Scanner;

public class BriefAnrede {
    public static void main(String[] args) {
        new BriefAnrede().run();
    }
    public void run(){
        Scanner scanner = new Scanner(System.in);
        boolean women = false;
        boolean man = false;
        boolean firm = false;

        System.out.print("Gib deine Anrede an > ");
        String anreden = scanner.nextLine();
        String answer = null;
        if(anreden.equalsIgnoreCase("Herr")){
            man = true;
            answer = "Sehr geehrter Herr ";
        }else if(anreden.equalsIgnoreCase("Frau")){
            women = true;
            answer = "Sehr geehrte Frau ";
        }else if (anreden.equalsIgnoreCase("Firma")){
            firm = true;
        }

        if(man || women){
            System.out.print("Gib deinen Nachnamen an > ");
            String name = scanner.nextLine();
            System.out.println(answer + name);
        }else if (firm){
            System.out.print("Gib deinen Firmennamen an > ");
            String firmName = scanner.nextLine();
            System.out.println("Sehr geehrte Firma " + firmName);
        }

    }
}
