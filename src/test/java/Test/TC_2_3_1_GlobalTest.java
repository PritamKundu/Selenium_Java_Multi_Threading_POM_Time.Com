package Test;
import Base.Base;
import Pages.TC_2_1_1_World;
import Pages.TC_3_2_3_SignIn;
import org.testng.annotations.Test;
import Pages.TC_2_3_1_GlobalHelpCenter;

public class TC_2_3_1_GlobalTest extends Base {

    @Test
    public void GlobalTest() throws InterruptedException {

        driver.get(signIn);

        TC_3_2_3_SignIn signin = homepage.SignIn();
        Thread.sleep(3000);

        signin.newemail("wedalir339@vapaka.com");
        Thread.sleep(3000);
        signin.enter_password("M&pc9eNr*2C@96c");
        Thread.sleep(3000);
        signin.login();
        Thread.sleep(5000);


        TC_2_1_1_World world = homepage.World();
        world.menuClick();


        TC_2_3_1_GlobalHelpCenter global =homepage.Global();
        global.globalCenter();
        Thread.sleep(2000);
        global.globalCenterClick();
        Thread.sleep(2000);
        global.digitalSubscription();
        Thread.sleep(2000);
        global.allLinks();

    }

}
