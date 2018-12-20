package utils

import DriverManager
import org.apache.commons.io.FileUtils
import org.openqa.selenium.OutputType
import org.openqa.selenium.chrome.ChromeDriver
import java.io.File

/**
 * author:lsxiao
 * date:2018-12-20 03:06
 * email:faith.epiphone@gmail.com
 */

fun ChromeDriver.screenshot() {
    val file = this.getScreenshotAs(OutputType.FILE) as File
    FileUtils.copyFile(file, File("./image/screenshot.png"))
}

fun open(url: String) {
    DriverManager.driver.get(url)
}

fun String.filterNumber(): String {
    var result = ""
    val numbers = "0123456789"
    for (char in this) {
        if (numbers.contains(char)) {
            result += char
        }
    }
    return result
}

fun String.toNumber(): Int = if (this.filterNumber().isEmpty()) {
    0
} else {
    this.filterNumber().toInt()
}