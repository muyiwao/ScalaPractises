package ScalaChallenge.I_Introduction

object helloworld {
  def main(args: Array[String]): Unit = {


    println(4 + 5);
    println(4 + 5);  // addition(+)
    println(5 - 2);   // subtraction(-)
    println(5 * 6);   // multiplication(*)
    println(5 / 4);   // division(/)
    println(math.pow(5,4)); //5 ** 4);  // exponential(**)
    println(5 % 4);   // modulus(%)
    println((5/4).floor);  // Floor division operator(//)

    println("\n");

    // #Checking data types

    println(20.getClass);                                   // Int
    println(3.14.getClass);                                 // Float
    //print(1 + 3j.getClass);                               //Complex
    println("Muyiwa".getClass);                             // String
    println(x = classOf[List[Int]].isInstance(List[Int](4, 5, 6))); // List

  }
}

  /* Output
    9
  9
  3
  30
  1
  625.0
  1
  1.0


  int
  double
  class java.lang.String
  true

  Process finished with exit code 0


   */