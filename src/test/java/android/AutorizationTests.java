package android;

import android.page.LoginPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AutorizationTests extends BaseTest{
    LoginPage loginPage = new LoginPage();
    @DisplayName("Авторизация с некорректным паролем")
    @Test
    void addTaskTest() {

        step("Авторизация ", () ->
                loginPage.loginByEmail(loginEmail, "Password"));
    }
}
