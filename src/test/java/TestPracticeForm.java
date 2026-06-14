import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestPracticeForm {
    private WebDriver webDriver;
    private PracticeFormPage practiceFormPage;

    @BeforeEach
    public void before() {
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        webDriver.manage().window().maximize();
        webDriver.get("https://demoqa.com/automation-practice-form");
        practiceFormPage = new PracticeFormPage(webDriver);
    }

    @AfterEach
    public void after() {
        if (webDriver != null) {
            webDriver.manage().window().minimize();
        }
    }

    @Test
    public void StudentRegistrationForm() {
        practiceFormPage.name("Anton", "Antonov");
        practiceFormPage.email("anton@gmail.com");
        practiceFormPage.gender();
        practiceFormPage.mobile("89245562288");
        practiceFormPage.picture();
        practiceFormPage.stateAndCity("Haryana", "Karnal");
        practiceFormPage.clickSubmit();
    }
}
