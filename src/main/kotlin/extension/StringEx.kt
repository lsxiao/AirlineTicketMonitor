package extension

/**
 * author:lsxiao
 * date:2018-12-20 22:35
 * email:faith.epiphone@gmail.com
 */

/**
 * 过滤出数字
 */
fun String.onlyDigit(): String {
    var result = ""
    val numbers = "0123456789"
    for (char in this) if (numbers.contains(char)) result += char
    return result
}
