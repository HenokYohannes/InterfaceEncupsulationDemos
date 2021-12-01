package com.company.class24.interfaces;

public class WebDriverTester {
    WebDriver webDriver = new ChromDriver();

    public static void main(String[] args) {


      WebDriver[]webDrivers={new FireFoxDriver(),new ChromDriver()};
for(WebDriver webDriver:webDrivers){

    webDriver.openBrowser();
    webDriver.maximizeBrowser();
    webDriver.findElement();
    webDriver.closeBrowser();

}
    }

}