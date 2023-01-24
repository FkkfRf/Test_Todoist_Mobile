package android.page;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ReschedulePage {
    private SelenideElement
            schedulerTimeButton = $(AppiumBy.id("com.todoist:id/scheduler_time")),
            rescheduleButton = $(AppiumBy.id("com.todoist:id/scheduler_submit"));

    @Step("Кликнуть кнопку ADD TIME")
    public void clickAddTimeButton() {
        schedulerTimeButton.click();
    }

    @Step("Проверить установленное время")
    public void checkSchedulerTime(String time) {
        schedulerTimeButton.shouldHave(text(time));
    }

    @Step("Кликнуть кнопку RESHEDULE")
    public void clickRescheduleButton() {
        rescheduleButton.click();
    }

}
