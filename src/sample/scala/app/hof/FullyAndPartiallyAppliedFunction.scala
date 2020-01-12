package sample.scala.app.hof

object FullyAndPartiallyAppliedFunction {
  
  
  def main(arg:Array[String]){
   // fullyAppliedFun
    //partiallyAppliedFun
   
    println( fullFunction(10,20))
     println( partialFunction(14))
  }
//  def fullyAppliedFun(){
//    
//  }
  //can give volume of all sizes of containers
  val fullFunction=(radius:Double,height:Double)=>{
    3.14*radius*radius*height
  }
  //can give volume for all containers of radius 5 units
  val partialFunction=fullFunction(5,_:Double)
//  def partiallyAppliedFun(){
//    val partialFunction=fullFunction(5,_:Double)
//  }
  
}