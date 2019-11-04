import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WiFiTest extends BaseClass {

    @Test
    public void addWiFiNetworkTest() {
        String networkName = "test";
        availableNetworksPage.tapOnAddWifiNetworkButton()
                .setSSID(networkName)
                .tapOnCreateWiFiButton()
                .selectWiFiNetwork(networkName);
        assertTrue(availableNetworksPage.getSelectedNetwork().contains(networkName));
    }
}
