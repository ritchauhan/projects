package com.dev.innerClasses;

/**
 * 
 * 
 * @author rkumar
 *
 */
class Popcorn {
	public void pop() {
		System.out.println("pop method of popcorn class");
	}
}
/**
 * 
 * @author rkumar
 *
 */
public class AnnonymsClassDemo1 {
	
	
	class Food {
		public void popIt() {
		Popcorn p = new Popcorn() {
			/**
			 * 
			 */
			public void pop() {
				super.pop();
				System.out.println("pop method of anonyms class");
			}
			
//			/**
//			 * 
//			 */
//			public void sizzle() {
//				System.out.println("sizzle method of annoyms class");
//			}
		};
		
			p.pop();
//			p.sizzle();
			/* will compile becuse not available in super class only
			available in anayms class*/
		}
	}
	
	public static void main(String args[]) {
//		not compiling need to check
//		Food f = new Food();
		AnnonymsClassDemo1 annonymsClassDemo1 = new AnnonymsClassDemo1();
		Food f = annonymsClassDemo1.new Food();
     	f.popIt();
	}
}
