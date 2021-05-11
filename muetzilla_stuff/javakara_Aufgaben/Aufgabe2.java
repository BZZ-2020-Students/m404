import javakara.JavaKaraProgram;
        
/* BEFEHLE:  kara.
 *   move()  turnRight()  turnLeft()
 *   putLeaf()  removeLeaf()
 *
 * SENSOREN: kara.
 *   treeFront()  treeLeft()  treeRight()
 *   mushroomFront()  onLeaf()
 */
public class Aufgabe2 extends JavaKaraProgram {

  // hier können Sie eigene Methoden definieren

  public void myProgram() {
    // hier kommt das Hauptprogramm hin, zB:
    while (!kara.onLeaf()) {
      if(kara.treeRight()){
          if(kara.treeFront()){
            kara.turnLeft();
          }else{
            kara.move();
          }
      }else{
         kara.turnRight();
        kara.move();
      }
    }
  }
}

        