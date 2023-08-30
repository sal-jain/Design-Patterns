package strategypattern;

public class Quack implements SoundBehavior{
    @Override
    public void sound() {
        System.out.println("strategypattern.Quack-strategypattern.Quack!!! strategypatter.Quack-strategypattern.Quack!!!");
    }
}
