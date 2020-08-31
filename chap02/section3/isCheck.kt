package chap02.section3

fun main() {
    var test: Number= 256

    if(test is Int)
        print("$test")
    else if(test !is Int)
        println("not a Int")

}