package manager

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

/**
 * author:lsxiao
 * date:2018-12-20 03:07
 * email:faith.epiphone@gmail.com
 */
object ChromeDriverManager {
    // 单例
    val instance: ChromeDriver by lazy {
        val option = ChromeOptions().apply {
            addArguments("--headless")
        }

        return@lazy ChromeDriver(option)
    }
}