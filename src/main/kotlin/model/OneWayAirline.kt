package model

/**
 * author:lsxiao
 * date:2018-12-20 12:41
 * email:faith.epiphone@gmail.com
 */
class OneWayAirline(
    private val dateToGo: String,
    private val currentCity: String = "bjs",
    private val destinationCity: String = "ckg"
) {

    fun getUrl(): String = "http://flights.ctrip.com/itinerary/oneway/$currentCity-$destinationCity?date=$dateToGo"
}