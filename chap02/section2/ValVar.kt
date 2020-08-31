package chap02.section2

fun main() {
    val number=10; //val 은 초기값으로 지정 변경 불가능 변수만 지정해주면 알아서 자료형 지정해줌
    var language="Korean";// var 은 초기값 지정해도 변경 가능
    val secondnumber: Int = 20;// 두번쨰는 자료형 설정 해줌
    language="English";// korean 을 잉글리쉬로 바꿈
    println("number: $number");
    println("language: $language");
    println("secondnumber: $secondnumber");
}