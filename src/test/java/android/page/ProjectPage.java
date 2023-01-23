package android.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProjectPage {
    private ElementsCollection
            projectTexts = $$(AppiumBy.className("android.widget.TextView"));

    private SelenideElement
            addProjectButton = $(AppiumBy.id("com.todoist:id/add")),
            projectName = $(AppiumBy.id("com.todoist:id/name")),
            submitButton = $(AppiumBy.id("com.todoist:id/menu_form_submit"));

    public void checkProjectPage(String name) {
        projectTexts.findBy(Condition.text(name)).exists();
    }

    public void clickAddProjectButon() {
        addProjectButton.click();
    }

    public void createProject(String name) {
        projectName.sendKeys(name);
        submitButton.click();
    }

    public void checkNewProjectName(String name) {
        projectTexts.findBy(Condition.text(name)).exists();
    }
}
