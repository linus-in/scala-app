package sample.scala.app.collections

object ForYield {
  
  def main(arg:Array[String]){
    val li=List(1,2,3,4,5,6)
    val liTu =List((1,2,"Man"),(4,5,"Woman"),(6,7,"Hype"))
  
    //';' expected but 'yield' found.
//    val a=for(x<-li){
//      
//    } yield{
//      println(a)
//    }
// 
    
    
    val a=for(i<-li) 
      yield{
      //prints each element
       println(i)
       //returns each element.. which is collected by val a and a adds item per iteration into it
       i
    }
    println(a)
    
//    val b=for(i<-liTu 
//        j<-li) yield{}
  }
}