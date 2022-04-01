package Test;
import Base.Base;
import Pages.TC_2_1_1_World;
import Pages.TC_2_2_2_ShopOnTime;
import Pages.TC_3_2_3_SignIn;
import org.testng.annotations.Test;

public class TC_2_2_2_ShopOnTimeTest extends Base {

    @Test
    public void ShopOnTime() throws InterruptedException {

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


        TC_2_2_2_ShopOnTime newsletter = homepage.Shop();
        newsletter.shopTime();
        Thread.sleep(2000);
        newsletter.shopthetime();
        Thread.sleep(2000);
        newsletter.scrollDown();
        Thread.sleep(2000);
        newsletter.featuredClick();
        Thread.sleep(2000);
        newsletter.coverClick();
        Thread.sleep(2000);
        newsletter.priceboxClick();
        newsletter.scrollDown1();
        Thread.sleep(2000);
        newsletter.printClick();
        Thread.sleep(2000);
        newsletter.printSizeClick();
        Thread.sleep(2000);
        newsletter.canvasWrap();
        Thread.sleep(2000);
        newsletter.canvasWrapClick();
        Thread.sleep(20000);
        newsletter.canvasType();
        Thread.sleep(2000);
        newsletter.canvasTypeClick();
        Thread.sleep(2000);
        newsletter.frameMenuClick();
        Thread.sleep(2000);
        newsletter.frameColor();
        Thread.sleep(2000);
        newsletter.frameColorClick();
        Thread.sleep(2000);
        newsletter.frameClick();
        Thread.sleep(2000);
        newsletter.addToCurt();

    }

}
