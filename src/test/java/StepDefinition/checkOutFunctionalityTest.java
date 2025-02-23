package StepDefinition;

import Factory.DriverFactoryTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class checkOutFunctionalityTest {
    WebDriver driver;
    Double ActualPrice=0.0;
    double tax;
    double totalPrice;
    public checkOutFunctionalityTest() {
        driver = DriverFactoryTest.getDriver();
    }
    @Then("User add sauce labs fleece jacket into cart")
    public void user_add_sauce_labs_fleece_jacket_into_cart() {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
    }
    @Then("User add sauce labs backpack into cart into cart")
    public void user_add_sauce_labs_backpack_into_cart_into_cart() {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
    }
    @Then("User add sauce labs bolt t shirt into cart")
    public void user_add_sauce_labs_bolt_t_shirt_into_cart() {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
    }
    @Then("User add test all the things t shirt red into cart")
    public void User_add_test_all_the_things_t_shirt_red_into_cart() {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
    }
    @Then("User add sauce labs bike light into cart")
    public void user_add_sauce_labs_bike_light_into_cart() {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
    }
    @Then("User add sauce labs onesie into cart")
    public void user_add_sauce_labs_onesie_into_cart() {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
    }
    @Then("User is able to see remove sauce labs backpack")
    public void user_is_able_to_see_remove_sauce_labs_backpack() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).isDisplayed());
    }
    @Then("User is able to see remove sauce labs bolt t shirt")
    public void user_is_able_to_see_remove_sauce_labs_bolt_t_shirt() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]")).isDisplayed());
    }
    @Then("User is able to see remove test all the things t shirt red into cart")
    public void User_is_able_to_see_remove_test_all_the_things_t_shirt_red_into_cart() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"remove-test.allthethings()-t-shirt-(red)\"]")).isDisplayed());
    }
    @Then("User is able to see remove sauce labs fleece jacket")
    public void user_is_able_to_see_remove_sauce_labs_fleece_jacket() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-fleece-jacket\"]")).isDisplayed());
    }
    @Then("User is able to see remove sauce labs bike light")
    public void user_is_able_to_see_remove_sauce_labs_bike_light() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]")).isDisplayed());
    }
    @Then("User is able to see remove-sauce-labs-onesie")
    public void user_is_able_to_see_remove_sauce_labs_onesie() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-onesie\"]")).isDisplayed());
    }
    @When("User click on cart logo")
    public void user_click_on_cart_logo() {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    }
    @Then("User is able to see check out button")
    public void user_is_able_to_see_check_out_button() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"checkout\"]")).isDisplayed());
    }
    @When("User click on check out button")
    public void user_click_on_check_out_button() {
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
    }
    @Then("User is able to see continue button")
    public void user_is_able_to_see_continue_button() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"continue\"]")).isDisplayed());
    }
    @Then("User is able to see first name field")
    public void user_is_able_to_see_first_name_field() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"first-name\"]")).isDisplayed());
    }
    @Then("User is able to see last name field")
    public void user_is_able_to_see_last_name_field() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"last-name\"]")).isDisplayed());
    }
    @Then("User is able to see postal code field")
    public void user_is_able_to_see_postal_code_field() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).isDisplayed());
    }
    @Then("User enter {string} into first name field")
    public void user_enter_into_first_name_field(String firstName) {
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys(firstName);
    }
    @Then("User enter {string} into last name field")
    public void user_enter_into_last_name_field(String lastname) {
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys(lastname);
    }
    @Then("User enter {string} into postal code field")
    public void user_enter_into_postal_code_field(String postalCode) {
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys(postalCode);
    }
    @When("User click on continue button")
    public void user_click_on_continue_button() {
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
    }
    @Then("User is able to see finish button")
    public void user_is_able_to_see_finish_button() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"finish\"]")).isDisplayed());
    }
    @Then("User is able to see cancle button")
    public void user_is_able_to_see_cancle_button() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"cancel\"]")).isDisplayed());
    }
    @Then("User is able to see error message")
    public void user_is_able_to_see_error_message() {
        Assert.assertEquals("Error: Last Name is required",driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3")).getText());
    }
    @Then("User validate actual price")
    public void user_validate_actual_price() {
        Assert.assertEquals(ActualPrice,Double.parseDouble(driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]")).getText().substring(13)));
    }
    @Then("User validate total price")
    public void user_validate_total_price() {
        tax = Double.parseDouble(driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]")).getText().substring(6));
        totalPrice = tax+ActualPrice;
        Assert.assertEquals(totalPrice,Double.parseDouble(driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]")).getText().substring(8)));
    }
    @When("User click finish button")
    public void user_click_finish_button() {
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
    }
    @Then("User is able to see order successful message")
    public void user_is_able_to_see_order_successful_message() {
        Assert.assertEquals("Thank you for your order!",driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText());
    }
    @Then("User add sauce labs fleece jacket into cart for price")
    public void user_add_sauce_labs_fleece_jacket_into_cart_for_price() {
        ActualPrice = ActualPrice + Double.parseDouble(driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText().substring(1));
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
    }
    @Then("User add sauce labs backpack into cart into cart for price")
    public void user_add_sauce_labs_backpack_into_cart_into_cart_for_price() {
        ActualPrice = ActualPrice + Double.parseDouble(driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[2]/div")).getText().substring(1));
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
    }
    @Then("User add sauce labs bolt t shirt into cart for price")
    public void user_add_sauce_labs_bolt_t_shirt_into_cart_for_price() {
        ActualPrice = ActualPrice + Double.parseDouble(driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[2]/div")).getText().substring(1));
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
    }
    @Then("User add test all the things t shirt red into cart for price")
    public void User_add_test_all_the_things_t_shirt_red_into_cart_for_price() {
        ActualPrice = ActualPrice + Double.parseDouble(driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[2]/div")).getText().substring(1));
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
    }
    @Then("User add sauce labs bike light into cart for price")
    public void user_add_sauce_labs_bike_light_into_cart_for_price() {
        ActualPrice = ActualPrice + Double.parseDouble(driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[2]/div")).getText().substring(1));
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
    }
    @Then("User add sauce labs onesie into cart for price")
    public void user_add_sauce_labs_onesie_into_cart_for_price() {
        ActualPrice = ActualPrice + Double.parseDouble(driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[2]/div")).getText().substring(1));
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
    }
    @Then("User is able to see error message for valid first name")
    public void user_is_able_to_see_error_message_for_valid_first_name() {
        Assert.assertEquals("Error: Last Name is required",driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3")).getText());
    }
    @Then("User is able to see error message for valid lastname")
    public void user_is_able_to_see_error_message_for_valid_lastname() {
        Assert.assertEquals("Error: First Name is required",driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3")).getText());
    }
    @Then("User is able to see error message for valid zip code")
    public void user_is_able_to_see_error_message_for_valid_zip_code() {
        Assert.assertEquals("Error: First Name is required",driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3")).getText());
    }
    @Then("User is able to see error message for empty zip code")
    public void user_is_able_to_see_error_message_for_empty_zip_code() {
        Assert.assertEquals("Error: Postal Code is required",driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3")).getText());
    }
    @Then("User is able to see error message for empty last name")
    public void user_is_able_to_see_error_message_for_empty_last_name() {
        Assert.assertEquals("Error: Last Name is required",driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3")).getText());
    }
    @Then("User is able to see error message for all blank field")
    public void user_is_able_to_see_error_message_for_empty_last_name_for_all_blank_field() {
        Assert.assertEquals("Error: First Name is required",driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3")).getText());
    }
    @Then("User is able to see error message for empty first name")
    public void user_is_able_to_see_error_message_for_empty_last_name_for_all_blank_field_for_empty_first_name() {
        Assert.assertEquals("Error: First Name is required",driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3")).getText());
    }
}
