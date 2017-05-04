package Testnggit;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class GitTest {
  WebDriver driver=new FirefoxDriver();
  @BeforeTest
  public void beforeTest() {
	  
	  
	  System.out.println("checking");
  }
  @Test
  public void f4(){
	  driver.get("https://www.google.co.uk/");
	  System.out.println("check");
  }
  @Test
  public void f1() {
	  driver.get("http://www.bbc.co.uk/");
	  System.out.println("checking f2");
  }
  @AfterTest
  public void f3(){
	driver.close();
	System.out.println("closing");
  }
  }