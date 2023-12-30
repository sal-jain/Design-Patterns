package singletonPattern;

public class SingletonEager {
    private static  SingletonEager exampleEager = new SingletonEager();
    public static SingletonEager getObject(){
        return exampleEager;
    }
}
