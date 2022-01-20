package com.homeworck.lesson6;

public class MainApp{

    public static void main(String[] args) {
        MainApp e1 = new MainApp();
        MainApp e2 = new MainApp();

        new Thread(() -> e1.method1()).start();
        new Thread(() -> e2.method1()).start();

    }
    public synchronized void method1(){
        System.out.println("START - M1" + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("STOP - M1"+ Thread.currentThread().getName());
    }
    public synchronized void method2(){
        System.out.println("START - M2"+ Thread.currentThread().getName());
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("STOP - M2"+ Thread.currentThread().getName());
    }
}
