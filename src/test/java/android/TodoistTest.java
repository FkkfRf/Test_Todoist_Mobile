package android;

import android.page.ChangeTimePage;
import android.page.LoginPage;
import android.page.MainPage;
import config.MobileConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

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
        changeTimePage.selectChangeTime();
        mainPage.clickPlusButton();
        mainPage.inputTaskName("Задача 1", "Описание задачи 1");

    }
}
