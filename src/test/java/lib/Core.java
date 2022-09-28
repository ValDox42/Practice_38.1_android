package lib;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Core {

    protected AndroidDriver driver;
    private static final String APPIUM_URL = "http://127.0.0.1:4723/wd/hub";

    @Before
    public void setUp() throws MalformedURLException {
        URL URL = new URL(APPIUM_URL);
        this.driver = new AndroidDriver(URL, this.getAndroidDesiredCapabilities());
    }

    private DesiredCapabilities getAndroidDesiredCapabilities()
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","ANDROID");
        capabilities.setCapability("avd","ver10");
        capabilities.setCapability("deviceName","AndroidTestDevice");
        capabilities.setCapability("platformVersion","10.0");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("appPackage","org.wikipedia");
        capabilities.setCapability("appActivity",".main.MainActivity");
        capabilities.setCapability("app","C:\\Users\\valdo\\Downloads\\org.wikipedia_2.7.50418-r-2022-08-08_50418.apk");
        return capabilities;
    }
}
