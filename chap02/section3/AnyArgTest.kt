package chap02.section3

fun main() {
    checkArg("Kotlin")
    checkArg(5)

}
fun checkArg(x: Any){
    if(x is String) {
        println("문자열 x: $x")
    }
    if(x is Int) {
        println("정수형 x: $x")
    }
}