package com.cookscala.learn

object matchExpression extends App {

  case class Person(firstName: String)
  case class Dog1(name: String)

  //case Person(firstName, "Alexander") => s"found an Alexander, first name = $first"
  //case Dog("Suka") => "found a dog named Suka"

  val i = 2

  val month = i match {
    case 1 => 123
    case 2 => insert
    case 3 => true
    case 4 => 123.toFloat
    case 5 => "May"
    case 6 => "June"
    case 7 => "July"
    case 8 => "August"
    case 9 => "September"
    case 10 => "October"
    case 11 => "November"
    case 12 => "December"
    case _ => "Invalid month" // the default, catch-all
  }

  val resultado = i match {
    case 1 => insert
    case 2 => clear
    case 3 => save
    case _ => None // the default, catch-all
  }

  def insert = {
    //insert new records
  }
  def clear = {
    //limpiamos el DF
  }
  def save = {
    //save bd
  }
  println(month)

  def getClassAsString(x: Any): String = x match {
    case s: String => s + " is a String"
    case i: Int => "Int"
    case f: Float => "Float"
    case l: List[_] => "List"
    case p: Person => "Person"
    case _ => "Unknown"
  }
  val lista = "10,20,30".toList
  println(getClassAsString(lista))

  val cmd = "stop"
  cmd match {
    case "start" | "go" => println("starting")
    case "stop" | "quit" | "exit" => println("stopping")
    case _ => println("doing nothing")
  }

  trait Animal
  case class Dog(name: String) extends Animal
  case class Cat(name: String) extends Animal
  case object Woodpecker extends Animal

  def determineType(x: Animal): String = x match {
    case Dog(moniker) => "Got a Dog, name = " + moniker
    case Cat(nuevo) => s"Got a Cat (ignoring the name) $nuevo"
    case _:Cat => "Got a Cat (ignoring the name)"
    case Woodpecker => "That was a Woodpecker"
    case _ => "That was something else"
  }
  println(determineType(Dog("Rocky")))
  println(determineType(Cat("Rusty the Cat")))
  println(determineType(Woodpecker))

  val valornuevo = 10
  //agregando case Statements
  val resultadoNuevo = valornuevo match {
    case a if 0 to 9 contains a => println("0-9 range: " + a)
    case b if 10 to 19 contains b => println("10-19 range: " + b)
    case c if 20 to 29 contains c => println("20-29 range: " + c)
    case _ => println("Hmmm...")
  }

  resultadoNuevo match {
    case a if 0 to 9 contains a => println("0-9 range: " + a)
    case _ => println("Hmmm...")
  }

  def operacionMat(x:Int)  = {
    val r = x * 10
    println("el resultado es "+ r)
  }

  val num = 5
  num match {
    case x if x == 1 => println("one, a lonely number")
    case x if (x == 2 || x == 3) => println(x)
    case _ => println("some other value")
  }

  val stock = 100
  stock match {
    //case x if (x.symbol == "XYZ" && x.price < 20) => buy(x)
    //case x if (x.symbol == "XYZ" && x.price > 50) => sell(x)
    case _ => // do nothing
  }

  def speak(p: Person) = p match {
    case Person(name) if name == "Fred" => println("Yubba dubba doo")
    case Person(name) if name == "Bam Bam" => println("Bam bam!")
    case _ => println("Watch the Flintstones!")
  }
}
