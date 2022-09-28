package tests;

import lib.Core;
import lib.mainPO;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class negativeAuth extends Core {

    @Test
    public void authAttempt() {
        mainPO pom = new mainPO(this.driver);

        WebElement skip = pom.waitForElementPresent(
                "id:org.wikipedia:id/fragment_onboarding_skip_button",
                "Cannot find 'skip' button");
        skip.click();

        WebElement menu = pom.waitForElementPresent(
                "id:org.wikipedia:id/menu_icon",
                "Cannot find 'menu' icon");
        menu.click();

        WebElement logInScreen = pom.waitForElementPresent(
                "id:org.wikipedia:id/main_drawer_login_button",
                "Cannot find 'Log In' button in 1st case");
        logInScreen.click();

        WebElement logIn = pom.waitForElementPresent(
                "id:org.wikipedia:id/create_account_login_button",
                "Cannot find 'Log In' button in 2nd case");
        logIn.click();

        WebElement sendUser = pom.waitForElementPresent(
                "xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText",
                "Cannot find 'Username' field");
        sendUser.sendKeys("123");

        WebElement sendPass = pom.waitForElementPresent(
                "xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText",
                "Cannot find 'Password' field");
        sendPass.sendKeys("123");

        WebElement logInButton = pom.waitForElementPresent(
                "id:org.wikipedia:id/login_button",
                "Cannot find 'Log In' button in 3rd case");
        logInButton.click();

        String result = pom.waitForElementAndGetAttribute(
                "id:org.wikipedia:id/snackbar_text",
                "text",
                "Cannot find attribute",
                Duration.ofSeconds(30));
        System.out.println(result);

    }
}
