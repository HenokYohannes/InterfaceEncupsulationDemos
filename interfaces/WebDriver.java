package com.company.class24.interfaces;

public interface WebDriver {
    /*Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(),
    findElement(). Create 2 classes that implements WebDriver
    interface: ChromeDriver and FirefoxDriver.
     */

    void openBrowser();
    void closeBrowser();
    void maximizeBrowser();
    void findElement();

}

class ChromDriver implements WebDriver{


    @Override
    public void openBrowser() {
        System.out.println("Opening the Google chrom");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google chrom");
    }

    @Override
    public void maximizeBrowser() {
        System.out.println("Maximizing the Google chrom");
    }

    @Override
    public void findElement() {
        System.out.println("finding the elemnt on Google chrome");
    }
}

class FireFoxDriver implements  WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Opening the FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the FireFox");
    }

    @Override
    public void maximizeBrowser() {
        System.out.println("Maximizing the FireFox");
    }

    @Override
    public void findElement() {
        System.out.println("finding the elemnt on FireFox");


    }

}