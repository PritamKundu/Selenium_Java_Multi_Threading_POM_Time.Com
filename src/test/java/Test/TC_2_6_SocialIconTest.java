package Test;

import Base.Base;
import Pages.TC_2_1_1_World;
import Pages.TC_2_6_SocialIcon;
import Pages.TC_3_2_3_SignIn;
import org.testng.annotations.Test;

public class TC_2_6_SocialIconTest extends Base {

    @Test
    public void SocialLink() throws InterruptedException {
        driver.get(baseurl);

        TC_3_2_3_SignIn signin = homepage.SignIn();
        Thread.sleep(3000);

        TC_2_1_1_World world = homepage.World();
        world.menuClick();
        Thread.sleep(3000);

        TC_2_6_SocialIcon socialicon = homepage.SocialIcon();
        Thread.sleep(5000);
        socialicon.socialIconClick();
    }

}
