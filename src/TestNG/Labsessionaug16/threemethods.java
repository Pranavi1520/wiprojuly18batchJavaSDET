package com.wipro.testng.Labesessionaug16;

import org.testng.annotations.Test;

public class threemethods {

	    @Test(groups = "Smoke")
	    public void loginTest() {
	    	
	        System.out.println("Testcase1 is executed");
	    }

	    @Test(groups = "Regression")
	    public void paymentTest() {
	    	
	        System.out.println("Testcase2 is executed");
	    }

	    @Test(groups = {"Smoke", "Regression"})
	    public void logoutTest() {
	    	
	        System.out.println("Testcase3 is executed");
	    }
}

