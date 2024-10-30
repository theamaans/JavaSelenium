package com.performance.tests;

import com.performance.base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PerformanceTest extends BaseTest {

    @BeforeClass
    public void setUp() {
        setup();
    }

    @Test
    public void testFetchTitle() {
        long startTime = System.currentTimeMillis();

        driver.get("https://example.com"); // Replace with your target URL
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Performance Test Duration: " + duration + " ms");
    }

    @AfterClass
    public void tearDown() {
        teardown();
    }
}
