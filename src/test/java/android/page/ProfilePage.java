package android.page;

import com.codeborne.selenide.ElementsCollection;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.actions;

public class ProfilePage {
    private ElementsCollection
            profieTitles = $$(AppiumBy.id("android:id/title"));
    public void clickLogOut() {
        profieTitles.findBy(text("Reminders")).click();
    }
}
