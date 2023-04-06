package org.example.qazando;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class DeviceFarmLogin {
    private static ScreenLogin ScreenLogin;
    private static AppiumDriver <RemoteWebElement> driver;

    @BeforeClass

    public static void caps() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("browserstack.user", "matheussantos_tVqFZT");
        caps.setCapability("browserstack.key", "key");

        caps.setCapability("app", "bs://<app-id>");

        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");
        caps.setCapability("projet", "First Java Project");
        caps.setCapability("build", "Java Android");
        caps.setCapability("name", "first_test");

        AppiumDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://hub.browserstack.com/wd/hub"), caps);
         ScreenLogin = new ScreenLogin(driver);
    }

    @Test
    public void testLogin() throws InterruptedException {
        ScreenLogin.logar();
    }

}
