/*package com.Stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MapStepDefinition {

	 WebDriver d;
	   
		@Given("^User should be on login page$")
		public void user_should_be_on_login_page()  {
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			d= new ChromeDriver();
			d.get("https://projects.javabykiran.com/eprocbilling/");
		}

		@When("^User enters uname and pass$")
		public void user_enters_uname_and_pass(DataTable cd) {
			for(Map<String ,String>data :cd.asMaps(String.class, String.class)) {
			d.findElement(By.xpath("//input[@type='text']")).sendKeys(data.get("uname"));
			d.findElement(By.xpath("//input[@type='password']")).sendKeys(data.get("pass"));
			d.findElement(By.xpath("//input[@type='submit']")).click();
			d.findElement(By.xpath("//*[@id=\"QuickMenuDiv\"]/ul/li[6]/a")).click();
			Alert al= d.switchTo().alert();
			al.accept();
			}
			
		}

		@When("^verify title$")
		public void verify_title() {
		String title=	d.getTitle();
			Assert.assertEquals("webERP Login screen",title);
		   
		}

		@When("^verify logo$")
		public void verify_logo(){
		boolean b=	d.findElement(By.xpath("//div[@id='login_logo']")).isDisplayed();
		Assert.assertEquals(true,b);
		    
		}

		@Then("^close browser$")
		public void close_browser() throws Throwable {
			d.close();
		 
		}

}
*/