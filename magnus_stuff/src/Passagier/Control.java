package Passagier;
/**
 * Check which Passengers were sitting next to the Person
 *
 * @author Magnus Götz
 * @version 0.1
 * @since 2021.06.08
 */
public class Control {
    public Passagier[] control(Passagier[][] passagiers, String sitznummer) {
        String[] str = (sitznummer).split("");
        int y = Integer.parseInt(str[0]); // Line of the Chair
        int x = Integer.parseInt(str[1]); // Column of the Chair
        Passagier[] passagierFinal = new Passagier[8]; // Max Passengers

        if(x - 1 >= 0 && y - 1 >= 0) passagierFinal[1] = passagiers[y-1][x-1];
        if(y - 1 >= 0) passagierFinal[2] = passagiers[y-1][x];
        if(y + 1 < passagiers.length && x - 1 >= 0) passagierFinal[3] = passagiers[y+1][x-1];
        if(y + 1 < passagiers.length)passagierFinal[4] = passagiers[y+1][x];
        if(y + 1 < passagiers.length && x + 1 < passagiers[y+1].length) passagierFinal[5] = passagiers[y+1][x+1];
        if(x + 1 < passagiers[y].length) passagierFinal[6] = passagiers[y][x+1];
        if(x + 1 < passagiers[y].length && y - 1 >= 0) passagierFinal[7] = passagiers[y-1][x+1];

        return passagierFinal;
    }
}
