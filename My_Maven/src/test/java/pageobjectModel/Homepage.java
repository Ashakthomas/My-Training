package pageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id='collapsibleNavbar']/ul/li[2]/a")
	public WebElement inputForm;
	
	@FindBy(id="single-input-field")
	public WebElement textbox;
	
	@FindBy(id="button-one")
	public WebElement button;
	
	@FindBy(id="message-one")
	public WebElement getvalue;
	
	// 2nd part
	@FindBy(id="value-a")
	public WebElement textbox1;
	
	@FindBy(id="value-b")
	public WebElement textbox2;
	
	@FindBy(id="button-two")
	public WebElement button2;
	
	@FindBy(id="message-two")
	public WebElement getvalue2;
	
	
	public void messageVerification()
	{
		 inputForm.click();
		 textbox.sendKeys("Hello");
		 button.click();
		 
	}
	public String returnTextValue()
	{
		return getvalue.getText();
		
	}
	public void numberInput() throws InterruptedException
	{
		
		 textbox1.sendKeys("4");
		 Thread.sleep(2000);
		 textbox2.sendKeys("5");
		 Thread.sleep(2000);
		 button2.click();
	}
	public String returnSum()
	{
		return getvalue2.getText();
		
	}
}


