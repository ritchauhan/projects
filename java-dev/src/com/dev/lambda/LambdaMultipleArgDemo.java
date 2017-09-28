package com.dev.lambda;

/**
 * class to show multiple argument lambda expression functionality
 * @author rkumar
 *
 */
public class LambdaMultipleArgDemo {
	
	 // operation is implemented using lambda expression
	 interface ArgumentInterface {
		 int operation(int a, int b);
	 }
	 
	 // one argument function
	 interface FunctionInter {
		void sayHello(String message); 
	 }
	 
	 // perform function on a and b
	 private int operate(int a, int b, ArgumentInterface argumentInterface) {
		 return argumentInterface.operation(a, b);
	 }
	 
	 public static void main(String args[]) {
		 
		 // lambda expression for addition for two param
		 ArgumentInterface add = (int x, int y) -> x + y;
		 
		 // lambda expression for multiply for two param
		 ArgumentInterface multiply = (int x, int y) -> x * y;
		 
		 // main class object creation
		 LambdaMultipleArgDemo lmb = new LambdaMultipleArgDemo();
		 
		 // add operation
		 System.out.println("add : "+lmb.operate(10, 10, add));
		 
		 // multiply operation
		 System.out.println("multiply : "+lmb.operate(10, 10, multiply));
		 
		 // lambda expression to implement sayHello methods
		 FunctionInter funcInterface = message -> System.out.println("hello : " +message );
		 funcInterface.sayHello("geek");
	 }
}
