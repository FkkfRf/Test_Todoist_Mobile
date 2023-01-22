package android;

import android.page.ChangeTimePage;
import android.page.LoginPage;
import android.page.MainPage;
import config.MobileConfig;
import io.appium.java_client.AppiumBy;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class TodoistTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ChangeTimePage changeTimePage = new ChangeTimePage();
    MainPage mainPage = new MainPage();
    MobileConfig mobileConfig = ConfigFactory.create(MobileConfig.class);

    String loginEmail = mobileConfig.Email();
    String loginPassword = mobileConfig.Passord();

    @Test
    void addTaskTest() {
        loginPage.loginByEmail(loginEmail, loginPassword);
        $(AppiumBy.id("com.todoist:id/fab")).click();
        changeTimePage.selectChangeTime();
        mainPage.clickPlusButton();
        mainPage.inputTaskName("Задача 1", "Описание задачи 1");

    }
}
