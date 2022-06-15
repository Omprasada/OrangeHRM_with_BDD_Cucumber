package com.LoginSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	WebDriver driver;
	
	@Given("User enters into LoginPage")
	public void user_enters_into_login_page() {
		System.out.println("step1: Launch browser& LoginPage");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Step2: user enters username and password");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@And("Click on LoginBtn")
	public void click_on_login_btn() throws InterruptedException {
		System.out.println("step3: Clicking on LoginBtn");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
	}

	@Then("User want to lands on HomePage")
	public void user_want_to_lands_on_home_page() {
		System.out.println("step4: Lands on HomePage");
		driver.close();	    
	}

}
