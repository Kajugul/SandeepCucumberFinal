package Precondition;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import gherkin.formatter.model.DataTableRow;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Login {

    public WebDriver driver = null;
    private String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    @Before
    public void preRequisties() {
        System.setProperty("webdriver.chrome.driver", "G:/automation software database/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @When("^Login into Application and Create Account with username \"([^\"]*)\"$")
    public void doLoginAndCreateAccount(String username) {
        By emailaddress = By.xpath(".//*[@id='email_create']");
        driver.findElement(emailaddress).sendKeys(username);
    }

    @Given("^login into application using below data$")
    public void login_into_application_using_below_data(DataTable users) throws Throwable {

    }


    @After
    public void afterPrequisties() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Given("^login into application using below details$")
    public void loginIntoApplicationUsingBelowDetails(DataTable users) throws Throwable {


    }

    @Given("^your details\\.$")
    public void your_details() throws Throwable {

    }
}
