package singletonPattern;

public class SingletonLazy {

    private static SingletonLazy singletonLazy;
    private SingletonLazy(){
        /*
           1. To prevent from reflection break we will throw runtime exception that
            if(null != singletonLazy){
                throw new RuntimeException("You are trying ot break singleton pattern");
            }
         */
    }


    // Lazy way of creating
    public static SingletonLazy getInstance(){

        if(null == singletonLazy){
            synchronized (SingletonLazy.class) {
                if (singletonLazy == null) {
                    singletonLazy = new SingletonLazy();
                }
            }
        }
        return singletonLazy;
    }
}
//2. Another preventive method from breaking singleton from reflection is make class as enum and put INSTANCE inside it and its done.
/*
public enum class SingletonLazy{
    INSTANCE
}
 */

/*
Solution for serialization we will implement  readresolve method
public Object readResolve(){
    return singletonLazy;
}
 */