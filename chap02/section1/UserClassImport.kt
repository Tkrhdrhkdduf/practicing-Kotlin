package chap02.section1


import com.example.edu.Person as 애인

fun main() { // 패키지를 가져와서 클라스 person 을 이용해 이용
    val user1= 애인("광열", 22);// 패키지애있는 person 클라스 를 유저로 대체
    val user2=Person("?", ?);//현재 패키지에 있는 클라스 이용
    println(user1.name);
    println("나이:"+ user1.age);
    println(user2.name);
    println("나이:"+ user2.age);
    println("둘이 결혼")



}
class Person(val name: String, val age: Int);
