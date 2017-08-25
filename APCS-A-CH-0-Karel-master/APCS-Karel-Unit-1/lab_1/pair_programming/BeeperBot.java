package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  Clay Schmidt
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void move3() {
        move();
        move();
        move();
    }
    public void move2() {
        move();
        move();
    }
    public void movePickL() {
        move3();
        pickBeeper();
        turnLeft();
    }
    public void movePick() {
        move3();
        pickBeeper();
        turnLeft();
    }
    public void DoIt () {
       turnLeft();
       move3();
       turnLeft();
       move2();
       pickBeeper();
       movePickL();
       movePickL();
       movePick();
       move2();   
    }
    public void findAllBeepers() {
       DoIt();
    }
   
}

