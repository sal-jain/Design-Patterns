package com.designpattern.strategy;
public class squeak implements SoundBehavior{
    @Override
    public void sound() {
        System.out.println("Squeak-Squeak!!! Squeak-Squeak!!!");
    }
}
