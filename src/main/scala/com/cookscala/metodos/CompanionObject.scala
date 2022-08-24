package com.cookscala.metodos

object CompanionObject extends App{
  class Person {
    var name: String = _
  }
  object Person {
    def apply(name: String): Person = {
      var p = new Person
      p.name = name
      p
    }
  }
  //sin usar new
  val dawn = Person("Dawn")
  val a = Array(Person("Dan"), Person("Elijah"))
  println(dawn)
  println(a)

  case class Person1 (var name: String)
  val p = Person("Fred Flinstone")
}
