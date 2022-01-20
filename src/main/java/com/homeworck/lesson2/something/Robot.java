package com.homeworck.lesson2.something;

import com.homeworck.lesson2.something.inter.DoSomething;

public class Robot implements DoSomething {
    private static int maxDistance = 10000;
    private static int maxHeight = 0;

    @Override
    public boolean run(int a) {
        if(a < maxDistance){
            System.out.print("Robot Ran");
            return true;
        }else
            System.out.print("Robot don't Ran");
            return false;
    }

    @Override
    public boolean jump(int b) {
        System.out.print("Robot don't can jump");
            return false;
    }
}
