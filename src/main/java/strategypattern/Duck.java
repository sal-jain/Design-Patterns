package strategypattern;
public abstract class Duck {
    FlyBehavior flyBehavior;
    SoundBehavior soundBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setSoundBehavior(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }

    public void performfly() {
        flyBehavior.fly();
    }

    public void perfomsound(){
        soundBehavior.sound();
    }

    public void swim() {
    }

    public abstract void display();
}
