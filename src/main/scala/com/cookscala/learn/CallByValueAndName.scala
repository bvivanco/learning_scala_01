package com.cookscala.learn

object CallByValueAndName extends App{

  //Call by value:
  //valor es calculado antes del llamado
  //mismo valor usado en todas partes
  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  //Expresion es pasada literalmente
  //Expresion es evaluada en cada uso
  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  println(System.nanoTime())
  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  //  printFirst(infinite(), 34) // stack overflow
  printFirst(34, infinite())
}
