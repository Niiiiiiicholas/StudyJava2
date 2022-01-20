package com.homeworck.lesson2.something;

import com.homeworck.lesson2.something.inter.DoSomething;

public class Cat implements DoSomething {
    private static int maxDistance = 800;
    private static int maxHeight = 15;

    @Override
    public boolean run(int a) {
       if(a < maxDistance){
           System.out.print("Cat Ran");
           return true;
       }else
           System.out.print("Cat don't Ran");
           return false;
    }

    @Override
    public boolean jump(int b) {
        if(b < maxHeight) {
            System.out.print("Cat Jump");
            return true;
        }else
            System.out.print("Cat don't Jump");
            return false;
    }
}
