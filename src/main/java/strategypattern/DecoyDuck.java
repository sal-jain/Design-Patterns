package strategypattern;
public class DecoyDuck extends Duck{
    public DecoyDuck() {
        soundBehavior = new MuteQuack();
        flyBehavior = new CannotFly();
    }
    @Override
    public void swim() {
        System.out.println("Hello!! I can swim ;) ");
    }
    @Override
    public void display() {
        System.out.println("Hey there!! I am Decoy Duck :)");
    }
}
