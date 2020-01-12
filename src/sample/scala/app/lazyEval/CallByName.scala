package sample.scala.app.lazyEval

object CallByName {
  
  
  def normalMethod(arg:String){
    //println(s"Hi $arg")
    //Expression callByName in main method get evaluated even when parameter not used (bcoz arg is not call by name)
    println(s"Hi NM")
  }
  //':' expected but identifier found....identifier expected but '}' found.
//  def callByNameForLazyEval(arg:=> String){
//     println(s"Hi $arg")
//  }
  
  //?? Can't understand the requirement of space between : and  =>
  def callByNameForLazyEval(arg: => String){
     //println(s"Hi $arg")
    //Expression callByName in main method doesn't get evaluated as parameter not used (lazy evaluation)
    println(s"Hi")
  }
  
  def main(args:Array[String]){
    val suffix="kumar"
    
    
//    lazy val lazySuffix="Lazy Kumar"
//   lazy val name={
//      println("Determine name")
//      s"Manish $lazySuffix"}
    
    val callByName=(name:String,suffix:String)=>{
      println("HHHHHHHHHHHH")
      name+suffix
    }
    
    callByNameForLazyEval(callByName("Manish","Lazy Kumar"))
    normalMethod(callByName("Manish","Trivedi"))
    
  }

}