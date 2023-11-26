package com.EximMe.pageobject;

public class Aboutexim {
	WebDriver idriver;
	public LoginPage(WebDriver rdriver)
	{
		idriver=rdriver;
		PageFactory.initElements( rdriver, this);
	}
	
	@FindBy(id="inputUsername")
	WebElement usename;
	@FindBy(id="inputUsername") 
	WebElement userid;
	@FindBy(name="inputPassword")
	WebElement password;
	@FindBy(className="signInBtn")
	WebElement submit;

	
	public void setuser(String user)
	{
		userid.sendKeys(user);
	}
	public void setpwd(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void submit()
	{
		submit.click();
	}

	
	}


}
