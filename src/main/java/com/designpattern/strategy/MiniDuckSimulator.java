package com.designpattern.strategy;
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performfly();
        mallard.perfomsound();
        mallard.swim();;
        mallard.display();
    }
}
