package StepDefinition;

import Factory.DriverFactoryTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class loginForValidAndInvalidTest{

    WebDriver driver;
    public loginForValidAndInvalidTest() {
        driver = DriverFactoryTest.getDriver();
    }

    @When("user enter valid username {string}")
    public void user_enter_valid_username(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);

    }

    @When("user enter valid password {string}")
    public void user_enter_valid_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);

    }

    @Then("user is not able to login successfully {string}")
    public void user_is_not_able_to_login_successfully(String message) {
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText(),message);
    }

    @When("enter invalid orr valid username {string}")
    public void enter_invalid_orr_valid_username(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);

    }

    @When("enter invalid orr valid password {string}")
    public void enter_invalid_orr_valid_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);

    }


//    @When("enter invalid orr valid password {string} password\"\"")
//    public void enter_invalid_orr_valid_password_password(String password) {
//        driver.findElement(By.id("password")).sendKeys(password);
//
//    }

    @Then("user is able to login successfully {string}")
    public void user_is_able_to_login_successfully(String message) {
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText(),message);
    }
}