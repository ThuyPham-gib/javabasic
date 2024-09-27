package thuytester.com;
// Các lệnh này dùng để nhập các th viện cần thiết cho Selenium và java.
import org.openqa.selenium.By; //By: các lớp từ thư viện Selenium
import org.openqa.selenium.WebDriver; //WebDriver: các lớp từ thư viện Selenium
import org.openqa.selenium.chrome.ChromeDriver; // ChromeDriver: các lớp từ thư viện Selenium

import java.time.Duration; //Duration: quản lý thời gian

public class TestSelenium {
    public static void main(String[] args) {

        // khởi tạo browser với chorme
        WebDriver driver; // khai báo 1 đối tượng driver với kiểu WebDriver => dùng điều khiển trình duyệt
        driver = new ChromeDriver(); // khởi tạo một phiên bản trình duyệt mới
        driver.manage().window().maximize(); // tối đa hóa cửa sổ trình duyệt
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// ofSecond: thiết lập thời gian chờ , 10 = 10s. Nếu phần tử không tìm thấy ngay lập tức, Selenium sẽ đợi tối đa 10s trước khi ném ra ngoại lệ.


        // Mở trang thuytester.com
        driver.get("https://anhtester.com/login"); // mở trang web

        // click Login button
        driver.findElement(By.xpath("//a[@id='btn-login']")).click(); // tìm phần tử trên trang có id "btn-login" vfs thưc hiện hành động click nó. Xpath: đùng dể xác định phần tử  a

        //tắt browser
        driver.quit();
    }
}
