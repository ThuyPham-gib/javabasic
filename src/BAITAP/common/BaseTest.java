//package BAITAP.common;
//
//package common;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class BaseTest {
//    protected WebDriver driver;
//
//    public void createDriver() {
//        // Hiển thị thông tin cấu hình
//        System.out.println("Browser: " + constants.BROWSER);
//        System.out.println("Report: " + constants.REPORT);
//        System.out.println("Headless: " + constants.HEADLESS);
//
//        // Tạo đối tượng WebDriver
//        if (constants.BROWSER.equalsIgnoreCase("chrome")) {
//            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//            if (constants.HEADLESS) {
//                // Cấu hình chế độ headless
//                // ChromeOptions options = new ChromeOptions();
//                // options.addArguments("--headless");
//                // driver = new ChromeDriver(options);
//                driver = new ChromeDriver(); // Bạn có thể thêm cấu hình headless nếu cần
//            } else {
//                driver = new ChromeDriver();
//            }
//        }
//        // Thêm cấu hình cho các trình duyệt khác nếu cần
//    }
//
//    public void closeDriver() {
//        if (driver != null) {
//            driver.quit();
//            // Hiển thị thông tin đóng trình duyệt
//            System.out.println("Closed browser: " + Constants.BROWSER);
//        }
//    }
//}
//
