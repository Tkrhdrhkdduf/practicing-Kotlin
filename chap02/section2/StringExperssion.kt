package chap02.section2

fun main() {
    var a=1; //변수 a는 1로 지정
    var str1= "a =$a";// str1은 a=1됨
    var str2= "a = ${a+2}"; //str2 는 a=3이됨
    println("str1: \"$str1\", str2: \"$str2\"");
}