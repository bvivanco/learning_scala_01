package com.cookscala.learn

import java.lang.Thread.sleep
import scala.util.matching.Regex

object Strings extends App {
  val s = "Hello, world"

  //final String  = "Hello, world" //equivalente en Java
  val s1: String = "Hello, world" // no se recomienda inferirlo -  implicit syntax

  // String: Secuencia de caracteres
  //Seq[Char]

  val s2 = "Big Belly Burger"

  println("contador de B: " + s2.count(car => car == 'B'))

  println("contador de B: " + s2.count(_ == 'B')) // 3
  println(s2.dropRight(3)) // "Big Belly Bur"
  println(s2.dropWhile(_ != ' ')) // " Belly Burger"
  println(s2.filter(_ != ' ')) // "BigBellyBurger"
  println(s2.filter(c => c != ' ')) // "BigBellyBurger"


  println(s2.sortWith(_ < _)) // "  BBBeeggillrruy"
  println(s2.take(3)) // "Big"
  println(s2.takeRight(3)) // "ger"
  println(s2.takeWhile(_ != 'R')) // "Big Belly Bu"

  println(s2.takeWhile(c => c != 'R')) // "Big Belly Bu"

  println("scala".drop(2).take(2).capitalize)

  //Testing string
  val st1 = "Hello"
  val st2 = "Hello"
  val st3 = "H" + "ello"
  val st3_1 = "H".concat("ello")

  println(st1 == st2)

  val st4 = "Hello" // Hello
  val st5 = "hello" // hello
  st4.toUpperCase == st5.toUpperCase

  //Multiple String
  val foo =
    """This is
    a multiline
    a lot
    muchos
    varios
    String"""


  println(foo)

  val foo1 =
    """Four score and
seven years ago"""
  println(foo1)

  val speech1 =
    """Four score and
      |seven years ago""".stripMargin
  println(speech1)

  val speech2 =
    """Four score and
      #seven years ago""".stripMargin('#')
  println(speech2)


  //Splitting Strings
  "hello world".split(" ")
  "hello world".split(" ").foreach(println)

  val str = "eggs, milk, butter, Cocoa Puffs"
  val arrayStr = str.split(",")

  println(arrayStr)
  arrayStr.foreach(println)

  str.split(",").map(_.trim).foreach(println)

  //Subtituyendo variables dentro de un String
  //String interpolators
  val name = "Fred"
  val age = 33
  val weight = 200.00
  val condition = "[0-9]"
  val valueFail = "new123"
  val valor1 = 100
  val valor2 = 50
  val valor3 = valor2- valor1

  val rejectCondition1 = "El valor no cumple con la condicion" + condition + " . El valor encontrado fue: " + valueFail
  val rejectCondition2 = s"El valor no cumple con la condicion $condition. El valor encontrado fue: $valueFail"

  //val rejectConditionGeneral (t1, t2, t3):String = s"El valor no cumple con la condicion $t1. El valor encontrado fue: $t2. Por favor, corregirlo $t3"
  //rejectConditionGeneral(name, age, weight)

  println(s"$name is $age years old and weighs $weight pounds $valueFail.")
  println(s"Age next year: ${age + 1}")
  println(s"El resultado final es: ${valor1 - valor2}")
  println(s"El resultado final es: $valor3")
  println(s"You are 33 years old: ${age == 33}")

  case class Student(name: String, score: Int)

  val hannah = Student("Hannah", 95)
  println(s"${hannah.name} has a score of ${hannah.score}")

  println(f"$name is $age years old and weighs $weight%.2f pounds.")
  println(f"$name is $age years old and weighs $weight%.0f pounds.")
  val str1 = f"$name, you weigh $weight%.0f pounds."
  println(s"foo\nbar")


  //Formateo
  val h = "Hello"

  val format1 = f"'$h%s'" // 'Hello'
  println(format1)
  f"'$h%10s'" // '     Hello'
  f"'$h%-10s'" // 'Hello     '

  f"'${h}%s'" // 'Hello'
  f"'${h}%10s'" // '     Hello'
  f"'${h}%-10s'" // 'Hello     '

  val a = 10.3456 // a: Double = 10.3456
  val b = 101234567.3456 // b: Double = 1.012345673456E8

  val formato1 = f"'${a}%.1f'" // '10.3'
  println(formato1)
  f"'${a}%.2f'" // '10.35'
  f"'${a}%8.2f'" // '   10.35'
  f"'${a}%8.4f'" // ' 10.3456'
  f"'${a}%08.2f'" // '00010.35'
  f"'${a}%-8.2f'" // '10.35   '

  f"'${b}%-2.2f'" // '101234567.35'
  f"'${b}%-8.2f'" // '101234567.35'
  f"'${b}%-14.2f'" // '101234567.35  '

  //map or foreach methods
  val upper = "hello, world".map(c => c.toUpper)
  val upper2 = "hello, world 2".map(_.toUpper)
  println(upper2)
  val upper3 = "hello, world".filter(_ != 'l').map(_.toUpper)
  println("upper3 " + upper3)

  for (c <- "hello") println(c)

  //for/yield es similar al map
  val upper4 = for (c <- "hello, world") yield c.toUpper
  println(upper4)

  def toLower(c: Char): Char = (c.toByte + 32).toChar

  println("HELLO".map(toLower))

  def reverse(x: String) = {
    println("taking my time.");
    sleep(100)
    x.reverse
  }

  println(reverse("buen dia"))

  val str1_1 = "hello, world"
  val result = for {
    c <- str1_1
    if c != 'l'
  } yield c.toUpper

  println("result: " + result)

  //Patrones en String (Regex)

  val numPattern = "[0-9]+".r //usando el .r creamos un Regex object
  println(numPattern)

  val address = "123 Main Street Suite 101"
  val match1 = numPattern.findFirstIn(address)
  match1.foreach(println)
  println("match1: " + match1)

  val matches = numPattern.findAllIn(address)
  println("matches: " + matches)
  for{
    c <- matches
  } yield println(c)

  matches.foreach(println)

  val matches1 = numPattern.findAllIn(address).toArray
  println("matches1: "+ matches1)
  matches1.foreach(println)

  //Regex ^([A-Za-z0-9])*$
  val numPattern1 = new Regex("[y-z]+")
  val address2 = "123 Main Street Suite 101"
  val match2 = numPattern1.findFirstIn(address2)
  val result2 = numPattern1.findFirstIn(address2).getOrElse("no match")
  println(match2)
  println(result2)

  //Remplazando patrones en String
  val address3 = "123 Main Street".replaceAll("[0-9]", "x")
  val regex = "[0-9]".r
  val newAddress = regex.replaceAllIn("123 Main Street", "x")
  println(newAddress)

  //Extrayendo partes de un string con patrones Regex
  val pattern = "([0-9]+) ([A-Za-z]+)".r

  val pattern(count, fruit) = "100 Bananas"
  println(count)
  println(fruit)

  //Accediendo a un caracterer en un String
  "hello".charAt(0)
  "hello"(0) //h
  "hello"(1) //e
  "hello".apply(1) //e
}
