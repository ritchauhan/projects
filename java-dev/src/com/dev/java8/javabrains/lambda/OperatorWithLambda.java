package com.dev.java8.javabrains.lambda;

/**
 * class to demo different way to use lambda
 */
public class OperatorWithLambda {
    private int value1;
    private int value2;
    public OperatorWithLambda(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue1() {
        return this.value1;
    }

    public int getValue2() {
        return this.value2;
    }

    public int operation(OperationsInterface operationsInterface) {
        return operationsInterface.operations(this.value1, this.value2);
    }
    public static void main(String[] args) {
        OperatorWithLambda operatorWithLambda = new OperatorWithLambda(10, 20);
        OperationsInterface addInterface = (int a, int b) -> a + b;
        System.out.println(addInterface.operations(10, 20));
        OperationsInterface multiplyInterface = (a, b) -> a * b;
        System.out.println(multiplyInterface.operations(10, 20));
        OperationsInterface divideInterface = (a, b) -> {
          if (b==0) return 0;
          return a/b;
        };
        System.out.println(divideInterface.operations(10, 5));

        // different way to calling operations
        System.out.println(operatorWithLambda.operation((a, b) -> a+b));

        System.out.println(operatorWithLambda.operation((a, b) -> a * b));

    }
}

interface OperationsInterface {
    public int operations(int a, int b);
}
