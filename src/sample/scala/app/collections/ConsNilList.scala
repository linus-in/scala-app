package sample.scala.app.collections

object ConsNilList {
  def main(arg:Array[String]){
    //List can't be modified..but it can be prepended using "cons(::)" upto multiple level
    //e.g
    println(1::List(11,22,33))
    
    val li=List(4,5,6)
    //print 2nd index
    println("Element at index 2 in old list before prepending is "+li(2))
    //can't be modified error-value update is not a member of List[Int]..eg  li(2)=200
    //li(2)=200
    val prepNewLi=101::li
    println("Element at index 2 in old list after prepending is "+li(2))
    println("Element at index 2 in new list formed after prepending is "+prepNewLi(2))
    
    ///==============
    //Nil in List ..Nil is used to create an empty list..which can be prepended to form a new list with prepended items
    
    println("Empty list with Nil "+List(Nil)+" printed")
    println("Prepended list with Nil "+2::3::5::7::List(Nil));///thoda ajib sa prepend kar raha..string bhi prepend kar de r
    
    //List methods..head, tail,reverse,etc..
    
    //List by default is immutable as it is present in immutable package scala.collection.immutable.List
    //A mutable list not present
    //object List is not a member of package scala.collection.mutable
    //scala.collection.mutable.List
    
  }
}