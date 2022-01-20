package com.homeworck.lesson2.something;

import com.homeworck.lesson2.something.inter.DoSomething;
import com.homeworck.lesson2.something.inter.Obstacle;

public class TreadMill implements Obstacle {
    int length;

    public TreadMill(int length) {
        this.length = length;
    }

    @Override
    public boolean contest(DoSomething doSomething) {
        if(doSomething.run(length) == true) {
            System.out.println(" - Успешно пробежал");
            return true;
        }else {
            System.out.println(" - Задание не выполнено");
            return false;
        }
    }
}
