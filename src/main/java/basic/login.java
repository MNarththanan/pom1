package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();		
		driver.get("http://192.168.1.28:3001/#/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("usernameOrEmail")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("tokyo@admin");
		
		//Login button
		WebElement loginButton = driver.findElement(By.cssSelector("#root > div > div > div:nth-child(2) > div > div > div.login_form_card > form > div > div.ant-row.ant-legacy-form-item > div > div > span > button"));
		loginButton.click();
		
		driver.get("http://192.168.1.28:3001/#/login");
			
		WebElement master = driver.findElement(By.xpath("//*[@class='h1']"));
//        WebElement master1 = driver.findElement(By.xpath("//*[name()='h1']"));
//        WebElement master2 = driver.findElement(By.xpath("//h1[@class='h1' and text()='MASTER']"));
//        WebElement master3 = driver.findElement(By.xpath("//h1[@class='h1' and text()='MASTER']"));        
//        WebElement master4 = driver.findElement(By.linkText("MASTER"));
        
	    master.click();  
//	    master1.click();  
//	    master2.click();  
//	    master3.click();  
//	    master4.click();  
		
		
//	     //	button position testing 
//			String txt = master.getText();
//			System.out.println(txt);
//			String txt1 = "Master";
//			
//			
//			if (txt == txt1) {
//				System.out.print(false);
//			}
//			 
//			
//	        Point point = master.getLocation();
//	        double x= point.getX();
//	        double y= point.getY();
//	        System.out.println("x=>"+ x +"y =>" + y);
	       
//	   //   button color testing 
//	        String color = master.getCssValue("background-color");
//	        System.out.println(color);
//	        
//	       
//	        Rectangle rect = driver.findElement(By.id("property")).getRect();
//	        System.out.println("reat"+rect.getHeight());
//	        System.out.println(rect.getWidth());
//	        System.out.println(rect.getPoint());
//
//	       
//	       
//	        Dimension dime = rect.getDimension();
//	        System.out.println("dime"+dime);
//	        System.out.println(dime.getHeight());
//	        System.out.println(dime.getWidth());
//	       
//	        boolean isDisable = driver.findElement(By.id("isDisabled")).isEnabled();
//	        System.out.println(isDisable);
		
//		    //display test
//	     	boolean isDisplayed = master.isEnabled();
//	        System.out.println(isDisplayed);
		

	}

}
