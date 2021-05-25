package autoGarage;

/**
 * Car can drive and refuel
 *
 * @author Magnus Götz
 * @version 1.0
 * @since 2021.05.18
 */

public class Autogarage {

    Autogarage(){
        run();
    }

    public static void main(String[] args) {
        Autogarage garage = new Autogarage();
    }

    private void run() {
        Auto[] autos = new Auto[5];
        autos[0] = new Auto(130,"rot","VW","SG41338",120.0, 120.0);
        autos[1] = new Auto(200, "blau", "Audi", "AG124589",125.0, 125.0);
        autos[2] = new Auto(361,"weiss","Mercedes","ZH520895",80.0, 80.0);
        autos[3] = new Auto(600,"grau","Porsche","BE342235",110.0, 110.0);
        autos[4] = new Auto(190,"schwarz","Bmw","ZH286286",130.0, 130.0);

        for (int i = 0; i < autos.length; i++){
            autos[i].fahren();
            autos[i].fahren();
            autos[i].tanken();
            autos[i].fahren();
        }

        for(Auto auto : autos){
            System.out.println(auto.toString());
        }

    }
}
