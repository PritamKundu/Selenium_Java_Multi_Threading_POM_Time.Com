package Test;


import Base.Base;
import org.testng.annotations.Test;


public class TC_001_OpenWebsiteTest extends Base {

    @Test
    public void BrowserOpen(){
        driver.get(baseurl);
     }



}
