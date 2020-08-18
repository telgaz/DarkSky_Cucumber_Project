package stepDefiniton;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import runnerTest.webPages.HomePage;

public class HomePageSD {

   HomePage homePage=new HomePage();
   
   @Given("^I am on darsky homepage$")
   public void verifyPageTitle()  {
    String title=homePage.getLoginPageTitle();

       Assert.assertEquals(title, "Dark Sky - Broadway, New York, NY");
   }

   @When("^I click on today button on home page$")
   public void goToday() {
       homePage.goClickTodayBtn();

   }

   @And("^I verify lowest temperature of the day on home page$")
  public void verifyMinTemp()  {
       homePage.compareMinDegrees();
   }

  @Then("^I verify highest temperature on darksky home page$")
    public void verifyMaxTemp()  {
       homePage.compareMaxDegrees();
  }
}
