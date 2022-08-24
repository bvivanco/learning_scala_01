package com.cookscala.learn

object Functions extends App{
  def aFunction(a: String, b: Int):String = {
    a + " " + b
    //a.concat(b.toString)
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction1: Int = 42
  def aParameterlessFunction2(): Int = 42
  println(aParameterlessFunction1)
  println(aParameterlessFunction2)
  // println(aParameterlessFunction) // only works in Scala 2 - parameterless functions are invoked without parentheses

  def aRepeatedFunction(aString: String, n: Int):String = {
    if (n == 1) aString
    else aString + " " + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("hello",3))

  // WHEN YOU NEED LOOPS, USE RECURSION.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString) //Con side effects
  def aFunctionSuma(a: Int, b:Int): Int = a + b   //Sin side effects
  def aFunction2(a: Int, b:Int): Unit = {
    val result = a + b //suma
    println(result)    //imprimir el resultado
    //val avg = calcularPromedio
    //resultFinal = avg /result
  }
  def aFunction2(a: Int, b:Int, c: Int): Unit =  {
    val r = a + b + c
  }

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  println("aBigFunction "+ aBigFunction(10))

  def greetingForKids(name: String, age: Int): String =
    s"El rechazo $name es por numero $age"

  println(greetingForKids("David", 12))
  println(greetingForKids("Graciela", 10))
  println(greetingForKids("Andres", 15))

  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n-1)

  println(factorial(5))

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)

  // 1 1 2 3 5 8 13 21
  println(fibonacci(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))
}
