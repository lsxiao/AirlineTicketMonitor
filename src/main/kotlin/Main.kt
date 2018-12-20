import model.OneWayAirline
import util.fetchTickets

/**
 * author:lsxiao
 * date:2018-12-20 02:33
 * email:faith.epiphone@gmail.com
 */
fun main(args: Array<String>) {

    val fromCity = "bjs" // 北京
    val toCity = "ckg" // 重庆

    val oneWayAirline = OneWayAirline(currentCity = fromCity, destinationCity = toCity, dateToGo = "2019-02-1")

    println(oneWayAirline.getUrl())

    fetchTickets(oneWayAirline)

}