package Test;

import Base.Base;
import Pages.TC_3_2_3_SignIn;
import org.testng.annotations.Test;



public class TC_3_2_3_SignInTest extends Base {

    @Test
    public void signIn() throws InterruptedException {
        driver.get(signIn);

        TC_3_2_3_SignIn signin = homepage.SignIn();
        Thread.sleep(3000);

        signin.newemail("wedalir339@vapaka.com");
        Thread.sleep(3000);
        signin.enter_password("M&pc9eNr*2C@96c");
        Thread.sleep(3000);
        signin.login();

    }

}
