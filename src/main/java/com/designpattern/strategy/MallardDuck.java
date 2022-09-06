package com.designpattern.strategy;
public class MallardDuck extends Duck {
    public MallardDuck() {
        soundBehavior = new Quack();
        flyBehavior = new CanFly();
    }
    @Override
    public void swim() {
        System.out.println("Hello!! I can swim ;) ");
    }
    @Override
    public void display() {
        System.out.println("Hey there!! I am Mallard Duck :)");
    }
}
