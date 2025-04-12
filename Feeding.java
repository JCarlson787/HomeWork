/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Work;

/**
 *
 * @author jesse
 */
public class Feeding {
    public static void main(String[] args) {
     
        TroughPosition[] pos = new TroughPosition[4];
    
        TroughPosition tp1 = new TroughPosition(1, 1, 2, 3);
        TroughPosition tp2 = new TroughPosition(2, 1, 2, 3);
        TroughPosition tp3 = new TroughPosition(3, 1, 2, 3);
        TroughPosition tp4 = new TroughPosition(4, 1, 2, 3);
        
        pos[0] = tp1;
        pos[1] = tp2;
        pos[2] = tp3;
        pos[3] = tp4;
        
        Philosopher phil = new Philosopher(1, tp1);
        Philosopher phil2 = new Philosopher(2, tp2);
        Philosopher phil3 = new Philosopher(3, tp3);
        Philosopher phil4 = new Philosopher(4, tp4);
        Philosopher phil5 = new Philosopher(5, tp1);
        Philosopher phil6 = new Philosopher(6, tp2);
        Philosopher phil7 = new Philosopher(7, tp3);
        Philosopher phil8 = new Philosopher(8, tp4);
        Philosopher phil9 = new Philosopher(9, tp1);
        Philosopher phil10 = new Philosopher(10, tp2);
        
        phil.start();
        phil2.start();
        phil3.start();
        phil4.start();
        phil5.start();
        phil6.start();
        phil7.start();
        phil8.start();
        phil9.start();
        phil10.start();
        
    }
    
}
