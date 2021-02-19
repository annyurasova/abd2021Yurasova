package lecture.week1basics

object Expressions extends App{
  //val aVal = 1 + 2 * 3
  //print(1 + 2 * 3)
  val aCondition = true
  val ifExpressionValue = if (aCondition) "True Condition" else "False Condition"
 println(ifExpressionValue) // выведет True Condition
  //val aCondition = true
  println(if(aCondition) "True Condition" else "False Condition") //  выведет True Condition
  //val someVal = print("I just want to print")
  //val someVal0: Unit = print("I just want to print")
  val aCodeBlock = {
    val someVal = 1
    val y = 2
    if (someVal + y > 1) true else false
  }
  println(aCodeBlock) // выводит true
  val aCodeBlock0 = {
    val someVal = 1
    val y = 2
    if (someVal + y > 1) true else false
    "String to return"
  }
  println(aCodeBlock0) // выводит "String to return"
  val someValue = {
    1 < 0
    2 == 5
    4 < 9
  }
  val someCodeBlock = {
    if (someValue) 1 else 0
    0
  }
  println(someCodeBlock)


}
