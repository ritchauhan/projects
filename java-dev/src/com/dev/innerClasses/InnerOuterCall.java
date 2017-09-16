package com.dev.innerClasses;

import com.dev.innerClasses.InnerClassDemo.InnertoInnerClass;

/**
 * 
 * @author rkumar
 *
 */
public class InnerOuterCall {
	
	/**
	 * 
	 * @param arrgs
	 */
	public static void main(String arrgs[]) {
		// 1st way to making inner class object
		InnerClassDemo innerClassDemo = new InnerClassDemo();
		InnertoInnerClass outerClass = innerClassDemo.new InnertoInnerClass();
		outerClass.show();
		// 2nd Way of making inner class object
		InnerClassDemo.InnertoInnerClass innerClass = new InnerClassDemo().new InnertoInnerClass();
		innerClass.show();
	}

}
