package sample.scala.app.implicitex

object ImplicitExamples2 extends App {
  
  //value mod is not a member of Int
  //1 mod 2
  
  //implicit class MathOps(num:Int)
  case class MathOps(num:Int){
    def mod(base:Int):Int={
      num % base
    }
  }
  
  //value mod is not a member of Int
  //println(5 mod 2)
  implicit def getMathOps(num:Int):MathOps=MathOps(num)
  println(5 mod 2)//Searches for all implicits(class,method,val,etc) to fit the call
  
}