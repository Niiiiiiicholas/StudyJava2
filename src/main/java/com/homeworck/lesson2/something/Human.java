package com.homeworck.lesson2.something;

import com.homeworck.lesson2.something.inter.DoSomething;

public class Human implements DoSomething {
    private static int maxDistance = 1000;
    private static int maxHeight = 10;

    @Override
    public boolean run(int a) {
        if(a < maxDistance){
            System.out.print("Human Ran");
            return true;
        }else
            System.out.print("Human don't Ran");
            return false;
    }

    @Override
    public boolean jump(int b) {
        if(b < maxHeight) {
            System.out.print("Human Jump");
            return true;
        }else
            System.out.print("Human don't Jump");
            return false;
    }
}
