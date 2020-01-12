package sample.scala.app

trait Trait {
  def area:Double
  def defImplMeth={
    2.2
  }
}
class Polygon{}

//Is it mandatory to extend a class in orer to implement a trait
//class Triangle(base:Double,height:Double) with Trait{
//  def area={
//    0.5*base*height
//  }
class Triangle(base:Double,height:Double) extends Polygon with Trait{
  def area={
    0.5*base*height
  }
  
  //overriding method defImplMeth in trait Trait of type => Double;  method defImplMeth needs `override' modifier
//  def defImplMeth={
//    3.3
//  }
  override def defImplMeth={
    11.11
  }
}