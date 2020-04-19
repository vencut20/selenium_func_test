package com.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pages.PageObjectFactory;
import com.utils.BrowserUtil;
import com.utils.TestDataUtil;

public class LoginTest  extends BrowserUtil{
	
	SoftAssert sa = new SoftAssert();
	
	//@Test (dataProvider="loginTest",dataProviderClass=TestDataUtil.class, groups={"loginTest","all","smoke"})
/*	public void loginTest(String url, String userName,String password) throws InterruptedException{
		PageObjectFactory pof = new PageObjectFactory(driver);
		sa.assertTrue(pof.homePage().accessUrl(url), "Access url");
		sa.assertTrue(pof.footerSection().clickOnAcceptCoockiePolicy(), "Accept Cookie Policy");
		sa.assertTrue(pof.headerSection().clickOnLoginOrRegister(), "Click on Login/Register");
		sa.assertTrue(pof.loginPage().loginAsUser(userName, password), "Login as a registered user");
		sa.assertTrue(pof.headerSection().isUserLoggedIn(), "Verify Logout link");
		sa.assertAll();*/
	
		@Test (dataProvider="loginTest",dataProviderClass=TestDataUtil.class, groups={"loginTest","all","smoke"})
		public void loginTest(String url, String userName,String password) throws InterruptedException{
		
			    driver.get("http://newtours.demoaut.com/mercurywelcome.php");
			    driver.manage().window().setSize(new Dimension(1366, 728));
			    driver.findElement(By.linkText("REGISTER")).click();
			    driver.findElement(By.name("firstName")).click();
			    driver.findElement(By.name("firstName")).sendKeys("fname");
			    driver.findElement(By.name("lastName")).sendKeys("lname");
			    driver.findElement(By.name("phone")).sendKeys("1234567890");
			    driver.findElement(By.id("userName")).click();
			    driver.findElement(By.id("userName")).sendKeys("test@test.com");
			    driver.findElement(By.name("address1")).click();
			    driver.findElement(By.name("address1")).sendKeys("Address1");
			    driver.findElement(By.name("city")).click();
			    driver.findElement(By.name("city")).sendKeys("City");
			    driver.findElement(By.name("postalCode")).click();
			    driver.findElement(By.name("postalCode")).sendKeys("000000");
			   // driver.findElement(By.name("country")).click();
			    //{
			     // WebElement dropdown = driver.findElement(By.name("country"));
			      //dropdown.findElement(By.xpath("//option[. = 'INDIA']")).click();
			    //}
			    //driver.findElement(By.name("country")).click();
			    driver.findElement(By.id("email")).click();
			    driver.findElement(By.id("email")).sendKeys("fname");
			    driver.findElement(By.name("password")).sendKeys("test");
			    driver.findElement(By.name("confirmPassword")).sendKeys("test");
			    driver.findElement(By.name("register")).click();
			    driver.findElement(By.cssSelector("tr:nth-child(4) > td > table > tbody > tr")).click();
			   // assertThat(driver.findElement(By.cssSelector("p:nth-child(2) > font")).getText(), is("Thank you for registering. You may now sign-in using the user name and password you\\\'ve just entered."));
			    sa.assertEquals(driver.findElement(By.cssSelector("p:nth-child(2) > font")).getText().toString(), "Thank you for registering. You may now sign-in using the user name and password you\\\'ve just entered.");
			

		}
		
	}

	

