package com.GitHub.Pages;

import com.GitHub.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//h3[contains(text(), 'repository results')]")
    public WebElement repositoryResult;
    @FindBy(xpath = "//input[@type='text']")
    public WebElement searchBox;

    @FindBy(xpath = "//a[@class='v-align-middle']")
    public List<WebElement> matchingResults;


    @FindBy(xpath = "//a[@href='/facebook/create-react-app']")
    public WebElement facebook;


    @FindBy(xpath = "//a[@href='https://github.com/about']")
    public WebElement aboutButton;


}
