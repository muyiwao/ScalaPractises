package itc.com

object Practise_1_11_2022 {
  def main(args: Array[String]): Unit = {

    // Tutorial Practise - 1/11/2022
    val name = "muyiwa"
    val age = 18.5
    println(s"$name is $age years old")
    println(f"$name%s is $age%f years old")
    println(s"Hello \nworld")
    println(raw"Hello \nworld")
    //comment
    /*code comment is the same
  as mql4 code
   */
    val y = 20;
    var res = "";

    if (y == 20) {
      res = "y == 20";
    } else {
      res = "y !=20";
    }
    println(res);

    val res2 = if (y != 20) "y == 20" else "y != 20"
    println(res2)

    var z = 0;
    /*
    while(z<10){
      println("z = " + z);
      z += 1;
    }
    */
    do {
      println("z = " + z);
      z += 1;
    } while (z < 10)

    for (i <- 1.to(5)) {
      println("i using to " + i);
    }

    for (i <- 1 until (6)) {
      println("i using until " + i);
    }

    for (i <- 1 to 9; j <- 1 to 3) {
      println("i using until " + i + " " + j);
    }

    val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    for (i <- lst) {
      println("i using lst " + i)
    }

    for (i <- lst; if i < 6) {
      println("i using Filters " + i)
    }

    val result = for {i <- lst; if i < 6} yield {
      i * 1;
    }
    println(result)

    /* Output
    muyiwa is 18.5 years old
    muyiwa is 18.500000 years old
    Hello
    world
    Hello \nworld
    y == 20
    y != 20
    z = 0
    z = 1
    z = 2
    z = 3
    z = 4
    z = 5
    z = 6
    z = 7
    z = 8
    z = 9
    i using to 1
    i using to 2
    i using to 3
    i using to 4
    i using to 5
    i using until 1
    i using until 2
    i using until 3
    i using until 4
    i using until 5
    i using until 1 1
    i using until 1 2
    i using until 1 3
    i using until 2 1
    i using until 2 2
    i using until 2 3
    i using until 3 1
    i using until 3 2
    i using until 3 3
    i using until 4 1
    i using until 4 2
    i using until 4 3
    i using until 5 1
    i using until 5 2
    i using until 5 3
    i using until 6 1
    i using until 6 2
    i using until 6 3
    i using until 7 1
    i using until 7 2
    i using until 7 3
    i using until 8 1
    i using until 8 2
    i using until 8 3
    i using until 9 1
    i using until 9 2
    i using until 9 3
    i using lst 1
    i using lst 2
    i using lst 3
    i using lst 4
    i using lst 5
    i using lst 6
    i using lst 7
    i using lst 8
    i using lst 9
    i using Filters 1
    i using Filters 2
    i using Filters 3
    i using Filters 4
    i using Filters 5
    List(1, 2, 3, 4, 5)
     */

  }
}
