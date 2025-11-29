package NewPractise;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCartMethodoLogy {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(8000);
	    List <String> data= Arrays.asList("Brocolli","Tomato","Beans");
	    List <WebElement> products= driver.findElements(By.xpath("//div[@class='product']"));
	    for(WebElement product:products)
	    {
	    	String vegName=product.findElement(By.tagName("h4")).getText().trim();
	    	String[] vegFormat=vegName.split("-");
	    	System.out.println("vegFormat----->"+vegFormat[0]);
	    	if(data.contains(vegFormat[0].trim()))
	    	{
	    		WebElement addCartButton=product.findElement(By.xpath(".//div[@class='product-action']/button"));
				//Added for cart add
	    		addCartButton.click();
	    	}
	    }

	}

}
