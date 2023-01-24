package android;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import static io.qameta.allure.Allure.step;

public class RescheduleTests extends BaseTest{
    @Test
    public void addTimeInScheduler(){

        Date dateNow = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
        timeFormat.setTimeZone(TimeZone.getTimeZone("GMT+00"));
        String timeNow = timeFormat.format(dateNow).replace(" ","");

        System.out.println("Текущее время " + timeNow);

        step("Авторизация", () -> {
            loginPage.loginByEmail(loginEmail, loginPassword);
            changeTimePage.selectChangeTime();
            mainPage.clickPlusButton();
        });
        step("Добавить время планировщике", () -> {
            mainPage.clickReschedulerButton();
            reschedulePage.clickAddTimeButton();
            timeZonePage.clickAnswer("OK");
            reschedulePage.checkSchedulerTime(timeNow);
            reschedulePage.clickRescheduleButton();
        });
    }
}
