package Test;

import Base.Base;
import Pages.TC_2_1_1_World;
import Pages.TC_2_4_1_PressRoom;
import Pages.TC_3_2_3_SignIn;
import org.testng.annotations.Test;

public class TC_2_4_1_PressRoomTest extends Base {

    @Test
    public void PressRoom() throws InterruptedException {

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


        TC_2_4_1_PressRoom pressroom =homepage.PressRoom();
        pressroom.PressRoom();
        Thread.sleep(2000);
        pressroom.pressRoomClick();
        Thread.sleep(2000);
        pressroom.postClick();

    }

}
