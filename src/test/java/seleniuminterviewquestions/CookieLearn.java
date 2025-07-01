package seleniuminterviewquestions;

import com.learning.utils.BaseUtilTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class CookieLearn {
    private final BaseUtilTest but = new BaseUtilTest();
    private final Logger log = LogManager.getLogger(CookieLearn.class);
    private final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        CookieLearn cl = new CookieLearn();
        cl.driver.get("https://demo.nopcommerce.com/");
        cl.driver.manage().window().maximize();
        cl.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        cl.checkCookieCount();
        // cl.checkCookieDetails();
        //cl.addCookie();
        //cl.driver.quit();
    }

    void checkCookieCount() {
        Set<Cookie> cookies = driver.manage().getCookies();
        log.info("Size of cookie:{}", cookies.size());
    }

    void checkCookieDetails() {
        Set<Cookie> cookies = driver.manage().getCookies();
        log.info("Number of cookie:{}", cookies.size());
        for (Cookie cookie : cookies) {
            log.info("{} {}", cookie.getName(), cookie.getValue());
            log.info("{} {}", cookie.getName(), cookie.getDomain());
            log.info("{} {}", cookie.getName(), cookie.getExpiry());
            log.info("{} {}", cookie.getName(), cookie.getPath());
            log.info("{} {}", cookie.getName(), cookie.getSameSite());
        }
    }

    void addCookie() {
        Cookie cookieObj = new Cookie("Hakkuna Matata", "2468");
        driver.manage().addCookie(cookieObj);
        log.info("Adding new cookie");

        Set<Cookie> cookies = driver.manage().getCookies();
        log.info("Number of cookie after adding:{}", cookies.size());
    }
}
