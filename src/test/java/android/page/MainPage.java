package android.page;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement
            plusButton = $(AppiumBy.id("com.todoist:id/fab")),
    taskName = $(AppiumBy.id("android:id/message")),

    taskDescription = $(AppiumBy.id("com.todoist:id/description")),

    addButton =  $(AppiumBy.id("android:id/button1"));

    public void clickPlusButton() {
        plusButton.click();
    }
    public void inputTaskName(String name, String description) {
        taskName.sendKeys(name);
        taskDescription.sendKeys(description);
        addButton.click();
    }
}
