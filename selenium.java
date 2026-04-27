package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPro {

    public static void main(String[] args) throws InterruptedException {

        // Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open login page
        driver.get("http://localhost:5001/login.html");

        // Enter username
        driver.findElement(By.id("username")).sendKeys("Madhura");
        Thread.sleep(1000);

        // Enter email
        driver.findElement(By.id("email")).sendKeys("madhura@gmail.com");
        Thread.sleep(1000);

        // Enter password
        driver.findElement(By.id("password")).sendKeys("123456");
        Thread.sleep(1000);

        // Enter confirm password
        driver.findElement(By.id("confirmPassword")).sendKeys("123456");
        Thread.sleep(10000);

        // Click login button
        driver.findElement(By.className("login-btn")).click();
        
        // Wait for redirect
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check if redirected to index.html
        String currentURL = driver.getCurrentUrl();
        
        if(currentURL.contains("index.html")) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
        Thread.sleep(10000);
        // Close browser
        driver.quit();
    }
}
