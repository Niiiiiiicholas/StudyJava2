package com.homeworck.lesson7;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Car implements Runnable{
//    static Object monitor = new Object();
//    static boolean haveWinner = false;
    private static int CARS_COUNT;
    private static AtomicInteger ai;
    static {
        CARS_COUNT = 0;
        ai = new AtomicInteger(0);
    }
    private Race race;
    private int speed;
    public String name;
    private CyclicBarrier barrier;


    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed, CyclicBarrier barrier) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник № " + CARS_COUNT;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            barrier.await();
            barrier.await();
            for(int i = 0; i < race.getStages().size(); i++){
                race.getStages().get(i).go(this);
            }
//            synchronized (monitor){
//                if(!haveWinner){
//                    haveWinner = true;
//                    System.out.println(name + " - WIN");
//                }
//            }
            if(ai.incrementAndGet() == 1){
                System.out.println(name + "  - WIN");
            }
            barrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
