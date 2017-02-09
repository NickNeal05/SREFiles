import java.io.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class SREwebdriverScript {
	WebDriver driver=new ChromeDriver();
	JavascriptExecutor js; 
	//WebElement table = driver.findElement(By.id("table")); 

	
public void open() {
driver.navigate().to("file:///C:/Users/keesh/Desktop/index.html");

}


public void getTitle() throws IOException {
	String title=driver.getTitle().toString();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	System.out.println(title+" page fully loaded");
}

public void colCntChk(){
	
int	col_count =(Integer) js.executeScript("return document.getElementsByTagName('td').length");
System.out.println(col_count);
}

	public void valueRangechk() throws StaleElementReferenceException{
		WebElement table = driver.findElement(By.id("table")); 
		// Now get all the TR elements from the table 
		List<WebElement> allRows = table.findElements(By.tagName("tr")); 

		// And iterate over them, getting the cells 
		for (WebElement row : allRows) { 
		    List<WebElement> cells = row.findElements(By.tagName("td")); 

		    // Print the contents of each cell
		    for (WebElement cell : cells) { 
		    	if (!(cell.getText().contentEquals("1")) || (!(cell.getText().contentEquals("2")) || (!(cell.getText().contentEquals("3")) ||
		    			(!(cell.getText().contentEquals("4")) || (!(cell.getText().contentEquals("5"))))))){
		    		System.out.println("value is out of range");
		    	}
		        System.out.println(cell.getText());
		        
		    }
		}
	}
	
public void noNullchk(){
	WebElement table = driver.findElement(By.id("table")); 
	List<WebElement> allRows = table.findElements(By.tagName("tr")); 

	// And iterate over them, getting the cells 
	for (WebElement row : allRows) { 
	    List<WebElement> cells = row.findElements(By.tagName("td")); 

	    // Print the contents of each cell
	    for (WebElement cell : cells) { 
	    	if (cell.getText().isEmpty() || (cell==null)){
	    		System.out.println("This value is null and not acceptable");
	    	}
	        //System.out.println(cell.getText());
	        
	    }
	}
}	
	 
	


public void closeBrowser() {
	driver.close();
}


}
