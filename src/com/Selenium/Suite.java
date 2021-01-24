package com.Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Suite {

    //test case 1: when Repayment type= Interest only 1 year, withA = Owner occupied and 4.34% p.a. Standard Variable Rate Home Loan:
    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kagrawal\\Downloads\\googledriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.commbank.com.au/digital/home-buying/calculator/home-loan-repayments?ei=hp-prodnav_HomeBuyingCalc";
        driver.get(url);

        WebElement l = driver.findElement(By.id("amount"));

        WebElement over = driver.findElement(By.id("term"));

        Select drp = new Select(driver.findElement(By.id("interestOnly")));
        drp.selectByVisibleText("Interest only 1 year");

        Select drpWithA = new Select(driver.findElement(By.id("productId")));
        drpWithA.selectByVisibleText("4.34% p.a. Standard Variable Rate Home Loan");

        // get value attribute with getAttribute()
        System.out.println("Entered text to borrow is $: " + l.getAttribute("value"));
        System.out.println("Entered text to borrow for : " + over.getAttribute("value"));
        System.out.println("Entered text to  : " + drp.getAllSelectedOptions());
        System.out.println("Entered text to borrow with a : " + drpWithA.getAllSelectedOptions());

        driver.findElement(By.id("submit")).click();
    }

    //test case 2: when Repayment type= Principal and interest, withA = Investment and 3.12% p.a. Extra Investment Home Loan 30% deposit:
    @Test
    public void test2(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kagrawal\\Downloads\\googledriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.commbank.com.au/digital/home-buying/calculator/home-loan-repayments?ei=hp-prodnav_HomeBuyingCalc";
        driver.get(url);

       driver.findElement(By.id("amount"));

       driver.findElement(By.id("term"));

        Select drp = new Select(driver.findElement(By.id("interestOnly")));
        drp.selectByVisibleText("Principal and interest");

        Select drpWithA = new Select(driver.findElement(By.id("productId")));
        drpWithA.selectByVisibleText("3.12% p.a. Extra Investment Home Loan 30% deposit");
        driver.findElement(By.id("submit")).click();
    }

    //test case 3: when Repayment type= Interest only 5 years, withA = Owner occupied and 3.79% p.a. 5 Year Fixed Rate Home Loan:
    @Test
    public void test3(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kagrawal\\Downloads\\googledriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.commbank.com.au/digital/home-buying/calculator/home-loan-repayments?ei=hp-prodnav_HomeBuyingCalc";
        driver.get(url);

        driver.findElement(By.id("amount"));

        driver.findElement(By.id("term"));

        Select drp = new Select(driver.findElement(By.id("interestOnly")));
        drp.selectByVisibleText("Interest only 5 years");

        Select drpWithA = new Select(driver.findElement(By.id("productId")));
        drpWithA.selectByVisibleText("3.79% p.a. 5 Year Fixed Rate Home Loan");
        driver.findElement(By.id("submit")).click();
    }

    //test case 4: when Repayment type= Interest only 3 years, withA = Investment and 2.89% p.a. 3 Year Fixed Rate Investment Home Loan:
    @Test
    public void test4(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kagrawal\\Downloads\\googledriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.commbank.com.au/digital/home-buying/calculator/home-loan-repayments?ei=hp-prodnav_HomeBuyingCalc";
        driver.get(url);

        driver.findElement(By.id("amount"));

        driver.findElement(By.id("term"));

        Select drp = new Select(driver.findElement(By.id("interestOnly")));
        drp.selectByVisibleText("Interest only 3 years");

        Select drpWithA = new Select(driver.findElement(By.id("productId")));
        drpWithA.selectByVisibleText("2.89% p.a. 3 Year Fixed Rate Investment Home Loan");
        driver.findElement(By.id("submit")).click();
    }

}
