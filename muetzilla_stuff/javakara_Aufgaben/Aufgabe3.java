import javakara.JavaKaraProgram;
        
/* BEFEHLE:  kara.
 *   move()  turnRight()  turnLeft()
 *   putLeaf()  removeLeaf()
 *
 * SENSOREN: kara.
 *   treeFront()  treeLeft()  treeRight()
 *   mushroomFront()  onLeaf()
 */
public class Aufgabe3 extends JavaKaraProgram {

  public void myProgram() {
      //Als Plan der Welt wird der des Moodles verwendet.
    //Verlassen des Geb�udes
    kara.turnLeft();
    kara.move();
    kara.turnLeft();
    while(kara.treeRight()){  
        if(kara.treeFront()){
            kara.turnLeft();
        }
         kara.move();
    }
    //Kara f�r die Runde um das Geb�ude in die richtige Position bringen
    kara.turnRight();
    kara.move();
    kara.move();
    kara.turnRight();
    kara.move();
    
    //1Runde um das Geb�ude
    while(!kara.treeLeft()){
         while(kara.treeRight()){  
             if(kara.treeFront()){
                kara.turnLeft();
             }
            kara.move();
          }
          //Kara in die Richtige Position bringen, wenn eine Ecke �berschritten wurde
          kara.turnRight();
          kara.move();
    }
    
    
    
    //R�ckkehr zur Loge & in die richtige Position derehen
    while(!kara.onLeaf()){
        kara.move();
    }
  kara.turnRight();
  kara.turnRight();
}
}

        