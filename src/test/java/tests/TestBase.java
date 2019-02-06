package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import okio.Options;


public class TestBase {


	public static WebDriver driver;


	@BeforeSuite
	@Parameters({"browser"})
	public void startDriver(@Optional("chrome")String browserName)
	{


		//Run Browsers Drivers
		if (browserName.equalsIgnoreCase("Chrome")) {

			String chromePath=System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";

			System.setProperty("webdriver.chrome.driver",chromePath);

			driver = new ChromeDriver();

		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			String FirefoxPath = System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe";

			System.setProperty("webdriver.gecko.driver", FirefoxPath);

			driver =new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("headless")) 
		{
			DesiredCapabilities caps =new DesiredCapabilities();
			caps.setJavascriptEnabled(true);
			String PhatnomPath=System.getProperty("user.dir")+"\\Drivers\\phantomjs.exe";
			caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, PhatnomPath);

			String[] phatnomJsArgs= {"--web-security=no","--ignore-ssl-errors=yes"};
			caps.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, phatnomJsArgs);
			driver =new PhantomJSDriver(caps);
		}

		else if (browserName.equalsIgnoreCase("chromeheadless"))
		{



			String chromePath=System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";

			System.setProperty("webdriver.chrome.driver",chromePath);

			ChromeOptions options= new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("--window-size=1920,1080");
			driver =new ChromeDriver(options);

		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			String IEPath = System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe";

			System.setProperty("webdriver.ie.driver", IEPath);

			driver =new InternetExplorerDriver();
		}




		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.nopcommerce.com/");	
	}

	@AfterSuite
	public void stopDriver()
	{

		//driver.quit();

	}




}
