import config.DriverConfiguration;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AvailableNetworksPage;

import java.net.MalformedURLException;

import static org.testng.Assert.assertTrue;

public class BaseClass {
    protected AvailableNetworksPage availableNetworksPage;
    protected AppiumDriver<MobileElement> driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        driver = new DriverConfiguration().setDesiredCapabilities();
        availableNetworksPage = new AvailableNetworksPage(driver);
    }



//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
}
