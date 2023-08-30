package strategypattern;

public class MuteQuack implements SoundBehavior{
    @Override
    public void sound() {
        System.out.println("No Sound :(");
    }
}
