package config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverConfiguration {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    URL url;

    public AppiumDriver<MobileElement> setDesiredCapabilities() throws MalformedURLException {
        desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "ANDROID EMULATOR");
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
        desiredCapabilities.setCapability(MobileCapabilityType.APP, ("src/app-release.apk"));
//        "C:/Users/Halyna/IdeaProjects/appiumtest/src/test/resources/apps/app-release.apk"
        desiredCapabilities.setCapability("avd", "Nexus_6_API_28");
        url = new URL("http://127.0.0.1:4723/wd/hub");
        return new AppiumDriver<>(url, desiredCapabilities);
    }


}
