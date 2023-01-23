package android.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    private ElementsCollection
            taskDescriptions = $$(AppiumBy.id("com.todoist:id/description")),
            buttons1 = $$(AppiumBy.id("android:id/button1"));
    ;
    private SelenideElement
            plusButton = $(AppiumBy.id("com.todoist:id/fab")),
            taskName = $(AppiumBy.id("android:id/message"));

    public void clickPlusButton() {
        plusButton.exists();
        plusButton.click();
    }

    public void inputTaskName(String name, String description) {
        taskName.sendKeys(name);
        taskDescriptions.findBy(Condition.text("Description")).sendKeys(description);
        buttons1.get(1).click();
    }
}
