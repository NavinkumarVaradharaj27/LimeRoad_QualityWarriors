package com.Limeroad_Quality_Warriors.runner;

import org.junit.BeforeClass;

import com.Limeroad_Quality_Warriors.base.BaseClass;

public class TestRunner extends BaseClass {
	
	@BeforeClass
	public static void browserLaunch() {

		getDriver("chrome");

	}

}
