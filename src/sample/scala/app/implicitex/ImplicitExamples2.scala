package sample.scala.app.implicitex
//implicits can't be defined at top level..it can only be defined in class, object ,trait
object ImplicitExamples2 extends App {
  
  //value mod is not a member of Int
  //1 mod 2
  
  //implicit class MathOps(num:Int)
  case class MathOps(num:Int){
    def mod(base:Int):Int={
      num % base
    }
  }
  
  //value mod is not a member of Int
  //println(5 mod 2)
  implicit def getMathOps(num:Int):MathOps=MathOps(num)
  println(5 mod 2)//Searches for all implicits(class,method,val,etc) to fit the call
  
  //Implicit ordering for class Employee
  
  case class Employee(name:String,id:Int)
  val li=List(2,1,4,3)
  //li.sorted
  
  val empl=List(Employee("A",1),Employee("B",2),Employee("D",4),Employee("C",3))
  //No implicit Ordering defined for sample.scala.app.implicitex.ImplicitExamples2.Employee.
  //empl.sorted
  //implicit def employeeOrdering:Ordering[Employee]=Ordering.--doubtful
  implicit object EmployeeNameOrdering extends Ordering[Employee]{
    def compare(a:Employee,b:Employee)=a.name compare b.name
  }
  println(empl.sorted)
  
}