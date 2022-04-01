package Test;

import Base.Base;
import Pages.TC_007_Time100;
import Pages.TC_2_1_1_World;
import org.testng.annotations.Test;

public class TC_007_Time100Test extends Base {

    @Test
    public void homepageSearch() throws InterruptedException {
        driver.get(baseurl);
        Thread.sleep(10000);


        TC_2_1_1_World world = homepage.World();
        world.menuClick();


        TC_007_Time100 time100 = homepage.Time100();
        time100.time100();
        Thread.sleep(3000);
        time100.time100Click();
        Thread.sleep(3000);
        time100.scrollDown();
        Thread.sleep(3000);
        time100.Entertainment();
        Thread.sleep(3000);
    }
}
