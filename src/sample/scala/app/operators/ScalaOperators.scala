package sample.scala.app.operators

object ScalaOperators {
  def main(arg: Array[String]) {
    val a = 1
    val b = 2
    //value *> is not a member of Int
    //a*>b
    println(a + b)
    //+ act as a function..all operators are function.. for each datatype there are available functions for the operation
    println(a.toString)
    println(a toString)
    //
    //println(a.eq(b))
    //a.*(x)
    val c = "C"
    val d = "D"
    
    //value *> is not a member of String
    //c*>d

    //missing parameter type
    //    List(1,2,3).fold(0){
    //      x=>x+1
    //      }
  }
  
  def equalEqual(arg:Any):Boolean={
    val a=1;val b=2;
    //a==b and  a.equals(b) are same and one should override equals method
    a==b
    a.equals(b)
  }
  
  def reassignTest(x:Int)={
    //? forward reference extends over definition of value li
    //val li:List[Int]= x :: li
    //val li:List[Int]= li ::  x
  }
}