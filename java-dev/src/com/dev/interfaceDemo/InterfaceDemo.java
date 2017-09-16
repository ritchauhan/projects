package com.dev.interfaceDemo;

/**
 * 
 * @author rkumar
 * Demo interface for method and variable
 * 1. Interface can extends another interface 
 * 2. Class can implement interface not extends
 * 3. Implementation class should implement all the methods by defaults
 *
 */
public interface InterfaceDemo {
	
	// variable always by default public, static and final
	String name = "Ritesh Kumar"; 
	
	// methods always by default public and abstract
	String getName();
	
}
