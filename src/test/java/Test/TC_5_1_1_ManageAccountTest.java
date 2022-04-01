package Test;

import Base.Base;
import Pages.TC_3_2_3_SignIn;
import Pages.TC_5_1_1_ManageAccount;
import org.testng.annotations.Test;

public class TC_5_1_1_ManageAccountTest extends Base {

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
        Thread.sleep(5000);

        TC_5_1_1_ManageAccount manageaccount = homepage.CreateAccount();
        manageaccount.myAccount();
        Thread.sleep(2000);
        manageaccount.manageAccount();
        Thread.sleep(2000);
        manageaccount.scrollDown();
        Thread.sleep(2000);
        manageaccount.printClick();
        Thread.sleep(2000);
        manageaccount.subscriptionAccount();
        Thread.sleep(2000);
        manageaccount.countryFind();
        Thread.sleep(2000);
        manageaccount.linkSubscriptionClick();

    }

}
