package model

/**
 * author:lsxiao
 * date:2018-12-20 22:46
 * email:faith.epiphone@gmail.com
 */
class AirlineTicket {
    lateinit var dateToGo: String // 去程日期
    lateinit var currentCity: String // 当前城市
    lateinit var destinationCity: String // 目的地城市
    lateinit var takeoffAirport: String // 起飞机场
    lateinit var arriveAirport: String // 到达机场
    lateinit var airplaneModel: String// 机型
    lateinit var airlineNumber: String // 航线
    lateinit var takeoffTime: String // 起飞时间
    lateinit var arriveTime: String // 到达时间
    var price: Int = 0// 价格
    override fun toString(): String {
        return "(起飞机场='$takeoffAirport', 到达机场='$arriveAirport', 价格=$price, 起飞时间='$takeoffTime', 到达时间='$arriveTime',出发日期='$dateToGo', 起始城市='$currentCity', 到达城市='$destinationCity',机型='$airplaneModel', 航线='$airlineNumber', )"
    }

    fun println() {
        println(this)
    }

    fun print() {
        print(this)
    }
}