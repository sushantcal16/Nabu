package pagedriver;

import base.BaseTest;
import pages.HeaderPage;
import pages.LoginPage;

public class PageDriver extends BaseTest {
    private LoginPage loginPage= null;
    private HeaderPage headerPage = null;
    public LoginPage loginPage(){
    if(null==loginPage)
        loginPage=new LoginPage();
    return loginPage;
    }

    public HeaderPage headerPage() {
        if(null==headerPage){
            headerPage= new HeaderPage();
        }
        return headerPage;
    }
}
