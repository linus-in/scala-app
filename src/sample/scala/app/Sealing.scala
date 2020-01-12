package sample.scala.app

object Sealing {
  
  sealed class  Word
   //sealed trait  Word
//  class Noun extends Word
//  class Adjective extends Word
   
   ///case classes must have a parameter list
//    case class Noun() extends Word
//   case class Adjective() extends Word
  case class Noun() extends Word
   case class Adjective() extends Word
  def classType(name:Word)=name match{
    case Noun()=>"Noun"
    case Adjective()=>"Adjective"
  }
  
//  for(i<-1 to 10 
//      j<-22 to 55)
  def area(radius:Double)={
    val pi=3.14
    pi*radius*radius
    
  }
  area(3)
  
  def main(args:Array[String])={
    println(area(3))
  }
  
}