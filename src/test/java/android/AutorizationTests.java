package android;

import android.page.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AutorizationTests extends BaseTest {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    ProjectPage projectPage = new ProjectPage();
    ProfilePage profilePage = new ProfilePage();
    AlarmPage alarmPage = new AlarmPage();
    ChangeTimePage changeTimePage = new ChangeTimePage();

    @DisplayName("Успешная авторизация")
    @Test
    void addTaskTest() {

        step("Авторизация ", () ->
                loginPage.loginByEmail(loginEmail, loginPassword));
        step("Проверка перехода на главный экран ", () ->
                mainPage.checkMainPage());
    }

    @DisplayName("Log out")
    @Test
    void logOutTest() {

        step("Авторизация ", () -> {
            loginPage.loginByEmail(loginEmail, loginPassword);
            changeTimePage.selectChangeTime();
        });
        step("Проверка перехода на главный экран ", () ->
                mainPage.checkMainPage());
        step("Перейти в профиль пользователя ", () ->{
                    mainPage.clickMenuButton();
                    projectPage.clickProfileButton();
                });
        step("Нажать Log Out ", () -> {
            TouchActions action = new TouchActions(driver);
            action.flick(element, 1, 10, 10);
            action.perform();
            profilePage.clickLogOut();
            alarmPage.clickAnswer("YES");
        });
    }
}
