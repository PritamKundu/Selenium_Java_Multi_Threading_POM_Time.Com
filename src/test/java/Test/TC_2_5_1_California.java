package Test;

import Base.Base;
import Pages.TC_2_1_1_World;
import Pages.TC_3_2_3_SignIn;
import org.testng.annotations.Test;

public class TC_2_5_1_California extends Base {

    @Test
    public void California() throws InterruptedException {

        driver.get(signIn);

        TC_3_2_3_SignIn signin = homepage.SignIn();
        Thread.sleep(3000);

        signin.newemail("wedalir339@vapaka.com");
        Thread.sleep(3000);
        signin.enter_password("M&pc9eNr*2C@96c");
        Thread.sleep(3000);
        signin.login();
        Thread.sleep(10000);


        TC_2_1_1_World world = homepage.World();
        world.menuClick();


        Pages.TC_2_5_1_California california =homepage.California();
        california.California();
        Thread.sleep(2000);
        california.CaliforniaClick();
        Thread.sleep(2000);
        california.scrollDown1();
        Thread.sleep(2000);
        california.topToBack();

    }

}
