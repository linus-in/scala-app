package sample.scala.app.hof

object CurriedFunction {

  def curriedFun1(x: Int) = (y:Int) => {
    val c = x - y
    (x+y)*c
    
  }
  
    def curriedFun2(x: Int) (y:Int) ={
    val c = x - y
    x*c
    
  }

  def main(arg: Array[String]) {
  println(curriedFun1(10)) //sample.scala.app.hof.CurriedFunction$$$Lambda$5/1072408673@10f87f48
  println(curriedFun1(10)(9)) //19
  val cf1temp=curriedFun1(10)
  println(cf1temp(9))
  //missing argument list for method curriedFun2 in object CurriedFunction Unapplied methods are only converted to functions when a function type is expected. You can make this conversion explicit by writing `curriedFun2 _` or `curriedFun2(_)(_)` instead of `curriedFun2`.
  //println(curriedFun2(10))
  println(curriedFun2(10)(9))
  }

}