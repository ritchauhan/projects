package com.dev.java.interview.designPattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Singleton basic
 */
public class SingletonBasic implements Serializable, Cloneable {
    // eager loading
    // private static SingletonBasic singletonBasic = new SingletonBasic();
    private static SingletonBasic singletonBasic = null;
    private SingletonBasic() {
        System.out.println("Creating the instance: ");
    }

    public static SingletonBasic getInstance() {
        // lazy loading
        if (singletonBasic == null) {
            singletonBasic = new SingletonBasic();
        }
        return singletonBasic;
    }
}
