package Test;
import Base.Base;
import Pages.TC_2_1_1_World;
import Pages.TC_3_2_3_SignIn;
import org.testng.annotations.Test;

public class TC_2_1_1_WorldTest extends Base {

    @Test
    public void World() throws InterruptedException {

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
        world.worldMenuClick();
        Thread.sleep(3000);
        world.scrollDown();
        Thread.sleep(3000);
        world.postClick();
        Thread.sleep(3000);
        world.subscribeClick();
        Thread.sleep(3000);
        world.digital();
        Thread.sleep(3000);
        world.scrollDown1();
        Thread.sleep(3000);
        world.fullName("Prtanta Kundu");
        Thread.sleep(3000);
        world.streetAddress("Khilkhet");
        Thread.sleep(3000);
        world.streetAddress2("Nikunja-2");
        Thread.sleep(3000);
        world.city("Dhaka");
        Thread.sleep(3000);
        world.postalCode("1208");
        Thread.sleep(3000);

    }

}
