package chap02.section3

fun main() {
    var test: Number = 12.2 // float 형 12.2 스마트캐스트
    println("$test")

    test = 12// int
    println("$test")

    test=120L// long
    println("$test")

    test+=12.0f// float
    println("$test")
}