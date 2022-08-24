package com.cookscala.importando

import java.lang._
import scala._

import java.io.File
import java.io.IOException
import java.io.FileNotFoundException
import java.io.{File, IOException, FileNotFoundException}
import java.io._
import java.util.{ArrayList => JavaList}
import scala.util.Random

object import1 extends App {
  println("Hello")

  val list = new JavaList[String]
}

class ImportTests1 {
  def printRandom {
    val r = new Random
  }
}

class ImportTests2 {

  import scala.util.Random

  def printRandom {
    val r = new Random
  }
}
