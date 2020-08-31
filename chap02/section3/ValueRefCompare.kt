package chap02.section3

fun main() {
    val a: Int = 128
    val b=a
    println(a==b)
    val c: Int?=a
    val d: Int?=a
    val e: Int?=c
    println(c==d)// 갑이 같음 이중 부호는 값만 같으면 됨
    println(c===d)// 값은 같아도 주소가 다름
    println(c===e)// 삼중 부호는 동일주소이면 true
}