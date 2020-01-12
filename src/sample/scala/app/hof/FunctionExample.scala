package sample.scala.app.hof

object FunctionExample {
  
  def mul(fN:Double,sN:Double, f:(Double,Double)=>Double):Double=f(fN,sN)
  
  def main(arg:Array[String]){
    val a=22
    val b=44
    val c=100
    println(mul(a,b,(x,y)=>x*y))
     println(mulAll(a,b,c,(x,y)=>x*y))
  }
  
  def mulAll(fN:Double,sN:Double,tN:Double, f:(Double,Double)=>Double):Double=f(f(fN,sN),tN)
  
}