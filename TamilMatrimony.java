package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement my = driver.findElement(By.id("REGISTERED_BY"));
		Select self=new Select(my);
		self.selectByValue("1");
		
		driver.findElement(By.id("NAME")).sendKeys("Nirranjan Vijay.P");
		driver.findElement(By.id("gendermale")).click();
		
		WebElement date = driver.findElement(By.id("DOBDAY"));
	    Select day=new Select(date);
	    day.selectByValue("11");
	    
	    WebElement mon = driver.findElement(By.id("DOBMONTH"));
	    Select mont=new Select(mon);
	    mont.selectByValue("4");
	    
	    WebElement year = driver.findElement(By.id("DOBYEAR"));
	    Select ye =new Select(year);
	    ye.selectByValue("2001");
	     
	    WebElement reli = driver.findElement(By.id("RELIGION")); 
	    Select religion =new Select(reli);
	    religion.selectByVisibleText("Hindu");
	    
	    WebElement mother = driver.findElement(By.id("MOTHERTONGUE")); 
	    Select tongue =new Select(mother);
	    tongue.selectByVisibleText("Tamil");
	    
	    WebElement caste = driver.findElement(By.id("CASTE_NORMAL")); 
	    Select divi =new Select(caste);
	    divi.selectByValue("1");
	    
	    WebElement cont = driver.findElement(By.id("COUNTRY")); 
	    Select country =new Select(cont);
	    country.selectByVisibleText("India");

	    WebElement cod = driver.findElement(By.id("M_COUNTRYCODE")); 
	    Select code =new Select(cod);
	    code.selectByValue("98");
	    
	    driver.findElement(By.id("MOBILENO")).sendKeys("8667322273");
	   driver.findElement(By.id("EMAIL")).sendKeys("p.nirranjanvj@gmail.com");
	   driver.findElement(By.xpath("//input[@name=\"PASSWD1\"]")).sendKeys("12345678");
	   
	   
	   driver.close();
	   

	     
	    
	    
	    
	    
		
		
	}
}
