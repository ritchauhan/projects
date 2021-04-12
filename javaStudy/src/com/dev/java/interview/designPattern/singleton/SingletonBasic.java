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
    private static volatile SingletonBasic singletonBasic = null;
    private SingletonBasic() {
        // issue 1 fix: reflection
//        if (singletonBasic != null) {
//            throw new RuntimeException("Can not create object here get from instance method ");
//        }
        System.out.println("Creating the instance: ");
    }

    public static SingletonBasic getInstance() {
        // lazy loading
        // double check singleton implementation
        if (singletonBasic == null) {
            // Thread issue fix for singleton
            // need to make singletonBasic volatile as well
            synchronized (SingletonBasic.class) {
                if (singletonBasic == null) {
                    singletonBasic = new SingletonBasic();
                }
            }
        }
        return singletonBasic;
    }

//    public static SingletonBasic getInstance() {
//        return Holder.INSTANCE;
//    }
//
     // Holder pattern
//    static class Holder {
//        static final SingletonBasic INSTANCE = new SingletonBasic();
//    }

    // issue 2 fix : serialization
    private Object readResolve() throws ObjectStreamException {
        System.out.println("read resolve ");
        return singletonBasic;
    }

    // issue 3 fix : clone
    @Override
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
}
