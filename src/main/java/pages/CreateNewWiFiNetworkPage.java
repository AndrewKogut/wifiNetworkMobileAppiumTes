package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class CreateNewWiFiNetworkPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public CreateNewWiFiNetworkPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    private By ssidInput = By.xpath("//android.widget.EditText");
    private By createWiFiButton = By.id("com.techtask.androidapp.wifisettings:id/createwifibutton");

    public CreateNewWiFiNetworkPage setSSID(String networkName) {
        wait.until(elementToBeClickable(ssidInput));
        driver.findElement(ssidInput).clear();
        driver.findElement(ssidInput).sendKeys(networkName);
        return this;
    }

    public AvailableNetworksPage tapOnCreateWiFiButton() {
        wait.until(elementToBeClickable(createWiFiButton));
        driver.findElement(createWiFiButton).click();
        return new AvailableNetworksPage(driver);
    }

}
