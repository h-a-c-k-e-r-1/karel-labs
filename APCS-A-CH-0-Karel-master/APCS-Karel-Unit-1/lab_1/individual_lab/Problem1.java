package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void move2() {
        move();
        move();
    }
    public void movePick() {
        move();
        pickBeeper();
        
    }
    public void movePut() {
        move();
        putBeeper();
    }
    public void findBeepers() {
        turnLeft();
        move2();
        turnRight();
        move2();
        pickBeeper();
        turnRight();
        movePick();
        movePick();
        movePick();
        movePick();
    }
    public void rearrangeBeepers() {
       findBeepers();
       turnRight();
       move2();
       turnRight();
       move2();
       putBeeper();
       turnRight();
       movePut();
       movePut();
       movePut();
       movePut();
       turnRight();
       move2();
       turnRight();
       move2();
       turnRight();
       
        
    }
   
}