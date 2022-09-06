package com.designpattern.strategy;
public class RedheadDuck extends Duck{
    public RedheadDuck() {
        soundBehavior = new Quack();
        flyBehavior = new CanFly();
    }
    @Override
    public void swim() {
        System.out.println("Hello!! I can swim ;) ");
    }
    @Override
    public void display() {
        System.out.println("Hey there!! I am ReadHead Duck :)");
    }
}
