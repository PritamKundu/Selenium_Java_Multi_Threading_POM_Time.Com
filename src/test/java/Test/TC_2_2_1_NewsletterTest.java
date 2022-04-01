package Test;
import Base.Base;
import Pages.TC_2_1_1_World;
import Pages.TC_2_2_1_Newsletter;
import Pages.TC_3_2_3_SignIn;
import org.testng.annotations.Test;

public class TC_2_2_1_NewsletterTest extends Base {

    @Test
    public void NewsLetter() throws InterruptedException {

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


        TC_2_2_1_Newsletter newsletter = homepage.Newsletter();
        newsletter.news();
        Thread.sleep(3000);
        newsletter.newsclick();
        Thread.sleep(2000);
        newsletter.scrollDown();
        Thread.sleep(2000);
        newsletter.checkboxClick1();
        Thread.sleep(2000);
        newsletter.checkboxClick2();
        Thread.sleep(2000);
        newsletter.checkboxClick3();
        Thread.sleep(2000);
        newsletter.selectAll();
        Thread.sleep(2000);
        newsletter.scrollDown1();
        Thread.sleep(2000);
        newsletter.FB();
        Thread.sleep(2000);
        newsletter.IG();
        Thread.sleep(2000);
        newsletter.TW();
        Thread.sleep(2000);
        newsletter.PT();


    }

}
