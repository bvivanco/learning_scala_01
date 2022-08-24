package com.cookscala.metodos

object Launch {
  def main(args: Array[String]) {
    println("Hello, world")
  }
}

object Hello extends App {
  println("Hello, world 1")
}

object Hello2 extends App {
  if (args.length == 1)
    println(s"Hello, ${args(0)}")
  else
    println("I didn't get your name.")
}

