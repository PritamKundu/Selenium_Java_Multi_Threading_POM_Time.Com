package Test;

import Base.Base;
import Pages.TC_3_2_3_SignIn;
import Pages.TC_5_1_1_ManageAccount;
import Pages.TC_5_2_1_HelpCenter;
import org.testng.annotations.Test;

public class TC_5_2_1_HelpCenterTest extends Base {

    @Test
    public void ManageAccount() throws InterruptedException {

        driver.get(signIn);
        TC_3_2_3_SignIn signin = homepage.SignIn();
        Thread.sleep(3000);

        signin.newemail("wedalir339@vapaka.com");
        Thread.sleep(3000);
        signin.enter_password("M&pc9eNr*2C@96c");
        Thread.sleep(3000);
        signin.login();

        TC_5_1_1_ManageAccount manageaccount = homepage.CreateAccount();
        manageaccount.myAccount();

        TC_5_2_1_HelpCenter helpcenter = homepage.AllLinkHelpCenter();
        helpcenter.helpCenter();
        Thread.sleep(2000);
        helpcenter.scrollDown();
        Thread.sleep(2000);
        helpcenter.YourAccountAllClick();
        Thread.sleep(8000);
        helpcenter.s_ManagementClick();
    }

}
