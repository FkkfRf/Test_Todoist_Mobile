package android;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static android.DataForTests.*;
import static com.codeborne.selenide.Selenide.back;
import static io.qameta.allure.Allure.step;

public class MainPageTests extends BaseTest {

    @DisplayName("Добавить задачу")
    @Test
    void addTaskTest() {
        step("Авторизация", () -> {
            loginPage.loginByEmail(loginEmail, loginPassword);
            changeTimePage.selectChangeTime();
            mainPage.clickPlusButton();
        });
        step("Создать задачу", () -> {
            mainPage.inputTaskName(taskName, taskDescription);
            mainPage.checkAddTask(taskName, taskDescription);
        });
    }

    @DisplayName("Добавить проект")
    @Test
    void addProjectTest() {
        step("Авторизация", () -> {
            loginPage.loginByEmail(loginEmail, loginPassword);
            changeTimePage.selectChangeTime();
        });
        step(" Добавить новый проект", () -> {
            mainPage.clickMenuButton();
            projectPage.checkProjectPage("Projects");
            projectPage.clickAddProjectButon();
            projectPage.createProject(projectName);
            projectPage.checkNewProjectName(projectName);
            back();
        });
        step("Найти созданный проект в общем списке проектов", () -> {
            mainPage.clickMenuButton();
            projectPage.checkProjectPage("Проект 1");
        });
    }
}
