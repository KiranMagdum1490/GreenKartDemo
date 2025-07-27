package com.greencart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListpage {
	@FindBy(xpath = "//button[text()='Place Order']")
	private WebElement PlaceOrderBtn;

	public ProductListpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyPlaceOrderFunctionality() {
		PlaceOrderBtn.click();
	}
}
