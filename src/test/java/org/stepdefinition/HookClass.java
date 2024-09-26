package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends BaseClass {
	@Before(order = 1)
	//pre-condition
	private void Preconditions() {
		launchBrowser();
		System.out.println("Launch the browser");
	}
	
	@Before(order = 2)
	//pre-condition
	private void Preconditions2() {
		windowMaximize();
		System.out.println("Max the window");
	}
	
	@Before(order = 3)
	//pre-condition
	private void Preconditions4() {
		System.out.println("pre-condition 3");
	}
	
	@After(order = 10 , value = "@Feature5")
	//post-condition
	private void postcondions2() {
		System.out.println("Take screenshot of scenarious");
	}
	
	@After(order = 4 , value = "@Feature5")
	//post-condition
	private void postcondions1() {
		closeBrowers();
	}
}
