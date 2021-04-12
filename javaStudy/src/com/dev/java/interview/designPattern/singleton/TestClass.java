package com.dev.java.interview.designPattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

enum Singleton {
    INSTANCE;
}

public class TestClass {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException {
        SingletonBasic sb1 = SingletonBasic.getInstance();
        SingletonBasic sb2 = SingletonBasic.getInstance();

        // Based on enum implementation
//        Singleton sb9 = Singleton.INSTANCE;
//        Singleton sb10 = Singleton.INSTANCE;
//        System.out.println(sb9.hashCode());
//        System.out.println(sb10.hashCode());

        // printing hashcode
        printHashCode("sb1", sb1); // 1389647288
        printHashCode("sb2", sb2); // 1389647288

        // Drawbacks 1: Reflection issue
        // If we this before getInstance() method again new object will be created.
        Class sb3 = Class.forName("com.dev.java.interview.designPattern.singleton.SingletonBasic");
        Constructor<SingletonBasic> constructor = sb3.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonBasic sb4 = constructor.newInstance();
        // printHashCode("sb4", sb4);

        // Drawback 2: Serialization issue
        // writing object into a file
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("obj.ser"));
        objectOutputStream.writeObject(sb1);
        // reading object from a file
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("obj.ser"));
        SingletonBasic sb5 = (SingletonBasic) objectInputStream.readObject();
         printHashCode("sb5", sb5);

        // Drawback 3: Cloning issue
        // Fix this issue with throwing clone not supported exception or override clone and return existing object
        try {
            SingletonBasic sb6 = (SingletonBasic) sb2.clone();
            printHashCode("sb6", sb6);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Drawback 4: thread issue
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(TestClass::useSingleton);
        executorService.submit(TestClass::useSingleton);
        executorService.shutdown();
    }

    private static void printHashCode(String obj, SingletonBasic singletonBasic) {
        System.out.println(obj + " Hashcode : " + singletonBasic.hashCode());
    }

    private static void useSingleton() {
        SingletonBasic s1 = SingletonBasic.getInstance();
        printHashCode("Singleton", s1);
    }
}
