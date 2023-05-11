package com.demo.nopcommerce.Pages;

import com.demo.nopcommerce.Utilities.Utils;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    Utils utils;

    //1. Create your page object/object repository in the form of By Locators
    By registerlink = By.className("ico-register");
    By gender = By.id("gender");
    By FirstName = By.id("FirstName");
    By LastName = By.id("LastName");
    By DateOfBirthDay = By.name("DateOfBirthDay");
    By DateOfBirthMonth = By.name("DateOfBirthMonth");
    By DateOfBirthYear = By.name("DateOfBirthYear");
    By companyName = By.id("Company");
    By emailId = By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");

    By register_Button = By.xpath("//*[@id=\"register-button\"]");


    public void clickOnRegisterLink(){

        driver.findElement(registerlink).click();
    }
    public RegisterPage (WebDriver driver)
    {
        this.driver= driver;


    }

    public void doRegister(String fnme , String lname , String day , String month , String year  , String Email,String comname, String pwd , String co_password)
    {
        driver.findElement(gender).click();
        driver.findElement(FirstName).sendKeys(fnme);
        driver.findElement(LastName).sendKeys(lname);
        driver.findElement(DateOfBirthDay).sendKeys(day);
        driver.findElement(DateOfBirthMonth).sendKeys(month);
        driver.findElement(DateOfBirthYear).sendKeys(year);
        driver.findElement(emailId).sendKeys(Email);
        driver.findElement(companyName).sendKeys(comname);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(confirmPassword).sendKeys(co_password);
        driver.findElement(register_Button).click();
    }


}

