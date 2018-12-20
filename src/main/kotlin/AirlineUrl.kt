/**
 * author:lsxiao
 * date:2018-12-20 12:41
 * email:faith.epiphone@gmail.com
 */
class AirlineUrl(private val goDate: String, private val backDate: String, private val fromCity: String = "bjs", private val toCity: String = "ckg") {

    override fun toString(): String = "http://flights.ctrip.com/itinerary/roundtrip/$fromCity-$toCity?date=$goDate%2C$backDate"
}