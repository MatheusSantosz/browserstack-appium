package org.example.qazando;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

public class ScreenLogin {

    public ScreenLogin(AppiumDriver<MobileElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @AndroidFindBy(id = "com.example.qazando.espressotests:id/login_username")
    @iOSFindBy(accessibility = "asdas")
    private MobileElement FieldEmail;

    @AndroidFindBy(id = "com.example.qazando.espressotests:id/login_password")
    @iOSFindBy(accessibility = "asdas")
    private MobileElement FieldPassword;

    @AndroidFindBy(id = "com.example.qazando.espressotests:id/login_button")
    @iOSFindBy(accessibility = "asdas")
    private MobileElement btnEnter;




    public void logar()throws InterruptedException{
        Thread.sleep(5000);
        FieldEmail.sendKeys("qazando@gmail.com");
        FieldPassword.sendKeys("1234");
        btnEnter.click();
    }


}
