package com.dev.test.basic;
class Demo {
    public void main() {
        System.out.println("Testing main method with static and void ..");
    }
}
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World Java brains !!..");
        Demo demo = new Demo();
        demo.main();
    }
}
