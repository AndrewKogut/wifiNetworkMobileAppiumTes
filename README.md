# appiumtest

To run the test please do the following actions:
1) Download Appium Server from https://github.com/appium/appium-desktop/releases/tag/v1.15.1 install it and run.
2) Checkout 'appiumtest' project from the https://github.com/AndrewKogut/appiumtest.git
3) Download, instal and run Android studio (https://developer.android.com/studio).
4) Set ANDROID_HOME environment variable to the Android SDK root directory path.
5) Open Android Studio, click 'AVD Manager', create Virtual Device and get its name.
6) Change AVD Name in the following row - /src/main/java/config/DriverConfiguration.class/row 24 (i.e. set "Nexus_6_API_28".
7) Run the 'addWiFiNetworkTest' from 'WiFiTest.class'.
