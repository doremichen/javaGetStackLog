package com.adam.app;

public class Demo1 {

	public static void main(String[] args) {

		dumpStack();
		
		foo();
	}
	
	
	private static void foo() {
		
		dumpStack();
	}
	
	
	static void dumpStack() {
		
		StackTraceElement[] stackArr = Thread.currentThread().getStackTrace();
		int size = stackArr.length;
		StringBuilder stb = new StringBuilder();
		
		for (int i = 0; i < size; i++) {

			if (i > 1) {
				
				stb.append(stackArr[i].toString()).append("\n");
			}
			
		}
		
		System.out.println(stb.toString());
	}

}

/*
 * ===========================================================================
 *
 * Revision history
 *  
 * ===========================================================================
 */
