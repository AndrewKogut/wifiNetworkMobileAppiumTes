import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WiFiTest extends BaseClass {

    @Test
    public void sampleTest() {
        String network1 = "test";
        String network2 = "123456";
        availableNetworksPage.tapOnAddWifiNetworkButton()
                .setSSID(network2)
                .tapOnCreateWiFiButton()
                .tapOnAddWifiNetworkButton()
                .setSSID(network1)
                .tapOnCreateWiFiButton()
                .selectWiFiNetwork(network1);
        assertTrue(availableNetworksPage.getSelectedNetwork().contains(network1));
    }
}
