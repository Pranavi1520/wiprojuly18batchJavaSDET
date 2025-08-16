package com.wiprojuly.javasdet.Labsessionaug13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multipleradiobuttons {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions chromeoptions = new ChromeOptions();

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(chromeoptions);

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().window().maximize();

        List<WebElement> radiobuttons = driver.findElements(By.xpath("//input[@name='radioButton']"));

        int size = radiobuttons.size();

        System.out.println(size);

        // for loop to iterate through list of checkboxes
        for (int i = 0; i < size; i++) {
            Thread.sleep(1000);
            radiobuttons.get(i).click();
        }

        Thread.sleep(3000);
        
    }
}
