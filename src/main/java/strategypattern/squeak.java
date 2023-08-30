package strategypattern;
public class squeak implements SoundBehavior{
    @Override
    public void sound() {
        System.out.println("Squeak-Squeak!!! Squeak-Squeak!!!");
    }
}
