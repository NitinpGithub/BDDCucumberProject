package StepDefinition;

import Factory.DriverFactoryTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class cartPageTest {


    WebDriver driver;

    public cartPageTest() {
        driver = DriverFactoryTest.getDriver();
    }
    @Then("Check quantity of six product add into cart")
    public void check_quantity_of_six_product_add_into_cart() {
        Assert.assertEquals("6",driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText());
    }

    @When("Check user is able to remove sauce labs bolt t shirt")
    public void check_user_is_able_to_remove_sauce_labs_bolt_t_shirt() {
        driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]")).click();
    }

    @When("user is able to remove test all the things t shirt red into cart")
    public void user_is_able_to_remove_test_all_the_things_t_shirt_red_into_cart() {
        driver.findElement(By.xpath("//*[@id=\"remove-test.allthethings()-t-shirt-(red)\"]")).click();
    }

    @When("user is able to remove sauce labs fleece jacket")
    public void user_is_able_to_remove_sauce_labs_fleece_jacket() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-fleece-jacket\"]")).isDisplayed());
    }

    @When("user is able to remove sauce labs bike light")
    public void user_is_able_to_remove_sauce_labs_bike_light() {
        driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]")).click();
    }

    @When("user is able to remove-sauce-labs-onesie")
    public void user_is_able_to_remove_sauce_labs_onesie() {
        driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-onesie\"]")).click();
    }

    @Then("Check quantity after remove products from cart")
    public void check_quantity_after_remove_products_from_cart() {
        Assert.assertEquals("9",driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText());
    }

    @Then("Check quantity of one product add into cart")
    public void check_quantity_of_one_product_add_into_cart() {
        Assert.assertEquals("1",driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText());
    }

    @Then("Check user is able to see description of added product from cart")
    public void check_user_is_able_to_see_description_of_added_product_from_cart() {
        String ActaulDesc = "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.";
        Assert.assertEquals(ActaulDesc,driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[1]")).getText());
    }

    @Then("Check quantity of one added product")
    public void check_quantity_of_one_added_product() {
        Assert.assertEquals("1",driver.findElement(By.xpath(" //*[@id=\"shopping_cart_container\"]/a")).getText());

    }

    @Then("Check quantity of two added product")
    public void check_quantity_of_two_added_product() {
        //Assert.assertEquals("2",driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText());
        Assert.assertEquals("2",driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText());
    }

    @Then("Check quantity of three added product")
    public void check_quantity_of_three_added_product() {
        Assert.assertEquals("3",driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText());
    }

    @Then("Check quantity of four added product")
    public void check_quantity_of_four_added_product() {
        Assert.assertEquals("4",driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText());
    }

    @Then("Check quantity of five added product")
    public void check_quantity_of_five_added_product() {
        Assert.assertEquals("5",driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText());
    }

    @Then("Check quantity of six added product")
    public void check_quantity_of_six_added_product() {
        Assert.assertEquals("6",driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText());
    }
}
