package lecture.week1basics

object week1basics extends App {
//val aString = "Hello0"
  val aString = "Hello"
  val aChar = 'C'
  val aInt = 11
  val aFloat = 2.0f
  val aDouble = 2.0
  val aBoolean = true
  val aLong = 11L
  println(aLong.getClass) // выводит int
  //println(aString)
  println('1' +: "42" :+ '3') // выводит 1423
  println('a' +: "bc" :+ 'd') // abcd
  println("a" ++ "bc" :++ "d") // abcd
  val name = "John"
  val surname = "Smith"
  println(s"Hello, ${name + surname}") // выводит Hello, JohnSmith

}
