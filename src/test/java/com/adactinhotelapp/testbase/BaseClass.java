package com.adactinhotelapp.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.adactinhotelapp.exceptions.FrameWorkExceptions;
import com.aventstack.chaintest.plugins.ChainTestListener;



@Listeners(ChainTestListener.class)
public class BaseClass {

	protected WebDriver driver;
	public Properties prop;
	public FileInputStream	inputStream;
	

	
	@BeforeMethod(groups= {"master"})
	public void setUp() throws IOException {

		inputStream = new FileInputStream(".\\src\\main\\resources\\config.properties");
		prop = new Properties();
		prop.load(inputStream);

		String brow = prop.getProperty("browser");
		
		

		switch (brow.toLowerCase()) {

		case "chrome":
			driver = new ChromeDriver();

			break;

		case "firefox":
			driver = new FirefoxDriver();

			break;

		case "edge":
			driver = new EdgeDriver();

			break;

		default:
			
			throw new FrameWorkExceptions("Inavlid broswer, please check the entred browser names");
		}
		
		

		// driver = new ChromeDriver();

		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}

	@AfterMethod(groups= {"master"})
	public void tearDown(ITestResult listener) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			throw new FrameWorkExceptions("mighted be unable to find locater, we are quiting browser");
		}
		
		if(!listener.isSuccess()) {
			
			
		ChainTestListener.embed(getScreenShot(), "image/png");
		
		}
		
		
		
		

		driver.quit();

	}
	
	//To generate reports with time and not effecting old reports
	/*
	 * @AfterSuite public void afterSuite() { String baseFile =
	 * "target/chaintest/Index.html"; String timestamp = new
	 * SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date()); String renamed =
	 * "target/chaintest/Index_" + timestamp + ".html"; try {
	 * Files.move(Paths.get(baseFile), Paths.get(renamed),
	 * StandardCopyOption.REPLACE_EXISTING); } catch (IOException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 */
	
	
	//for screen shot
	public File getScreenShot() {	
		
		TakesScreenshot ss =(TakesScreenshot) driver;			
		
		File file = ss.getScreenshotAs(OutputType.FILE);
		return file ;
	}
	
	
	//Titles
	public String getTitleofPage() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	 String title = driver.getTitle();
	return title;
}
	
	//for converting String to integer
	public Double stringToInt(String reqField) {
		
		Double intValue = Double.parseDouble(reqField.replaceAll("[^0-9]", ""));
		
		return intValue;
	}
	
	//expilcitWait
	
	public void expilcitWaits(WebElement element) {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driverWait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	//Alert
	public void alertsAccept() {
		driver.switchTo().alert().accept();	
	}
	
	

}
