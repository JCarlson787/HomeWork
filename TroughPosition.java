/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Work;

import java.util.Random;

/**
 *
 * @author jesse
 */
public class TroughPosition {

    int id;
    int pos1;
    int pos2;
    int pos3;
    boolean feeding;

    public TroughPosition(int id, int pos1, int pos2) {
        this.id = id;
        this.pos1 = pos1;
        this.pos2 = pos2;
        this.pos3 = -1;
    }

    public TroughPosition(int id, int pos1, int pos2, int pos3) {
        this.id = id;
        this.pos1 = pos1;
        this.pos2 = pos2;
        this.pos3 = pos3;
    }

    public synchronized boolean startEating(int id) {
        boolean completed = false;
        System.out.println("Philosopher " + id + " is eating");
        feeding = true;
        Random random = new Random();
        int num = random.nextInt(1, 101);
        try {
            Thread.sleep(num);
        } catch (Exception e) {
            System.out.println(e);
        }
        finishEating();
        System.out.println("Philosopher " + id + " is done eating");
        completed = true;
        return completed;
    }
    public void finishEating() {
        feeding = false;
    }
}
