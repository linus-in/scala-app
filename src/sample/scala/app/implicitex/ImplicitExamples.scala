package sample.scala.app.implicitex

import java.util.function.ToIntFunction

object ImplicitExamples extends App {

  //Implicit class is used to create custom behaviour with creation of a class of 1 parameter as arg

  //String enrichment..parse string and return int

  implicit class stringOperations(value: String) {
    def parseToInt: Int = value.toInt
    def encrypt:String=value.map(c1=>(c1+value).asInstanceOf[Char])
  }
  //println("Manish".parseToInt)

  implicit class intImplicit(value: Int) {
    //def times(f:Int=>Int)
    //def *(f:x=>x):Unit
    def *(li: List[Int]): List[Int] = {

      val nLi = for {
        i <- 1 to value
        j <- li
      } yield {
        j
      }
      nLi.toList
    }

  }
  println(10*List(1,2,3,4))
}