package model

/**
 * author:lsxiao
 * date:2018-12-20 12:41
 * email:faith.epiphone@gmail.com
 */
class OneWayAirline(
    val dateToGo: String,
    val currentCity: String = "bjs",
    val destinationCity: String = "ckg"
) {

    fun getUrl(): String = "http://flights.ctrip.com/itinerary/oneway/$currentCity-$destinationCity?date=$dateToGo"
}