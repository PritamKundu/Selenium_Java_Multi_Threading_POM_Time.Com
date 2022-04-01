package Test;

import Base.Base;
import Pages.TC_004_Subscribe;
import org.testng.annotations.Test;

public class TC_004_SubscribeTest extends Base {

    @Test
    public void Google() throws InterruptedException {

        driver.get(SubscribeUrl);
        TC_004_Subscribe subscribe = homepage.Subscribe();
        Thread.sleep(3000);
        subscribe.subsCribe();
        Thread.sleep(3000);
    }

}
