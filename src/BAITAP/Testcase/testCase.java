package BAITAP.Testcase;

package testcases;

import common.BaseTest;

public class TestCases extends BaseTest {

    public void loginTest() {
        // Tạo Driver
        createDriver();

        // Bước 1: Mở trang đăng nhập
        System.out.println("Step 1: Open login page at https://cms.anhtester.com/login");
        driver.get("https://cms.anhtester.com/login");

        // Bước 2: Nhập email
        System.out.println("Step 2: Enter email 'admin@example.com'");

        // Bước 3: Nhập mật khẩu
        System.out.println("Step 3: Enter password '123456'");

        // Bước 4: Nhấn nút đăng nhập
        System.out.println("Step 4: Click login button");

        // Đóng Driver
        closeDriver();
    }

    public void addCategoryTest() {
        // Tạo Driver
        createDriver();

        // Bước 1: Đăng nhập vào hệ thống (hoặc mở trang tương ứng)
        System.out.println("Step 1: Open login page and login");
        driver.get("https://cms.anhtester.com/login");
        // Thực hiện các bước đăng nhập tại đây

        // Bước 2: Mở trang thêm danh mục
        System.out.println("Step 2: Open Add Category page");

        // Bước 3: Nhập thông tin danh mục
        System.out.println("Step 3: Enter category information");

        // Bước 4: Nhấn nút thêm danh mục
        System.out.println("Step 4: Click Add Category button");

        // Đóng Driver
        closeDriver();
    }
}

