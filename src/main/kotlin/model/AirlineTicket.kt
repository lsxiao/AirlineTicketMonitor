package model

/**
 * author:lsxiao
 * date:2018-12-20 22:46
 * email:faith.epiphone@gmail.com
 */
class AirlineTicket(
    val dateToGo: String, // 去程日期
    val currentCity: String, // 当前城市
    val destinationCity: String, // 目的地城市
    val currentCityCode: String, // 当前城市代码(携程)
    val destionationCityCode: String, // 目的地城市代码(携程)
    val price: Int,// 价格
    val airplaneModel: String,// 机型
    val airlineNumber: String, // 航线
    val takeoffTime: String, // 起飞时间
    val arriveTime: String // 到达时间
)