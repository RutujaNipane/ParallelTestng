package com.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParallelBrowserTest 
{
  public WebDriver driver;
  
  @Test
  public void openChromeBrowser() 
  {
	  
	  System.out.println("change affect to git");
	  System.out.println("chng1111");
	  System.out.println("change change");
	 System.out.println("In chrome Browser");
	 System.setProperty("webdriver.chrome.driver","G:\\TESTING\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 System.out.println("Thread count="+Thread.currentThread().getName());
	 System.out.println("Thread count="+Thread.currentThread().getId());
  }
  
  @Test
  public void openIeBrowser()
  {
	  System.out.println("In IE Browser");
	  System.setProperty("webdriver.ie.driver", "G:\\TESTING\\IEDriverServer.exe");
	  driver=new InternetExplorerDriver();
	  System.out.println("Thread count="+Thread.currentThread().getName());
	  System.out.println("Thread count="+Thread.currentThread().getId());
  }
  
  
  
  
  
  
}
