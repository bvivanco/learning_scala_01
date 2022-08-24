package com.cookscala.clases

object Visibilidad extends App{
  //var: Scala generates both getter and setter methods for that field.
  class Persona1(var name: String)
  val p1 = new Persona1("Bryan Vivanco")
  // getter
  p1.name

  // setter
  p1.name = "Luis Saldana"
  println(p1.name)

  //val: Scala generates only a getter method for it.

  class Persona2(val name: String)
  val p2 = new Persona2("Alvin Alexander")
  p2.name
  //p2.name = "Fred Flintstone" //error

  //No val or var: Scala gets conservative, and doesn’t generate a getter or setter method for the field.
  class Persona3(name: String)
  val p3 = new Persona3("Alvin Alexander")
  //p3.name

  class Persona4(var name: String) { def getName {println(name)} }
  val p4 = new Persona4("Alvin Alexander")
  p4.name

  //Son val por defecto
  case class Persona5(name: String)
  val p5 = Persona5("Dale Cooper")
  p5.name

  /* AUXILIARY CONTRUSCTORS
   */

  // primary constructor
  class Pizza (var crustSize: Int, var crustType: String) {
    // one-arg auxiliary constructor
    def this(crustSize: Int) {
      this(crustSize, Pizza.DEFAULT_CRUST_TYPE)
    }
    // one-arg auxiliary constructor
    def this(crustType: String) {
      this(Pizza.DEFAULT_CRUST_SIZE, crustType)
    }
    // zero-arg auxiliary constructor
    def this() {
      this(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
    }
    override def toString = s"A $crustSize inch pizza with a $crustType crust"
  }
  object Pizza {
    val DEFAULT_CRUST_SIZE = 12
    val DEFAULT_CRUST_TYPE = "THIN"
  }

  val p1a = new Pizza(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
  val p2a = new Pizza(Pizza.DEFAULT_CRUST_SIZE)
  val p3a = new Pizza(Pizza.DEFAULT_CRUST_TYPE)
  val p4a = new Pizza

}
