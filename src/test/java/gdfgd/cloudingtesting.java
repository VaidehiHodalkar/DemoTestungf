package gdfgd;
import java.net.MalformedURLException;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;
public class cloudingtesting {
	
	public static void main(String[] args) throws MalformedURLException {

	// TODO Auto-generated method stub

		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 11");
		browserOptions.setBrowserVersion("latest");
		Map<String, Object> sauceOptions = new HashMap<>();
		sauceOptions.put("username", "oauth-vaishakhodalkar7-ac17b");
		sauceOptions.put("accessKey", "6e137c1d-8f66-43ad-976f-a88147218b8e");
		sauceOptions.put("build", "selenium-build-JLU59");
		sauceOptions.put("name", "<your test name>");
		browserOptions.setCapability("sauce:options", sauceOptions);
		
		// start the session
		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);

		// run commands and assertions
		driver.get("https://saucedemo.com");
		String title = driver.getTitle();
		boolean titleIsCorrect = title.contains("Swag Labs");
		String jobStatus = titleIsCorrect ? "passed" : "failed";

		// end the session
		driver.executeScript("sauce:job-result=" + jobStatus);
		driver.quit();
	}
}
