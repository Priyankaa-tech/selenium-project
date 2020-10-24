package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot{
	
	public static WebDriver driver;
	
	public static String screenshot(WebDriver driver) throws IOException {
		
		SimpleDateFormat df = new SimpleDateFormat("dd_M_yyyy HH_mm_ss");
		Date date = new Date();
		String currentTime = df.format(date);

		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File destination = new File("D:\\selenium\\screenshot\\"+currentTime+".png");

		FileHandler.copy(source,destination);
		
		return currentTime;
			
	}
}
