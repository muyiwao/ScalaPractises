package Inheritance

trait  Shape {
  def color: String;

}


//Scala Abstract Class
abstract class Polygon {

  def area: Double;

}

object  Polygon  {
  def main(args: Array[String]) {
    //var poly = new Polygon;
    var rect = new Rectangle(55.2, 20.0);
    printArea(rect);
    println(rect.color)
    var tri = new Triangle(55.2,20.0);
    printArea(tri)
    println(tri.color)
  }

  def printArea(p: Polygon): Unit ={
    println(p.area);
  }

}
   /*
   Output
   //How To Extend Class - Class Inheritance
   1104.0
   552.0

   Process finished with exit code 0

   //Scala Trait
   1104.0
   green
   552.0
   green

   Process finished with exit code 0

    */