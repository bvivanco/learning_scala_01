package com.cookscala.traits

object Trait2 extends App {
  val thays = new Dog("Thays")
  thays.ownerIsHome
  thays.ToString
  thays.jumpForJoy
}

trait Tail {
  def wagTail {
    println("la cola se mueve")
  }
  def stopTail {
    println("la cola se paro")
  }
}

abstract class Pet(var name: String) {
  def speak // abstract
  def ownerIsHome {
    println("emocionado")
  }

  def jumpForJoy {
    println("saltando por diversion")
  }
}

class Dog(name: String) extends Pet(name) with Tail {
  def speak {
    println("woof")
  }

  override def ownerIsHome {
    wagTail
    speak
  }
  def ToString() = println("Texto de animales")
}