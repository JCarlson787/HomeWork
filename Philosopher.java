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
public class Philosopher extends Thread {

    int id;
    TroughPosition person;

    public Philosopher(int id, TroughPosition person) {
        this.id = id;
        this.person = person;
    }

    @Override
    public void run() {
        Random random = new Random();
        int num;
        for (int i = 0; i < 3; i++) {
            System.out.println("Philosopher with ID of " + id + " has eaten " + i + " times");
            if (!person.feeding) {
                person.startEating(id);
            } else {
                while (person.feeding) {
                    person.startEating(id);
                }
            }

            num = random.nextInt(1, 51);
            try {
                Thread.sleep(num);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
