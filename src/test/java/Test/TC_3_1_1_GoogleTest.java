package Test;

import Base.Base;

import Pages.TC_3_1_1_Google;
import org.testng.annotations.Test;

public class TC_3_1_1_GoogleTest extends Base {

    @Test
    public void Google() throws InterruptedException {

        driver.get(signIn);
        TC_3_1_1_Google google = homepage.Google();
        Thread.sleep(3000);
        google.Google();


    }

}
