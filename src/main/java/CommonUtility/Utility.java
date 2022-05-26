package CommonUtility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
   
	public static String getScreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot screen= (TakesScreenshot)driver;
		File fin=screen.getScreenshotAs(OutputType.FILE);
		String Path= System.getProperty("user.dir")+ "//src//test//java//Screenshots/JavapointTitle"+System.currentTimeMillis()+".png";
		try{
			File dest= new File(Path);
			FileUtils.copyFile(fin, dest);
		} catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return Path;
		
	
		
		
		
	}
}
