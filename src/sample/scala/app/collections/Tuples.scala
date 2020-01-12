package sample.scala.app.collections

object Tuples {

  def main(arg: Array[String]) {
    //    too many arguments (3) for method apply: (_1: T1, _2: T2)(T1, T2) in object Tuple2
    //    val tupEx=Tuple2(1,"aa",3)

    val tupEx = Tuple3(1, "aa", 3)

    val tupListEx = List(Tuple3(1, "aa", 3), Tuple3(2, "bb", 4))

    //upto Tuple22 is possible

    //Accessing tuple values
//    for (
//      i <- tupListEx
//    ) {
//        println(tupListEx(i))
//    }
    tupListEx.foreach(e=>println(e._1+","+e._2+","+e._3))
    //val t[A]
    tupEx.productIterator.foreach(e=>println(e))

  }
}