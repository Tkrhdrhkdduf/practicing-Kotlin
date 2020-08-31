package chap02.section3

fun main() {
    var a: Any=1 // any 는 자료형들이 부모 슈퍼클래스이다, 1 이기 떄문에 a= int형
    a=20L// long
    println("a: $a type: ${a.javaClass}")// 자바클라스는 a 가 어떤 기본형을 가지고 있는지 출력

}