import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrageHrm {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","D://Selanium//chromedriver_win32_3//chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/?stype=lo&jlou=AfdwAvtGGC7AiIpse5TTG4huWtoqArm1GXXD_hqTDNAuuA_R1BVFd5XcQ4Hyl6aF93WRSpguO4HGfvOua1b_b8gH1-5ZmGapsdT26ASsyJu7RQ&smuh=32360&lh=Ac8ebceAgEE-GOcz/");
    }

}
