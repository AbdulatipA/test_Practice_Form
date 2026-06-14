import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeFormPage {
    private final WebDriver webDriver;

    private final By firstName = By.xpath("//input[@id='firstName']");
    private final By lastName = By.xpath("//input[@id='lastName']");

    private final By email = By.xpath("//input[@id ='userEmail']");

    private final By gender = By.cssSelector("label[for='gender-radio-1']");

    private final By mobile = By.xpath("//input[@id='userNumber']");

    private final By picture = By.xpath("//input[@id='uploadPicture']");
    private final String filePath = "D:\\1Programming\\JavaProjects\\QA\\Testing_practice_form\\Snapshot.jpg";

    private final By state = By.cssSelector("#state");
    private final By city = By.cssSelector("#city");

    private final By btnSubmit = By.cssSelector("#submit");

    public void name(String firstName, String lastName) {
        webDriver.findElement(this.firstName).sendKeys(firstName);
        webDriver.findElement(this.lastName).sendKeys(lastName);
    }

    public void email(String email) {
        webDriver.findElement(this.email).sendKeys(email);
    }

    public void gender() {
        webDriver.findElement(gender).click();
    }

    public void mobile(String number) {
        webDriver.findElement(mobile).sendKeys(number);
    }

    public void picture() {
        webDriver.findElement(picture).sendKeys(filePath);
    }

    public void stateAndCity(String targetState, String targetCity) {
        webDriver.findElement(state).click();
        By stateList = By.xpath("//div[contains(@id, 'react-select') and text()='" + targetState + "']");
        webDriver.findElement(stateList).click();

        webDriver.findElement(city).click();
        By cityList = By.xpath("//div[contains(@id, 'react-select') and text()='" + targetCity + "']");
        webDriver.findElement(cityList).click();
    }

    public void clickSubmit(){
        webDriver.findElement(btnSubmit).click();
    }



    public PracticeFormPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
