package Test;

import Base.Base;
import Pages.TC_3_1_2_Facebook;
import org.testng.annotations.Test;

public class TC_3_1_2_FacebookTest extends Base {

    @Test
    public void Facebook() throws InterruptedException {

        driver.get(signIn);
        TC_3_1_2_Facebook facebook = homepage.Facebook();
        Thread.sleep(3000);
        facebook.Facebook();


    }

}
