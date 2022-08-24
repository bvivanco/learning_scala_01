package com.cookscala.metodos

object Singleton extends App{
  CashRegister.open
  CashRegister.close
}

object CashRegister {
  def open { println("opened") }
  def close { println("closed") }
}