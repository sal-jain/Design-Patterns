package com.designpattern.strategy;

public class Quack implements SoundBehavior{
    @Override
    public void sound() {
        System.out.println("com.designpattern.strategy.Quack-com.designpattern.strategy.Quack!!! com.designpattern.strategy.Quack-com.designpattern.strategy.Quack!!!");
    }
}
