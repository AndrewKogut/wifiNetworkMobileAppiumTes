import config.DriverConfiguration;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.AvailableNetworksPage;
import java.net.MalformedURLException;

public class BaseClass {
    protected AvailableNetworksPage availableNetworksPage;
    private AppiumDriver<MobileElement> driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        driver = new DriverConfiguration().setDesiredCapabilities();
        availableNetworksPage = new AvailableNetworksPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
