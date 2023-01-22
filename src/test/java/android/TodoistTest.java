package android;

import android.page.LoginPage;
import config.MobileConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class TodoistTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    MobileConfig mobileConfig = ConfigFactory.create(MobileConfig.class);

    String loginEmail = mobileConfig.Email();
    String loginPassword = mobileConfig.Passord();

    @Test
    void addProgectTest() {
        loginPage.loginByEmail(loginEmail, loginPassword);


    }
}
