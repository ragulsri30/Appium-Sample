package com.sample;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Tests {

	public static void main(String[] args) throws InterruptedException, IOException {







		DesiredCapabilities capabilities = new DesiredCapabilities();

			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion","Funtouch OS 14");
			capabilities.setCapability("deviceName","vivo Y35");
			capabilities.setCapability("udid", "10BD1A0JSA0013Z");
		   capabilities.setCapability("appPackage","com.google.android.youtube");
			capabilities.setCapability("appActivity","com.google.android.youtube.app.honeycomb.Shell$HomeActivity");
			
			URL url = new URL("http://0.0.0.0:4723/wd/hub");

			AndroidDriver driver = new AndroidDriver(url, capabilities);

			/*
			 * 
			 * Dimension size = driver.manage().window().getSize();
			 * 
			 * int Startx =size.width / 2;
			 * 
			 * 
			 * int StartY=(int) (size.height * 0.8);
			 * 
			 * 
			 * int endY=(int) (size.height * 0.2);
			 */
			
			  Thread.sleep(3000); 
			  driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Search\"]")).click();
			  
			  Thread.sleep(3000);
			  
			  driver.findElement(By.id("com.google.android.youtube:id/search_edit_text")).
			  sendKeys("Js Testing Academy");
			  
			  
			  Thread.sleep(3000);
			  
			  driver.findElement(By.id("com.google.android.youtube:id/text")).click();
			  Thread.sleep(3000);
			  
			  driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Go to channel\"]")).click();
			  
			 
			
			  TouchAction a= new TouchAction(driver);
			  
			  for (int i = 0; i <3; i++) {
			  
			  
			  
			  a.press(PointOption.point(500,500)).waitAction(WaitOptions.waitOptions(
					  
			  Duration.ofSeconds(2))).moveTo(PointOption.point(500,900))
			  
			  .release().perform(); }
			 

			  
			  File f= new File("C:\\Users\\C2TA\\eclipse-workspace\\Appium_Test\\src\\test\\resources\\Screenshot\\sample.png");
			  
			  File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
			  
			  
			  FileUtils.copyFile(screenshotAs, f);
			  	
		
	}

}
