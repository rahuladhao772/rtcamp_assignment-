package rtcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class AmazonTestScript {
	
	public static void main(String[] args) throws InterruptedException {
	
//		launch Browser
		WebDriver driver = new ChromeDriver();
		
//      redirected to url
		driver.get("https://www.amazon.in/");
		
//		used Action class for hovering
		WebElement hover = driver.findElement(By.xpath("//*[text()='Hello, sign in']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(hover);
		
		driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		
//		inserted valid email
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("rahuladhao075@gmail.com");
	
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
//		inserted valid password
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Rahul@1234");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		

//		applied wait

		Thread.sleep(5000);
		
//		insert the text in search field
		driver.findElement(By.xpath("//*[@name='field-keywords']")).sendKeys("Iphone 14 max");
		
		Thread.sleep(3000);
		
		String exp = "Apple iPhone 14 (256 GB) - (Product) RED";
		
		String actual="Apple iPhone 14 (256 GB) - (Product) RED";
		
		Assert.assertEquals(actual, exp);
		
		
//		click on search button
		driver.findElement(By.xpath("//*[@value='Go']"));
	
//		click on add to cart button
		driver.findElement(By.xpath("//*[@id='a-autoid-5-announce']"));
		
//		click on cart
		driver.findElement(By.xpath("//*[@class='nav-cart-icon nav-sprite']"));
		
//		click on proceed to payment
		driver.findElement(By.xpath("//*[@value='Proceed to checkout']"));
		
		
		
		
	}

}
