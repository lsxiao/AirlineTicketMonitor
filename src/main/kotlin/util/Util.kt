package util

import extension.onlyDigit
import extension.with
import manager.ChromeDriverManager
import model.AirlineTicket
import model.OneWayAirline
import org.openqa.selenium.By

/**
 * author:lsxiao
 * date:2018-12-20 03:06
 * email:faith.epiphone@gmail.com
 */

fun fetchTickets(airline: OneWayAirline): List<AirlineTicket> {
    val url = airline.getUrl()

    val tickets = arrayListOf<AirlineTicket>()

    ChromeDriverManager.instance.with(url) {
        it.findElements(By.className("search_table_header")).forEach { element ->
            val price = element.findElement(By.className("base_price02")).text.onlyDigit().toInt()
            val times = element.findElements(By.className("time_box"))
            val takeoffTime = times[0].text
            val arriveTime = times[1].text

            // todo 完成所有信息解析

            println("价格:$price,起飞时间:$takeoffTime,到达时间:$arriveTime")
        }
    }

    return tickets
}
