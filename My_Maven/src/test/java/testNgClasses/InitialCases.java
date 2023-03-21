package testNgClasses;

import org.testng.annotations.Test;

import pageobjectModel.Homepage;
import utility.DriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class InitialCases {
	WebDriver driver;
	DriverManager obj=new DriverManager();
	String expectedURL="https://selenium.obsqurazone.com/index.php";
	
	
  @Test(priority=0,enabled=true)
  public void valueCheck1() throws InterruptedException {
	  //pageobject model with PageFactory
	  Homepage objHome=new Homepage(driver);
	 objHome.messageVerification();
	 String appvalue= objHome.returnTextValue();
	 
	//pageobject model without PageFactory 
	/*  WebElement inputForm = driver.findElement(By.xpath("//*[@id='collapsibleNavbar']/ul/li[2]/a"));
	  inputForm.click();
	  Thread.sleep(2000);
	  WebElement textbox = driver.findElement(By.id("single-input-field"));
	  textbox.sendKeys("Hello");
	  Thread.sleep(2000);
	  WebElement button = driver.findElement(By.id("button-one"));
	  button.click();
	  Thread.sleep(2000);
	  WebElement getvalue = driver.findElement(By.id("message-one"));
	  String appvalue = getvalue.getText();*/
	 
	  if(appvalue.contains("Hello")) {
		  Assert.assertTrue(true);
		  System.out.println("Success1");
	  }else 
	  {
		 Assert.fail("string comparsion failed"); 
	  }
	 
	  
	  
  }
  @Test(priority=1,enabled=true)
  public void valueCheck2() throws InterruptedException
  {
	  Homepage objHome1=new Homepage(driver);
	  objHome1.numberInput();
	  String appvalue1= objHome1.returnSum();
	  
	  
  /*WebElement textbox = driver.findElement(By.id("value-a"));
  textbox.sendKeys("4");
  WebElement textbox1 = driver.findElement(By.id("value-b"));
  textbox1.sendKeys("6");
  Thread.sleep(2000);
  WebElement button = driver.findElement(By.id("button-two"));
  button.click();
  Thread.sleep(2000);
  WebElement getvalue = driver.findElement(By.id("message-two"));
  String appvalue1=getvalue.getText();*/
  if(appvalue1.contains("9"))
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
