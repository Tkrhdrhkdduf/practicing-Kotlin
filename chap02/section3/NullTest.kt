package chap02.section3

fun main() {
    var str1: String?="Kotlin"// 문자열 이 null 일떄는 문자열 자료형 String 을 ? 이걸로 표시해야 null 이 표기됨
    str1= null
    var len= if(str1 != null) str1.length else -1 // 조건무에ㅓ 문자열이 널이 아니면 길이가 나오도록 하는데
    // 이미 스트링은 null 이기떄문에 len 으롯써는 -1 이출력
    println("str1: $str1.length: ${len}")
    println("str1: $str1.length: ${str1?.length?:-1}")// 위에와 동일
}