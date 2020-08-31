package chap02.section4

fun main() {
    var num1 =10
    var num2 =27
    val result1= ++num1 // 먼저 증가함
    val result2= num2++ // 나중에 대입후 증가함
    println("result1: $result1")
    println("result2: $result2")
    println("num1: $num1")
    println("num2: $num2")
}