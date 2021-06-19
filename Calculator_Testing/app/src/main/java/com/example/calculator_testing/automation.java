package com.example.calculator_testing;

import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class automation {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "YOUR_DEVICE_NAME");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        dc.setCapability("appActivity", ".Calculator");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);

        MobileElement el1 = (MobileElement) ad.findElementByAccessibilityId("2");
        el1.click();
        MobileElement el2 = (MobileElement) ad.findElementByAccessibilityId("7");
        el2.click();
        MobileElement el3 = (MobileElement) ad.findElementByAccessibilityId("Plus");
        el3.click();
        MobileElement el4 = (MobileElement) ad.findElementByAccessibilityId("3");
        el4.click();
        MobileElement el5 = (MobileElement) ad.findElementByAccessibilityId("9");
        el5.click();
        MobileElement el6 = (MobileElement) ad.findElementByAccessibilityId("Equal");
        el6.click();

        Assert.assertEquals(ad.findElementById("com.sec.android.app.popupcalculator:id/calc_edt_formula").getText(),"66");
    }

}
