package com.dev.lambda;

public class LambdaBasicDemo {
	
	public void perform(HelloWorldInterface helloWorldInterface) {
		helloWorldInterface.greeting();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloWorldInterface helloWorldInterface = new HelloWorldImpl();
		
		HelloWorldInterface helloWorldAnonyms = new HelloWorldInterface() {
			
			@Override
			public void greeting() {
				// TODO Auto-generated method stub
				System.out.println("Hello World!..");
			}
		};
		
		LambdaBasicDemo lambdaBasicDemo = new LambdaBasicDemo();	
		// Basic Lambda demo
		HelloWorldInterface lambdaDemo = () -> System.out.println("Hello Worlds from lambda!..");
		
		lambdaBasicDemo.perform(helloWorldInterface);
		lambdaBasicDemo.perform(helloWorldAnonyms);
		lambdaBasicDemo.perform(lambdaDemo);
		

	}

}
