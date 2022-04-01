package Test;
import Base.Base;
import Pages.TC_2_1_1_World;
import Pages.TC_2_1_2_Business;
import Pages.TC_3_2_3_SignIn;
import org.testng.annotations.Test;

public class TC_2_1_2_BusinessTest extends Base {

    @Test
    public void Business() throws InterruptedException {

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
        Thread.sleep(3000);

        TC_2_1_2_Business business = homepage.business();
        business.businessMenuClick();
        Thread.sleep(3000);
        business.scrollDown();
        Thread.sleep(3000);
        business.postClick();
        Thread.sleep(3000);
        business.scrollDown1();
        Thread.sleep(3000);
        business.Contact();
        Thread.sleep(3000);
        business.contactClick();

    }

}
