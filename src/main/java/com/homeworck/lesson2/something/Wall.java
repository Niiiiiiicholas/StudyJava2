package com.homeworck.lesson2.something;

import com.homeworck.lesson2.something.inter.DoSomething;
import com.homeworck.lesson2.something.inter.Obstacle;

public class Wall implements Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean contest(DoSomething doSomething) {
        if(doSomething.jump(height) == true) {
            System.out.println(" - Успешно пререлез");
            return true;
        }else {
            System.out.println(" - Задание не выполнено");
            return false;
        }
    }
}
