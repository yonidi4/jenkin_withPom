package com.firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.selenium.libraries.Base;

public class googlesearch extends Base{
	@Test
	 public void searachone() {
		    driver.get("https://www.google.com/");
		   
		    driver.findElement(By.name("q")).sendKeys("laptops");
		    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		    driver.findElement(By.cssSelector(".bkWMgd:nth-child(1) .g:nth-child(3) .ellip")).click();
		  }

}
