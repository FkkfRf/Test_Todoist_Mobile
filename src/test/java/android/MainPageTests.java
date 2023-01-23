package android;

import android.page.ChangeTimePage;
import android.page.LoginPage;
import android.page.MainPage;
import android.page.ProjectPage;
import config.MobileConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.back;
import static io.qameta.allure.Allure.step;

public class MainPageTests extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ChangeTimePage changeTimePage = new ChangeTimePage();
    MainPage mainPage = new MainPage();
    ProjectPage projectPage = new ProjectPage();

    @DisplayName("Добавить задачу")
    @Test
    void addTaskTest() {
        step("Авторизация", () ->
                loginPage.loginByEmail(loginEmail, loginPassword));
        step("Закрыть окно установки часового пояса", () ->
                changeTimePage.selectChangeTime());
        step("Нажать кнопку добавления задачи", () ->
                mainPage.clickPlusButton());
        step("Создать задачу с описанием", () ->
                mainPage.inputTaskName("Задача 1", "Описание задачи 1"));
        step("Проверить, что задача создана", () ->
                mainPage.checkAddTask("Задача 1", "Описание задачи 1"));
    }

    @DisplayName("Добавить проект")
    @Test
    void addProjectTest() {
        step("Авторизация", () ->
                loginPage.loginByEmail(loginEmail, loginPassword));
        step("Закрыть окно установки часового пояса", () ->
                changeTimePage.selectChangeTime());
        step("Нажать кнопку меню", () ->
                mainPage.clickMenuButton());
        step("Проверить, что попали на экран проектов", () ->
                projectPage.checkProjectPage("Projects"));
        step("Кликнуть по кнопке добавления проектов +", () ->
                projectPage.clickAddProjectButon());
        step("Добавить новый проект", () -> {
            projectPage.createProject("Проект 1");
            projectPage.checkNewProjectName("Проект 1");
            back();
        });
        step("Найти созданный проект в общем списке проектов", () -> {
            mainPage.clickMenuButton();
            projectPage.checkProjectPage("Проект 1");
        });
    }
}
