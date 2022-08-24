package com.cookscala.learn

object Herencia extends App{

  class Animal {
    val creatureType = "wild"
    def eat = println("aullido natural")
  }
  class Cat extends Animal {
    def crunch = {
      eat
      println("miau")
    }
  }

  val cat = new Cat
  cat.crunch


  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)
  //class Adult1(name: String, age: Int, idCard: String) extends Person(name, age)

  // overriding
  class Dog(override val creatureType: String) extends Animal {
    //    override val creatureType = "domestic" // can override in the body or directly in the constructor arguments
    override def eat = {
      super.eat
      println("crunch, crunch")
    }
  }
  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)


  // type substitution (broad: polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

}
