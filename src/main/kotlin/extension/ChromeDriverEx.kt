package extension

import org.apache.commons.io.FileUtils
import org.openqa.selenium.OutputType
import org.openqa.selenium.chrome.ChromeDriver
import java.io.File

/**
 * author:lsxiao
 * date:2018-12-20 22:35
 * email:faith.epiphone@gmail.com
 */

/**
 * 截屏并保存
 */
fun ChromeDriver.screenshotAndSave() {
    val file = this.getScreenshotAs(OutputType.FILE) as File
    FileUtils.copyFile(file, File("./image/extension.screenshotAndSave.png"))
}


fun ChromeDriver.with(url: String, callback: (ChromeDriver) -> Unit) {
    this.get(url)
    callback(this)
    this.close()
}