package StepDefinition;

import Factory.DriverFactoryTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class homePageTest{

    WebDriver driver;
    @Given("User navigates to login page")
    public void user_navigates_to_login_page() {

        driver = DriverFactoryTest.getDriver();
    }
    @Then("User is able to see username field")
    public void user_is_able_to_see_username_field() {
        WebElement username= driver.findElement(By.id("user-name"));
        Assert.assertTrue(username.isDisplayed());
    }

    @Then("User is able to see password field")
    public void user_is_able_to_see_password_field() {
        WebElement password= driver.findElement(By.id("password"));
        Assert.assertTrue(password.isDisplayed());
    }

    @Then("User is able to see login button")
    public void user_is_able_to_see_login_button() {
        WebElement login = driver.findElement(By.id("login-button"));
        Assert.assertTrue(login.isDisplayed());
    }

    @Then("User is able to see page title")
    public void user_is_able_to_see_page_title() {

        String logo= driver.findElement(By.className("login_logo")).getText();
        Assert.assertEquals(logo,"Swag Labs");
    }


    @When("User enter valid username {string} into email field")
    public void user_enter_valid_username_into_email_field(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @When("User enter valid password {string} into password field")
    public void user_enter_valid_password_into_password_field(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("User click login button")
    public void user_click_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("User is able to see product page")
    public void user_is_able_to_see_product_page() {
        String product = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        WebElement cart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        Assert.assertEquals(product,"Products");
        Assert.assertTrue(cart.isDisplayed());
    }
}