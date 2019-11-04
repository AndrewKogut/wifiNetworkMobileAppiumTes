package config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class DriverConfiguration {
    private DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    private URL url;

    public AppiumDriver<MobileElement> setDesiredCapabilities() throws MalformedURLException {
        desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "ANDROID EMULATOR");
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
        desiredCapabilities.setCapability(MobileCapabilityType.APP, getAbsoluteFilePath("apps/app-release.apk"));
        desiredCapabilities.setCapability("avd", "Nexus_6_API_28");
        url = new URL("http://localhost:4723/wd/hub");
        return new AppiumDriver<>(url, desiredCapabilities);
    }

    private String getAbsoluteFilePath (String relativeFilePath) {
        return Optional.ofNullable(getClass().getClassLoader().getResource(relativeFilePath))
                .map(URL::getFile)
                .map(File::new)
                .map(File::getAbsolutePath)
                .orElseThrow(() -> new RuntimeException("Application file \"apps/app-release.apk\" is missing"));
    }
}
