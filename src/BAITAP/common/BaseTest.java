package BAITAP.common;

import static BAITAP.common.constants.BROWSER;
import static BAITAP.common.constants.REPORT;

public class BaseTest {

    protected WebDriver driver;
    // Tạo hàm create Driver
    public void createDriver() {
        // hiển thị thông tin cấu hình
        System.out.println("Browser:" + BROWSER);
        System.out.println("Report:" + REPORT);
        System.out.println("Headless:" + constants.HEADLESS);

    }


    // Tạo hàm close
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
            // hiển thị thông tin đóng trình duyệt 
            System.out.println("Closed browser:" + BROWSER);
        }

    }

}
