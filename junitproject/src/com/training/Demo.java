package com.training;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result r=JUnitCore.runClasses(First.class);
		System.out.println(r.wasSuccessful());
	}

}
