package org.example.qazando;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
        import java.net.URL;

public class TestLogin {

    public static String local = "";
    public static String plataforma = "";


    private static ScreenLogin ScreenLogin;

    @BeforeClass


    public static void caps() throws MalformedURLException {

        local = System.getProperty("local").toLowerCase();
        plataforma = System.getProperty("plataforma").toLowerCase();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (local.equals("local") && plataforma.equals("android")) {

            capabilities.setCapability("app", "C:\\Users\\Windows\\IdeaProjects\\qazando\\apps\\app-debug.apk");
            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("platformName", "Android");

            AppiumDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
            ScreenLogin = new ScreenLogin(driver);
        } else {

            capabilities.setCapability("app", "C:\\Users\\Windows\\IdeaProjects\\qazando\\apps\\LoginExample.app");
            capabilities.setCapability("deviceName", "iPhone13");
            capabilities.setCapability("platformName", "IOS");
            capabilities.setCapability("automatioName", "XCUITest");

            AppiumDriver<MobileElement> driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
            ScreenLogin = new ScreenLogin(driver);

        }
    }
    @Test
    public void testLogin() throws InterruptedException {
        ScreenLogin.logar();
    }



}