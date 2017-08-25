package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void turnRight() {
        turnLeft(); 
        turnLeft();   
        turnLeft();   
    }
    public void move2R() {
        move();
        move();
        turnRight();
    }
    public void move2L() {
        move();
        move();
        turnLeft();
    }
    public void shuttleRace() {
        turnLeft();
        move();
        turnRight();
        move2R();
        move2L();
        move2L();
        move2L();
        move2L();
        move2R();
        move2R();
        move();
        turnRight();
    }
}