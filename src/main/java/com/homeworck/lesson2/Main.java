package com.homeworck.lesson2;

import com.homeworck.lesson2.something.*;
import com.homeworck.lesson2.something.inter.DoSomething;
import com.homeworck.lesson2.something.inter.Obstacle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DoSomething> listSomething = new ArrayList<>();
        listSomething.add(new Cat());
        listSomething.add(new Robot());
        listSomething.add(new Human());

        List<Obstacle> listDo = new ArrayList<>();
        listDo.add(new TreadMill(200));
        listDo.add(new Wall(9));
        listDo.add(new TreadMill(100000));

        for (DoSomething s : listSomething){
            for (Obstacle a : listDo){
                if(!a.contest(s))break;
            }
        }
    }
}
