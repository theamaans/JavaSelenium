public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        protected WebDriver driver;

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
    }
}
