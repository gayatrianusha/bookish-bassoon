import java.net.MalformedURLException;
import java.net.URL;
import java.security.DrbgParameters.Capability;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WIN10);
		String str="http://192.168.29.142:4444";
		WebDriver driver= new RemoteWebDriver(new URL(str),options);
		driver.get("https://www.google.com");
		
		

	}

}
