package com.greencart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.greencart.qa.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath = "//h4[text()='Brocolli - 1 Kg']/following::a[@class='increment'][1]")
	private WebElement BrocolliVeg;

	@FindBy(xpath = "//h4[text()='Brocolli - 1 Kg']/following-sibling::div//input[@class='quantity']")
	private WebElement qtyBrocolli;
	@FindBy(xpath = "//h4[text()='Brocolli - 1 Kg']/ancestor::div[@class='product']//button[text()='ADD TO CART']")
	private WebElement BrocolliAddToCartBtn;

	@FindBy(xpath = "//h4[text()='Beans - 1 Kg']/following::a[@class='increment'][1]")
	private WebElement BeansVeg;
	@FindBy(xpath = "//h4[text()='Beans - 5 Kg']/following-sibling::div//input[@class='quantity']")
	private WebElement qtyBeans;

	@FindBy(xpath = "//h4[text()='Beans - 1 Kg']/ancestor::div[@class='product']//button[text()='ADD TO CART']")
	private WebElement BeansAddToCartBtn;

	@FindBy(xpath = "//input[@placeholder='Search for Vegetables and Fruits']")
	private WebElement homeSearchbar;

	@FindBy(xpath = "//button[@class='search-button']")
	private WebElement homeSearchBtn;

	@FindBy(xpath = "//h4[text()='Tomato - 1 Kg']/ancestor::div[@class='product']//button[text()='ADD TO CART']")
	private WebElement TomatoAddToCartBtn;

	@FindBy(xpath = "//img[@alt='Cart']")
	private WebElement HomeCartBtn;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void addBrocolliTocart() {
		BrocolliVeg.click();
		String EntredQty = qtyBrocolli.getAttribute("value");
		System.out.println("The entered qty are:- " + EntredQty);
		BrocolliAddToCartBtn.click();
	}

	public void addBeansTocart() {
		BeansVeg.click();
		/*
		 * String EntredQty = qtyBeans.getAttribute("value");
		 * System.out.println("The entered qty are:- " + EntredQty);
		 */
		BeansAddToCartBtn.click();

	}

	public void addTomatoTocart() {

		homeSearchbar.sendKeys("tomato");
		homeSearchBtn.click();
		TomatoAddToCartBtn.click();
		HomeCartBtn.click();

		System.out.println("This is the new change after the Imported Project");
		System.out.println("This is the new change after the Imported Project");
		
		System.out.println("This is the third chnage");
		System.out.println("This is the third chnage");

	}

}
