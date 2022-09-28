package tests;

import lib.Core;
import lib.mainPO;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;


public class settings extends Core {

    @Before
    public void settingsPage() {
        mainPO pom = new mainPO(this.driver);

        WebElement skip = pom.waitForElementPresent(
                "id:org.wikipedia:id/fragment_onboarding_skip_button",
                "Cannot find 'skip' button");
        skip.click();

        WebElement menu = pom.waitForElementPresent(
                "id:org.wikipedia:id/menu_icon",
                "Cannot find 'menu' icon");
        menu.click();

        WebElement settingsContainer = pom.waitForElementPresent(
                "id:org.wikipedia:id/main_drawer_settings_container",
                "Cannot find 'settings' button");
        settingsContainer.click();
    }

    @Test
    public void about() {
        mainPO pom = new mainPO(this.driver);

        WebElement aboutW = pom.swipeUpToFindElement(
                "xpath://*[./*[contains(@text, 'About the Wikipedia app')]]",
                "Cannot find 'About the Wikipedia app' button", 5);
        aboutW.click();
    }

    @Test
    public void faq() {
        mainPO pom = new mainPO(this.driver);

        WebElement aboutW = pom.swipeUpToFindElement(
                "xpath://*[./*[contains(@text, 'Wikipedia App FAQ')]]",
                "Cannot find 'Wikipedia App FAQ' button", 5);
        aboutW.click();

//        Применимо, если эмулятор ещё не запускал браузер Chrome.
//        WebElement termsAgree = pom.waitForElementPresent(
//                "id:com.android.chrome:id/terms_accept",
//                "Cannot find 'Accept' button");
//        termsAgree.click();
//
//        WebElement negative = pom.waitForElementPresent(
//                "id:com.android.chrome:id/negative_button",
//                "Cannot find 'No, Thanks' button");
//        negative.click();
    }

    @Test
    public void blackTheme() {
        mainPO pom = new mainPO(this.driver);

        WebElement appTheme = pom.waitForElementPresent(
                "xpath://*[./*[contains(@text, 'App theme')]]",
                "Cannot find 'App theme' button");
        appTheme.click();

        WebElement systemTheme = pom.waitForElementPresent(
                "id:org.wikipedia:id/theme_chooser_match_system_theme_switch",
                "Cannot find system theme switch");
        systemTheme.click();

        WebElement blackThemeButton = pom.waitForElementPresent(
                "id:org.wikipedia:id/button_theme_black",
                "Cannot find black theme button");
        blackThemeButton.click();
    }

    @Test
    public void privacyPolicy() {
        mainPO pom = new mainPO(this.driver);

        WebElement privacy = pom.swipeUpToFindElement(
                "xpath://*[./*[contains(@text, 'Privacy policy')]]",
                "Cannot find 'Privacy policy' button", 5);
        privacy.click();

//        Применимо, если эмулятор ещё не запускал браузер Chrome.
//        WebElement termsAgree = pom.waitForElementPresent(
//                "id:com.android.chrome:id/terms_accept",
//                "Cannot find 'Accept' button");
//        termsAgree.click();
//
//        WebElement negative = pom.waitForElementPresent(
//                "id:com.android.chrome:id/negative_button",
//                "Cannot find 'No, Thanks' button");
//        negative.click();
    }

    @Test
    public void termsOfUse() {
        mainPO pom = new mainPO(this.driver);

        WebElement terms = pom.swipeUpToFindElement(
                "xpath://*[./*[contains(@text, 'Terms of use')]]",
                "Cannot find 'Terms of use' button", 5);
        terms.click();

//        Применимо, если эмулятор ещё не запускал браузер Chrome.
//        WebElement termsAgree = pom.waitForElementPresent(
//                "id:com.android.chrome:id/terms_accept",
//                "Cannot find 'Accept' button");
//        termsAgree.click();
//
//        WebElement negative = pom.waitForElementPresent(
//                "id:com.android.chrome:id/negative_button",
//                "Cannot find 'No, Thanks' button");
//        negative.click();
    }
}
