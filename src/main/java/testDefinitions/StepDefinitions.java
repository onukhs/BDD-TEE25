package testDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static testDefinitions.Hooks.getDriver;

public class StepDefinitions {

    private final WebDriver driver = getDriver();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");

        System.out.println("STEP 1 - I am on the login page");
    }

    @When("I enter correct username and password")
    public void i_enter_correct_username_and_password() throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        System.out.println("STEP 2 - I enter username and password");
    }

    @When("I enter username and password for blocked user")
    public void i_enter_username_and_password_blocked() throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        System.out.println("STEP 2 - I enter username and password");
    }
    @When("I click on login button")
    public void i_click_on_login_button() throws InterruptedException {
        driver.findElement(By.id("login-button")).click();

        System.out.println("STEP 3 - I click on login button");

    }

    @Then("I should be logged in")
    public void i_should_be_logged_in() throws InterruptedException {
        driver.findElement(By.id("shopping_cart_container"));
        System.out.println("STEP 4 - I am logged in, whooaaaa");

        Thread.sleep(5000);
    }

    @Then("I should see an error")
    public void i_should_see_an_error() throws InterruptedException {
        driver.findElement(By.xpath("//div[contains(@class, 'error-message-container')]"));
        System.out.println("STEP 4 - I am NOT logged in, error is displayed");

        Thread.sleep(5000);
    }
}
