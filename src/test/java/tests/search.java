package tests;

import lib.Core;
import lib.mainPO;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;


public class search extends Core {

    @Before
    public void searchPage() {
        mainPO pom = new mainPO(this.driver);

        WebElement skip = pom.waitForElementPresent(
                "id:org.wikipedia:id/fragment_onboarding_skip_button",
                "Cannot find 'skip' button");
        skip.click();
    }

    @Test
    public void todayOnWiki() {
        mainPO pom = new mainPO(this.driver);

        WebElement featuredArticle = pom.waitForElementPresent(
                "id:org.wikipedia:id/view_card_header_title",
                "Cannot find 'Featured article' header");

        WebElement today = pom.swipeUpToFindElement(
                "xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button",
                "Cannot find 'Today on Wikipedia' button", 5);
        today.click();
    }

    @Test
    public void moreThisDay() {
        mainPO pom = new mainPO(this.driver);

        WebElement featuredArticle = pom.waitForElementPresent(
                "id:org.wikipedia:id/view_card_header_title",
                "Cannot find 'Featured article' header");

        WebElement moreTD = pom.swipeUpToFindElement(
                "xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.Button",
                "Cannot find 'More on this day' button", 15);
        moreTD.click();
    }

    @Test
    public void moreTopRead() {
        mainPO pom = new mainPO(this.driver);

        WebElement featuredArticle = pom.waitForElementPresent(
                "id:org.wikipedia:id/view_card_header_title",
                "Cannot find 'Featured article' header");

        WebElement topRead = pom.swipeUpToFindElement(
                "xpath://*[./*[contains(@text, 'More top read')]]",
                "Cannot find 'More top read' button", 15);
        topRead.click();
    }

    @Test
    public void search() {
        mainPO pom = new mainPO(this.driver);

        WebElement search = pom.waitForElementPresent(
                "xpath://android.widget.FrameLayout[@content-desc=\"Search\"]/android.widget.FrameLayout/android.widget.ImageView",
                "Cannot find search menu");
        search.click();

        WebElement searchCard = pom.waitForElementPresent(
                "id:org.wikipedia:id/search_card",
                "Cannot find search field");
        searchCard.click();

        WebElement send = pom.waitForElementPresent(
                "id:org.wikipedia:id/search_src_text",
                "Cannot enter text");
        send.sendKeys("Led zeppelin");

        WebElement led = pom.waitForElementPresent(
                "xpath://*[./*[contains(@text, 'English rock band')]]",
                "Cannot find search result");
        led.click();
    }
}
