package sample.scala.app.darksyntaxsugar

object DarkSugarsSyntax2 {
  
  abstract class Vehicle{
    def run(speed:Int):String
    //Ref1 type mismatch;  found   : Int => String  required: sample.scala.app.darksyntaxsugar.DarkSugarsSyntax2.Vehicle
   //def run2(speed:Int):String
  }
  def main(arg:Array[String]){
    //Ref1 type mismatch;  found   : Int => String  required: sample.scala.app.darksyntaxsugar.DarkSugarsSyntax2.Vehicle
    val vehicleIns:Vehicle=(speed:Int)=>{
      println("Inside run impl")
      "Hey drove my car at $speed kmph"
    }
    println(vehicleIns.run(100))
  }
}