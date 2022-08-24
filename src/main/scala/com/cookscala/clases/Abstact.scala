package com.cookscala.clases

abstract class Pet (name: String) {
  val greeting: String
  var age: Int
  def sayHello { println(greeting) }
  override def toString = s"Yo digo $greeting, mi edad es $age"
}

class Dog (name: String) extends Pet (name) {
  val greeting = "Guau"
  var age = 2
}
class Cat (name: String) extends Pet (name) {
  val greeting = "Miau"
  var age = 5
}

object Abstact extends App{
  val dog = new Dog("Thays")
  val cat = new Cat("Morris")
  dog.sayHello
  cat.sayHello
  println(dog)
  println(cat)

  cat.age = 10
  println(cat)
}

abstract class BaseController(db: String) {
  def save   { println("save") }
  def update { println("update") }
  def delete {  println("delete") }
  // abstract
  def connect
  // an abstract method that returns a String
  def getStatus: String
  // an abstract method that takes a parameter
  def setServerName(serverName: String)
}


