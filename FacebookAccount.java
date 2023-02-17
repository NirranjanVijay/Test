package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccount {
      public static void main(String[] args) {
    	  ChromeDriver driver=new ChromeDriver();
  		driver.get("https://www.facebook.com/index.php");
  		driver.manage().window().maximize();
  		driver.findElement(By.linkText("Create new account")).click();
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  		driver.findElement(By.name("firstname")).sendKeys("Nirranjan");
  		driver.findElement(By.name("lastname")).sendKeys("Vijay");
  		driver.findElement(By.name("reg_email__")).sendKeys("p.nirranjanvj@gmail.com");
  		driver.findElement(By.id("password_step_input")).sendKeys("123456789");
  		 WebElement day = driver.findElement(By.id("day"));
  		 Select sel=new Select(day);
  		 sel.selectByValue("11");
  		 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
  		 Select sell=new Select(month);
  		 sell.selectByValue("4");
  		 WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
  		 Select seel=new Select(year);
  		 seel.selectByVisibleText("2001");
  		 driver.findElement(By.xpath("//input[@class='_8esa']")).click();
  		 driver.close();
  		 
  		 
  	    
  	}

  

	}

