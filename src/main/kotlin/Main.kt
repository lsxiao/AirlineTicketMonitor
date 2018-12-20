import org.openqa.selenium.By
import utils.toNumber

/**
 * author:lsxiao
 * date:2018-12-20 02:33
 * email:faith.epiphone@gmail.com
 */
fun main(args: Array<String>) {

    val url = AirlineUrl("2019-01-31", "2019-02-10").toString()
    println(url)
    utils.open(url)

    DriverManager.driver.findElements(By.className("search_table_header")).forEach {
        val rawPrice = it.findElement(By.className("base_price02")).text
        val price = rawPrice.toNumber()
        println(price)
    }

    DriverManager.driver.close()
}