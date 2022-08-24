package com.cookscala.learn

import scala.language.postfixOps

object Numbers extends App{
  Short.MinValue
  Short.MaxValue

  println(Int.MinValue) //-2,147,483,648
  println(Int.MaxValue) //2147483647
  Float.MinValue

  "100".toInt
  "100".toDouble
  "100".toFloat
  "1".toLong
  "1".toShort
  "1".toByte
  //"foo".toInt //Dump???

  val b1 = BigInt("1")
  val b2 = BigDecimal("3.14159")

  Integer.parseInt("10", 2)

  def toInt(s: String):Option[Int] = {
    try {
      Some(s.toInt)
    } catch {
      case e: NumberFormatException => None
    }
  }
  println(toInt("10").getOrElse(0))
  println(toInt("a111").getOrElse(0))

  val result = toInt("10") match {
    case Some(x) => x
    case None => 0 // however you want to handle this
  }
  println(result)

  19.45.toInt
  19.toFloat
  19.toDouble
  19.toLong
  val b = 1945.toFloat


  //Anulando el tipo numero predeterminado
  val a1 = 1
  val a2 = 1d
  val a3 = 1000L
  val a4_1 = 0
  val a4 = 0: Byte
  val a5 = 0: Int
  val a6 = 0: Short
  val a7 = 0: Double
  val a8 = 0: Float

  //ascription. Upcast String a Object  //no es muy comun
  val s = "Dave"
  val p = s: Object
  val p1 = s: Object

  //++ y --
  var a = 1 //mutable
  a += 1
  a = a + 1
  println(a)

  a -= 1
  println(a)

  var i = 1
  i *= 2
  println(i)

  i *= 2
  println(i)

  i /= 2
  println(i)

  //Dump
  val xerror = 1
  //xerror += 1

  var x = 1d
  x += 1
  println(x)

  //Manejando numeros muy grandes
  var large = BigInt(1234567890)
  var large1 = BigDecimal(123456.789)
  large1 + large1
  large1 * large1
  println(large1)

  large1.toInt
  large1.toLong
  large1.toFloat
  large1.toDouble

  large1.isValidChar
  large1.isValidByte
  large1.isValidShort

  if (large1.isValidInt) large1.toInt

  println("Char.MinValue" + Char.MinValue)
  println("Char.MinValue" + Char.MaxValue)
  println(Byte.MaxValue)
  println(Short.MaxValue)
  println(Int.MaxValue)
  println(Long.MaxValue)
  println(Double.MaxValue)

  //Random
  val r = scala.util.Random
  println("Random: "+ r.nextInt)
  println("Random: "+ r.nextInt(100))
  r.nextFloat
  r.nextDouble
  val r1 = new scala.util.Random(100)
  var range = 0 to r.nextInt(10)
  val random2 = for (i <- 0 to r.nextInt(10)) yield i * 2
  random2.foreach(println)

  val random3 = for (i <- 0 to r.nextInt(10)) yield (i * r.nextFloat)
  random3.foreach(println)

  val random4 = for (i <- 0 to r.nextInt(10)) yield r.nextPrintableChar
  random4.foreach(println)

  //Range, List y Array de numeros
  val range1 = 1 to 10
  val range2 = 1 to 10 by 2
  val range3 = 1 to 10 by 3
  for (i <- 1 to 5) println(i)
  for (i <- 1 until 5) println(i)

  //diferentes formas de crear listas

  val range4 = 1 to 10 toArray
  val range5 = 1 to 10 toList
  val range6 = (1 to 10).toList
  val range7 = (1 to 10).toArray

  for (i <- 1 to 5) yield i * 2

  //formateando numeros
  val formatter1 = java.text.NumberFormat.getIntegerInstance
  println(formatter1.format(10000))

  val formatter2 = java.text.NumberFormat.getInstance
  println(formatter2.format(10000.33))

  val formatter3 = java.text.NumberFormat.getCurrencyInstance
  println(formatter3.format(123.456789))
  println(formatter3.format(1234.56789))
  println(formatter3.format(12345.6789))
  println(formatter3.format(123456.789))
}
