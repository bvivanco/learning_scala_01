package com.cookscala.fp

object fp1 extends App{

  //programacion funcional

  val x = List.range(1, 10)
  val evens = x.filter((i: Int) => i % 2 == 0)
  val evens1 = x.filter(_ % 2 == 0)
  x.foreach((i:Int) => println(i))

  //usando funcion como variable
  val double = (i: Int) => { i * 2 }
  double(2)
}
