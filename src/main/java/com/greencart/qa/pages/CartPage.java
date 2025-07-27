package com.greencart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.greencart.qa.base.TestBase;

public class CartPage extends TestBase {

	@FindBy(xpath = "//button[text()='PROCEED TO CHECKOUT']")
	private WebElement CheckoutButn;

	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void checkoutFunctionality() {
		CheckoutButn.click();
	}

}
