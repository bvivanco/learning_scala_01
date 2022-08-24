package com.cookscala.metodos

//llamando sin los parametros
object Metodo1 extends App{
  class Connection {
    def makeConnection(timeout: Int = 5000, protocol:String = "http") {
      println("timeout = %d, protocol = %s".format(timeout, protocol))
      // more code here
    }
  }

  val c = new Connection
  c.makeConnection()
  c.makeConnection(2000)
  c.makeConnection(3000, "https")

  //Expicificando en el llamado al metodo los parametros
  class Pizza {
    var crustSize = 12
    var crustType = "Thin"
    def update(crustSize: Int, crustType: String) {
      this.crustSize = crustSize
      this.crustType = crustType
    }
    override def toString = {
      "A %d inch %s crust pizza.".format(crustSize, crustType)
    }
  }

  val p = new Pizza
  println(p)
  p.update(crustSize = 16, crustType = "Thick")
  println(p)
  p.update(crustType = "Pan", crustSize = 14)
  println(p)

  //Returnando Tuples
  def getStockInfo = {
    // other code here ...
    ("NFLX", 100.00, 101.00) // this is a Tuple3
  }

  val (symbol, currentPrice, bidPrice) = getStockInfo
  println(getStockInfo)
  //Opcion 1
  println(symbol)
  println(currentPrice)
  println(bidPrice)

  //Opcion 2
  val result = getStockInfo
  println(result._1)
  println(result._2)
  println(result._3)

}
