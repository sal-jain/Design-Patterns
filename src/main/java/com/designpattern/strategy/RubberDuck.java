package com.designpattern.strategy;
public class RubberDuck extends Duck{
    public RubberDuck() {
        soundBehavior = new squeak();
        flyBehavior = new CannotFly();
    }
    @Override
    public void swim() {
        System.out.println("Hello!! I can swim ;) ");
    }
    @Override
    public void display() {
        System.out.println("Hey there!! I am Rubber Duck :)");
    }
}
