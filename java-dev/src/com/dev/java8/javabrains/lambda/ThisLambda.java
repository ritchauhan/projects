package com.dev.java8.javabrains.lambda;

public class ThisLambda {

    public static void process(int i, Process p) {
        p.process(i);
    }

    public void execute(int a, int b) {
        process(a, i -> {
            System.out.println(i+b);
            System.out.println(this);
        } );
    }

    public String toString() {
        return "Outer class";
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        process(a, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i+b);
                System.out.println(this);
            }

            public String toString() {
                return "Test inner class for this";
            }
        });
        process(a, i -> {
            System.out.println(i+b);
          //  System.out.println(this); // this will not work
        } );
        ThisLambda thisLambda = new ThisLambda();
        thisLambda.execute(a, b);
    }
}
