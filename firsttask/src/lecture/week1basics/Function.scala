package lecture.week1basics

object Function extends App{
  def aPerson(name: String, surname: String): String = {
    s"$name $surname"
  }
  println(aPerson("John", "Smith"))

  def aParameterlessFunction(): Unit = println("Function with no parameters")
 aParameterlessFunction()
  aParameterlessFunction
}
