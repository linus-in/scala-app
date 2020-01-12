package sample.scala.app.darksyntaxsugar

object DarkSugars {
  
  def singlArgMethod(arg1:Int):String={
    "Successfully tried passing arguments as codeblock/exp"
  }
  
  def main(arg:Array[String]){
    //Normal syntax of calling method
    println(singlArgMethod(1));
    //Dark syntax of calling method with block of code as parameters
    println(singlArgMethod{ val a=10
      a*100});
    
    //Dark syntax for calling map
    List(1,2,3).map {
      //?? missing parameter type for expanded function ((x$2: <error>) => x$2.$plus(3))
//      _=>_+3
      x=>x+2
    }
  }
}