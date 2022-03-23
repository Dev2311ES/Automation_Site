package Hotel_Book.Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation_Base_Class {
 
	public static WebDriver driver;
	public static String value;
	public static WebDriver browser_Configuration(String type) {
	 //1.Browser Launch
	 if (type.equalsIgnoreCase("chrome")) 
	 {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	} 
	 else if (type.equalsIgnoreCase("firefor"))
	 {
		 System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
		 driver = new FirefoxDriver();
	}
	 driver.manage().window().maximize();
	 return driver;
 	}
 
 	//2.Get url
 	public static void getUrl (String url) {
	 driver.get(url);
 	}
 	//3.Click element
 	public static void clickOnElement(WebElement element) {
 		element.click();
 	}
 	
 	//4.Send a value
 	public static void inputValueElement(WebElement element ,String data) {
 		element.sendKeys(data);
 	}
 
 	//5.Sleep
 	public static void sleep(int seconds) throws InterruptedException {
 		Thread.sleep(seconds);
 	}
 	//6.implicit wait
 	public static void implicitWait(int seconds,TimeUnit format) {
 		driver.manage().timeouts().implicitlyWait(seconds, format);
 	}
 	
 	//7.Explicit wait
// 	public static void explicitWait(String type , int seconds , WebElement element) {
// 		WebDriverWait wait = new WebDriverWait(driver,seconds);
// 		if(type.equalsIgnoreCase("visibilityOf")) {
// 			
// 			wait.until(ExpectedConditions.visibilityOf(element));
// 		}
// 		else if(type.equalsIgnoreCase("tobeclickable")) {
// 			
// 			wait.until(ExpectedConditions.elementToBeClickable(element));
// 		}}
 	
	
	  public static void explicitWait(int seconds , WebElement element)
	  { 
		  WebDriverWait wait = new WebDriverWait(driver,seconds); 
		  wait.until(ExpectedConditions.visibilityOf(element)); 
	  }
	  

 	//8.JavaExecutor
 	public static void scrollUpAndDown(WebElement element) {
 		JavascriptExecutor js =(JavascriptExecutor) driver;
 		js.executeScript("arguments[0].scrollIntoView();", element);
 	}
 	
 	//9.ActionClass
 	public static void actionClass(String actionName, WebElement element) {
 		
 		Actions a = new Actions(driver);
 		if (actionName.equalsIgnoreCase("moveTo")) 
 		{
			a.moveToElement(element).build().perform();
		} 
 		else if(actionName.equalsIgnoreCase("clickAndHold"))
		{
 			a.clickAndHold(element).build().perform();
		}
 		else if(actionName.equalsIgnoreCase("doubleClick"))
		{
 			a.doubleClick(element).build().perform();
		}
 		else if(actionName.equalsIgnoreCase("contextClick"))
		{
 			a.contextClick(element).build().perform();
		}
 	}
 	
 	//10.Select Element form drop down
 		public static void dropDown(WebElement element , String type , String value) {
 			Select s = new Select(element);
 			if (type.equalsIgnoreCase("byValue"))
 			{
 			s.selectByValue(value);	
 			}
 			else if(type.equalsIgnoreCase("byVisibleText"))
 			{
 				s.selectByVisibleText(value);
 			}
 			else if (type.equalsIgnoreCase("byIndex")) {
 				int index = Integer.parseInt(value);
 				s.selectByIndex(index);
 			}
 			
 			}
 		
 		
 	//11.screenshot
 	public static void takeScreenshot(String path) throws IOException   {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Sugadev\\eclipse-workspace\\Automation\\Screenshot\\" +path+ ".png");
		FileUtils.copyFile(source, dest);
 		}
 	//12.Frames
 	public static void frames(WebElement element) {
 		driver.switchTo().frame(element);
 	}
 	
 	//13.Default content
 	public static void defaultContent() {
 		driver.switchTo().defaultContent();
 	}
 	
 	//14.Navigate
 	public static void navigate(String type , String value) {
 		
 		if (type.equalsIgnoreCase("to")) 
 		{
		driver.navigate().to(value);	
		} 
 		else if (type.equalsIgnoreCase("back"))
 		{
 		driver.navigate().back();	
		}
 		
 		else if(type.equalsIgnoreCase("forward")) 
 		{
 		driver.navigate().forward();
		}
 		else if (type.equalsIgnoreCase("refresh"))
 		{
 		driver.navigate().refresh();
		}
 		
 	}
 	//15.Close current window
 	public static void close() {
 		driver.close();
 	}
 	
 	//16.Quit the all present window
 	public static void quit() {
 		driver.quit();
 	}
 
 	//17.Clear value
 	public static void clear(WebElement element) {
 		element.clear();
 	}
 	//18.test data retrieve
 	 	public static String test_Data(String path , int row_index , int cell_index) throws IOException {

 			File f = new File(path);
 			FileInputStream fis = new FileInputStream(f);
 			@SuppressWarnings("resource")
			Workbook wb = new XSSFWorkbook(fis);
 			Sheet s = wb.getSheetAt(0);

 			Row r = s.getRow(row_index);
 			Cell c = r.getCell(cell_index);

 			CellType cellType = c.getCellType();

 			if (cellType.equals(CellType.STRING)) {
 				value = c.getStringCellValue();
 				//System.out.println(value); 
 			
 			} else if (cellType.equals(CellType.NUMERIC)) {
 				double numericCellValue = c.getNumericCellValue();
 				int Numericvalue = (int) numericCellValue;
 				
 				value= String.valueOf(Numericvalue);
 				//System.out.println(value);
 			}
 			//wb.close();
 			return value;
 			
 		}

}
