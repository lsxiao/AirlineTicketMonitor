import manager.Browser
import model.OneWayAirline
import util.fetchTickets

/**
 * author:lsxiao
 * date:2018-12-20 02:33
 * email:faith.epiphone@gmail.com
 */
fun main(args: Array<String>) {

    val beijing = "bjs" // 北京
    val chongqing = "ckg" // 重庆

    val oneWayAirline = OneWayAirline(currentCity = beijing, destinationCity = chongqing, dateToGo = "2019-01-31")

    println(oneWayAirline.getUrl())


    fetchTickets(oneWayAirline).forEach {
        it.println()
    }

    println("-----------------divider-------------------")

    fetchTickets(OneWayAirline(currentCity = chongqing, destinationCity = beijing, dateToGo = "2019-02-10")).forEach {
        it.println()
    }

    Browser.instance.quit()
}