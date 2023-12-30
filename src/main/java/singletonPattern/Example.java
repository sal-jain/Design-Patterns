package singletonPattern;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        System.out.println(singletonLazy1.hashCode());
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        System.out.println(singletonLazy2.hashCode());
        SingletonEager singletonEager1 = SingletonEager.getObject();
        System.out.println(singletonEager1.hashCode());
        SingletonEager singletonEager2 = SingletonEager.getObject();
        System.out.println(singletonEager2.hashCode());

        //Breaking of singleton using Reflection
        //Since we have created the one object that is singletonLazy1 now we will try to create another object for the same
        Constructor<SingletonLazy> constructor = SingletonLazy.class.getDeclaredConstructor(); // this will create new constructor
        constructor.setAccessible(true); //changing the accessibility means to make private constructor as public
        SingletonLazy s1 = constructor.newInstance();
        System.out.println(s1.hashCode());
        //Solution for this break check the SingletonLazy class

        //2. Another way to break singleton is using deserialization
        // for this we need to implement serializable into class SingletonLazy
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(singletonLazy);
        System.out.println("Serialization Done");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        SingletonLazy s2 = (SingletonLazy) ois.readObject();
        System.out.println(s2.hashCode());
        //Solution for this break we need to override read resolve method check class SingletonLazy

    }
}
