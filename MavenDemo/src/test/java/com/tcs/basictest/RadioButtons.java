/*
 * //package com.tcs.basictest; //import java.util.List; //import
 * org.openqa.selenium.By; //import org.openqa.selenium.WebDriver; //import
 * org.openqa.selenium.WebElement; //import
 * org.openqa.selenium.chrome.ChromeDriver; // //public class RadioButtons { //
 * // public static void main(String[] args) { // // WebDriver driver = new
 * ChromeDriver(); // driver.manage().window().maximize(); //
 * driver.get("https://testautomationpractice.blogspot.com/"); // WebElement
 * maleRadioElement = driver.findElement(By.xpath("//label[text()=male]")); //
 * // maleRadioElement.click(); // maleRadioElement.isSelected(); // //
 * //System.out.println(maleRadioElement.isSelected()); //
 * System.out.println(maleRadioElement.isDisplayed()); //
 * System.out.println(maleRadioElement.isEnabled()); // // //checboxes // //
 * List<WebElement> checkboxes =
 * driver.findElements(By.xpath("//input[@type='checkbox']")); // // for
 * (WebElement cb : checkboxes) { // if (!cb.isSelected()) { // cb.click(); // }
 * // // } // // } // //} //
 */

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        List<WebElement> checkboxes =
                driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement cb : checkboxes) {
            if (!cb.isSelected()) {
                cb.click();
            }
        }
    }
}