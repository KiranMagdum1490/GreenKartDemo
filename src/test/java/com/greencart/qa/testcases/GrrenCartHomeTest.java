package com.greencart.qa.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.greencart.qa.base.TestBase;
import com.greencart.qa.pages.CartPage;
import com.greencart.qa.pages.HomePage;
import com.greencart.qa.pages.ProductListpage;
import com.greencart.qa.utility.Utils;

public class GrrenCartHomeTest extends TestBase {
	@BeforeTest
	@Parameters("browser")
	public void setUp(String browser) {
		intializeBrowser(browser);
	}

	@Test(priority = 1)
	public void homePageTest() {
		HomePage hp = new HomePage(driver);
		hp.addBrocolliTocart();
		hp.addBeansTocart();
		hp.addTomatoTocart();

		CartPage cp = new CartPage(driver);
		cp.checkoutFunctionality();

		ProductListpage pp = new ProductListpage(driver);
		pp.verifyPlaceOrderFunctionality();

	}

	@AfterMethod()
	public void Capturess(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			Utils.getscreenshot(driver, result.getTestName());
		}
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
