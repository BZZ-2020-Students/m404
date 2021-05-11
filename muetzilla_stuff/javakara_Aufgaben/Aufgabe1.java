import javakara.JavaKaraProgram;
        
/* BEFEHLE:  kara.
 *   move()  turnRight()  turnLeft()
 *   putLeaf()  removeLeaf()
 *
 * SENSOREN: kara.
 *   treeFront()  treeLeft()  treeRight()
 *   mushroomFront()  onLeaf()
 */
public class Aufgabe1 extends JavaKaraProgram {

  // hier k�nnen Sie eigene Methoden definieren

  public void myProgram() {
    // hier kommt das Hauptprogramm hin, zB:
    int anzahl = 0;
    while(!kara.treeFront()) {
      kara.move();
      if(kara.onLeaf()){
          anzahl++;
          kara.removeLeaf();
      }
    
    }
      kara.turnRight();
      kara.turnRight();
    while(anzahl > 0){
        kara.move();
        kara.putLeaf();
        anzahl--;
    }
    kara.move();
    kara.move();
    kara.move();
    kara.turnRight();
    kara.turnRight();
}
}

        