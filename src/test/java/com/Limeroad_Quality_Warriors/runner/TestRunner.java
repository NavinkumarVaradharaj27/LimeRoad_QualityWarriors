package com.Limeroad_Quality_Warriors.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Limeroad_Quality_Warriors.base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\shubh\\eclipse-workspace\\LimeRoad_QualityWarriors\\QualityWarriors.feature", glue = "com.Limeroad_Quality_Warriors.stepdefinition", monochrome = true,

                plugin={ "pretty", "html:Resources/limelogin.html",
	                     "json:Resources/lime_login.json",
	                     "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class TestRunner extends BaseClass {
	
	@BeforeClass
	public static void browserLaunch() {
		//baseclass method
		getDriver("chrome");
       
	}
	
	

}
