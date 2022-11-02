package com.GitHub.StepDefinitions;

import com.GitHub.Pages.HomePage;
import com.GitHub.Utilities.Driver;
import com.GitHub.Utilities.SeleniumUtils;
import com.GitHub.Utilities.configReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GitHubStep {

    @Given("im on the home page")
    public void im_on_the_home_page() {
        Driver.getDriver().get(configReader.getProperty("url"));
    }
    @When("i search github for the term {string} from the landing page search")
    public void i_search_github_for_the_term_from_the_landing_page_search(String string) {
        HomePage hp= new HomePage();
        hp.searchBox.sendKeys("create-react-app", Keys.ENTER);
    }
    @Then("i should be able to see a count of matching results")
    public void i_should_be_able_to_see_a_count_of_matching_results() {
        HomePage hp = new HomePage();

            Assert.assertTrue(hp.repositoryResult.getText().contains("repository results"));
        }

    @Then("first results should match with {string}")
    public void first_results_should_match_with(String repositoryName) {
        HomePage hp = new HomePage();

        Assert.assertTrue(hp.matchingResults.get(0).getText().contains(repositoryName));


    }


    @When("i scroll down and click on About button")
    public void i_scroll_down_and_click_on_about_button() {
        HomePage hp = new HomePage();
        SeleniumUtils.scroll(500, 800);

        SeleniumUtils.jsClick(hp.aboutButton);
    }
    @Then("i have to be able to see about github page")
    public void i_have_to_be_able_to_see_about_github_page() {

        SeleniumUtils.waitFor(1);

        String expected ="About · GitHub";


        Assert.assertEquals(expected, Driver.getDriver().getTitle());
    }



}
