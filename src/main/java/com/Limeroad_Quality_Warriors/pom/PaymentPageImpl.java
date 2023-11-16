package com.Limeroad_Quality_Warriors.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Limeroad_Quality_Warriors.base.BaseClass;

public class PaymentPageImpl extends BaseClass {
	public PaymentPageImpl() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="15230812")
	private WebElement product;
	
	@FindBy(id="size_19788991")
	private WebElement selectsize;
}
