package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class AvailableNetworksPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public AvailableNetworksPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    private By addWifiNetworkButton = By.id("com.techtask.androidapp.wifisettings:id/addWIFIButton");
    private By availableWifiNetwork = By.xpath("//android.widget.CheckedTextView");
    private By selectedNetworkLabel = By.id("com.techtask.androidapp.wifisettings:id/selectedNetwork");

    public AvailableNetworksPage selectWiFiNetwork(String networkName) {
        for (WebElement i : driver.findElements(availableWifiNetwork)) {
            if (i.getText().contains(networkName)) {
                i.click();
                break;
            }
        }
        return this;
    }

    public String getSelectedNetwork() {
        wait.until(presenceOfElementLocated(selectedNetworkLabel));
        return driver.findElement(selectedNetworkLabel).getText();
    }

    public CreateNewWiFiNetworkPage tapOnAddWifiNetworkButton() {
        wait.until(elementToBeClickable(addWifiNetworkButton));
        driver.findElement(addWifiNetworkButton).click();
        return new CreateNewWiFiNetworkPage(driver);
    }
}
