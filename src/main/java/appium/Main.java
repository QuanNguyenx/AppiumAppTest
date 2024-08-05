package appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Date;

public class Main {

//    Appium code -> Appium Server --> Mobile
    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        verifyHistoryEvents(driver);
//        verifyVersion(driver);
        System.out.println("HelloWorld");
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("IVAHome");
        options.setApp("//app//Projs//resources//ApiDemos-debug.apk");
        String appiumUrl = "http://127.0.0.1:4723";
        AndroidDriver driver = new AndroidDriver(new URI(appiumUrl).toURL(), options);

//        driver.quit();
    }
}
