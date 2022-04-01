package Pages;
import org.openqa.selenium.WebDriver;


public class Homepage {
    public WebDriver driver;

    public Homepage(WebDriver driver){
        this.driver = driver;
    }


    public TC_3_2_3_SignIn SignIn(){
        return new TC_3_2_3_SignIn(driver);
    }

    public TC_2_1_1_World World(){
        return new TC_2_1_1_World(driver);
    }
    public TC_2_1_2_Business business(){
        return new TC_2_1_2_Business(driver);
    }
    public TC_2_1_3_Science Science(){
        return new TC_2_1_3_Science(driver);
    }

    public TC_2_2_1_Newsletter Newsletter(){
        return new TC_2_2_1_Newsletter(driver);
    }

    public TC_2_2_2_ShopOnTime Shop(){
        return new TC_2_2_2_ShopOnTime(driver);
    }
    public TC_2_3_1_GlobalHelpCenter Global(){
        return new TC_2_3_1_GlobalHelpCenter(driver);
    }
    public TC_2_4_1_PressRoom PressRoom(){
        return new TC_2_4_1_PressRoom(driver);
    }
    public TC_2_5_1_California California(){
        return new TC_2_5_1_California(driver);
    }
    public TC_3_1_1_Google Google(){
        return new TC_3_1_1_Google(driver);
    }
    public TC_3_1_2_Facebook Facebook(){
        return new TC_3_1_2_Facebook(driver);
    }
    public TC_5_1_1_ManageAccount CreateAccount(){
        return new TC_5_1_1_ManageAccount(driver);
    }
    public TC_2_6_SocialIcon SocialIcon(){
        return new TC_2_6_SocialIcon(driver);
    }
    public TC_5_2_1_HelpCenter AllLinkHelpCenter(){
        return new TC_5_2_1_HelpCenter(driver);
    }
    public TC_5_3_SignOut signout(){
        return new TC_5_3_SignOut(driver);
    }

    public TC_007_Time100 Time100(){
        return new TC_007_Time100(driver);
    }


    public TC_006_Search Search() {
        return new TC_006_Search(driver);
    }
    public TC_004_Subscribe Subscribe() {
        return new TC_004_Subscribe(driver);
    }

}