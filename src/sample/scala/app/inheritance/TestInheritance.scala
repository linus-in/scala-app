package sample.scala.app.inheritance

object TestInheritance {
  
  //only traits and abstract classes can have declared but undefined members
//  def main(args:Array[String]):Unit{
//    
//  }
  
  //Allowed??????How..as per above error it is also undefined method
//  def main(args:Array[String]){
//    
//  }
  //clarified above issue
  def main(args:Array[String]):Unit={
   println("Hi")
   val triangle=new Triangle
   //type mismatch;  found   : sample.scala.app.inheritance.Square  required: sample.scala.app.inheritance.Triangle
//   var triangle=new Triangle
//   triangle=new Square
   //==> doesn't provide runtimme polymortphism I think
   
   //It also works ...confused!!!!!!..How can a method collect instance/object of a class
   //def triangle1=new Triangle
   
   println(triangle.calculateArea)
  }
}