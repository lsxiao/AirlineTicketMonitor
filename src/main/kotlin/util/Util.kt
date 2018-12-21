package util

import extension.onlyDigit
import extension.with
import manager.Browser
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

    Browser.instance.with(url) { root ->
        val currentCity = root.findElement(By.id("dcity0")).getAttribute("value")
        val destinationCity = root.findElement(By.id("acity0")).getAttribute("value")

        root.findElements(By.className("search_table_header")).forEach { element ->
            val price = element.findElement(By.className("base_price02")).text.onlyDigit().toInt()
            val times = element.findElements(By.className("time_box"))
            val airports = element.findElements(By.className("airport"))
            val takeoffTime = times[0].text
            val arriveTime = times[1].text
            val takeoffAirport = airports[0].text
            val arriveAirport = airports[1].text

            val ticket = AirlineTicket()
            ticket.dateToGo = airline.dateToGo
            ticket.price = price
            ticket.currentCity = currentCity
            ticket.destinationCity = destinationCity
            ticket.takeoffTime = takeoffTime
            ticket.arriveTime = arriveTime
            ticket.takeoffAirport = takeoffAirport
            ticket.arriveAirport = arriveAirport
            ticket.airlineNumber = ""
            ticket.airplaneModel = ""
            tickets.add(ticket)
        }
    }

    return tickets
}
