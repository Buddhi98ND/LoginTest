
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class WebForm extends PageObject{
    private final String USER_NAME = "buddhishani";
    private final String PASSWORD = "buddhi123B@";
    private final String LOCATION = "Colombo";
    //username
    @FindBy(xpath= "//input[@formcontrolname = 'userName']")
    private WebElement txtuser_name;
    //username
    @FindBy(xpath = "//input[@formcontrolname ='password']")
    private WebElement txtpassword;
    // click on dropdown
    @FindBy(xpath = "//div[@class='mat-select-arrow']")
    private WebElement btnLocationArrow;
    //select location from dropdown
    @FindBy(xpath = "(//span[@class='location-dropdown-sub']/..)[1]")
    private WebElement baseLocation;
    //select from dropdown
    @FindBy(xpath = "//span[contains(text(),'Login')]")
    private WebElement submit_button;
    public WebForm(WebDriver driver) {
        super(driver);
    }
    public void enterUserName(){
        waitUntil(txtuser_name);
        this.txtuser_name.sendKeys(USER_NAME);
    }

    public void enterPassword(){
        waitUntil(txtpassword);
        this.txtpassword.sendKeys(PASSWORD);
    }

    public void clickDropdown(){
        waitUntil(btnLocationArrow);
        this.btnLocationArrow.click();
    }

    public void enterLocation(){
        waitUntil(baseLocation);
        this.baseLocation.click();
    }

    public void pressLoginButton(){
        waitUntil(submit_button);
        this.submit_button.click();
        System.out.println("Successful Login");
    }
}