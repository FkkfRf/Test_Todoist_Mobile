package android.page;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ChangeTimePage {

    private SelenideElement
            title = $(AppiumBy.id("com.todoist:id/alertTitle")),
            neverAskButton = $(AppiumBy.id("android:id/button3"));

    public void selectChangeTime() {
        title.shouldHave(text("Change your Todoist time zone to “GMT”"));
        neverAskButton.click();
    }
}