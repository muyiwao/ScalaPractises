package Inheritance

// How To Extend Class - Class Inheritance
class Triangle(var width: Double, var height: Double)
  extends Polygon with Shape{
    override def area : Double = width * height/2;
    def color : String = "green";
  }
