package StepDefinition;

import Factory.DriverFactoryTest;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class productPageTest {
    WebDriver driver;

    public productPageTest()
    {
        driver = DriverFactoryTest.getDriver();
    }

    @Then("User is able to see product details on product page")
    public void user_is_able_to_see_product_details_on_product_page() {
        String actualProductName = "Sauce Labs Fleece Jacket";
        String actualproductDetail = "carry.allTheThings() with the sleek, streamlined Sly " +
                "Pack that melds uncompromising style with unequaled laptop and tablet protection.";
        String actualprice = "$29.99";

        WebElement addToCart= driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));

        Assert.assertEquals(actualProductName,driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText());
        Assert.assertEquals(actualproductDetail,driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[1]/div")).getText());
        Assert.assertEquals(actualprice,driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText());
        Assert.assertTrue(addToCart.isDisplayed());
    }

    @Then("User is able to verify dropdown details on product page")
    public void user_is_able_to_verify_dropdown_details_on_product_page() {
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
        Select select = new Select(dropdown);
        List<WebElement> allOptions = select.getOptions();
        Assert.assertEquals(4,allOptions.size());

        select.selectByIndex(1);
        String actualFirstByIndex1 = "Test.allTheThings() T-Shirt (Red)";
        String expectedFirstByIndex1 = driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
        Assert.assertEquals(actualFirstByIndex1,expectedFirstByIndex1);
    }

    @Then("User is able to see cart logo")
    public void user_is_able_to_see_cart_logo() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).isDisplayed());
    }

    @Then("User is able to see burger menu")
    public void user_is_able_to_see_burger_menu() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).isDisplayed());
    }

    @Then("User is able to see twitter logo in footer")
    public void user_is_able_to_see_twitter_logo_in_footer() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[1]/a")).isDisplayed());
    }

    @Then("User is able to see facebook logo in footer")
    public void user_is_able_to_see_facebook_logo_in_footer() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[2]/a")).isDisplayed());
    }

    @Then("User is able to see linkedin logo in footer")
    public void user_is_able_to_see_linkedin_logo_in_footer() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[3]/a")).isDisplayed());
    }

    @Then("User is able to see dropdown logo in header")
    public void user_is_able_to_see_dropdown_logo_in_header() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).isDisplayed());
    }

}
