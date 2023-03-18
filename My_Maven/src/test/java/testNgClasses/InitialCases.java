package testNgClasses;

import org.testng.annotations.Test;

import utility.DriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class InitialCases {
	WebDriver driver;
	DriverManager obj=new DriverManager();
	String expectedURL="https://selenium.obsqurazone.com/index.php";
  @Test
  public void valuCheck1() throws InterruptedException {
	  
	  WebElement inputForm = driver.findElement(By.xpath("//*[@id='collapsibleNavbar']/ul/li[2]/a"));
	  inputForm.click();
	  Thread.sleep(2000);
	  WebElement textbox = driver.findElement(By.id("single-input-field"));
	  textbox.sendKeys("Hello");
	  Thread.sleep(2000);
	  WebElement button = driver.findElement(By.id("button-one"));
	  button.click();
	  Thread.sleep(2000);
	  WebElement getvalue = driver.findElement(By.id("message-one"));
	  String appvalue = getvalue.getText();
	  if(appvalue.contains("Hello")) {
		  Assert.assertTrue(true);
		  System.out.println("Success1");
	  }else 
	  {
		 Assert.fail("string comparsion failed"); 
	  }
	 
	  
	  
  }
  @Test
  public void valueCheck2() throws InterruptedException
  {
  WebElement inputForm = driver.findElement(By.xpath("//*[@id='collapsibleNavbar']/ul/li[2]/a"));
  inputForm.click();
  Thread.sleep(2000);
  WebElement textbox = driver.findElement(By.id("value-a"));
  textbox.sendKeys("4");
  WebElement textbox1 = driver.findElement(By.id("value-b"));
  textbox1.sendKeys("6");
  Thread.sleep(2000);
  WebElement button = driver.findElement(By.id("button-two"));
  button.click();
  Thread.sleep(2000);
  WebElement getvalue = driver.findElement(By.id("message-two"));
  String appvalue1=getvalue.getText();
  if(appvalue1.contains("10"))
  {
	  Assert.assertTrue(true);
	  System.out.println("Success2");
  }
  else
  {
	  Assert.fail("string comparsion failed"); 
  }
  
  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	 
		  obj.launchBrowser(expectedURL);
		  this.driver=obj.driver;
		  
  }

  @AfterTest
  public void afterTest() {
	  obj.closeBrowser();
  }

}
