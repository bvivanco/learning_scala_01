package com.cookscala.clases

object Clases extends App {

  class Person(var firstName: String, var lastName: String) {
    println("the constructor begins")
    // some class fields
    protected val HOME = System.getProperty("user.home")
    var age = 40

    // some methods
    override def toString = s"$firstName $lastName is $age years old"
    //def toString1 = s"$firstName $lastName is $age years old"

    def printHome {
      println(s"HOME = $HOME")
    }

    def printFullName {
      println(this)
    } // uses toString
    printHome
    printFullName
    println("still in the constructor")
  }

  class Person1(var name: String)

  val persona = new Person("Luis","Vivanco")
  persona.printHome
  persona.printFullName

  val p = new Person1("Bryan")
  //setter
  p.name
  //getter
  p.name = "Antonio"
  println(p.name)


  //Utils classes
  val contents = Utils.readFile("input.txt")
  Utils.writeToFile("output.txt", "asdasd")

  //val utils = new Utils //no es posible. Solo un objeto es definido

  class Socket (val timeout: Int = 10000)
  val s = new Socket
  s.timeout

  val s1 = new Socket(5000)
  s1.timeout

  val s2 = new Socket(timeout=5000)
  s2.timeout

  class Socket1(val timeout: Int = 1000, val linger: Int = 2000) {
    override def toString = s"timeout: $timeout, linger: $linger"
  }
}
