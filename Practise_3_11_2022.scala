package itc.com
import Array._

object Practise_3_11_2022 {


  def main(args: Array[String]): Unit = {

    //Strings
    val num1 = 75;
    val num2 = 100.25;
    val str1: String = "Hello World";
    val str2 : String = " Max";
    println(str1.length());
    println(str1.concat(str2));
    println(str1 + str2);

    val result = printf("(%d -- %f -- %s)",num1, num2, str1);
    println(result);
    println("(%d -- %f -- %s)".format(num1, num2, str1));
    printf("(%d -- %f -- %s)",num1, num2, str1);

    //Arrays
    val myarray: Array[Int] = new Array[Int](4);
    val myarray2 = new Array[Boolean](5);
    val myarray3 = Array(1,2,3,4,5,6,8)

    myarray(0) = 20;
    myarray(1) = 50;
    myarray(2) = 10;
    myarray(3) = 30;
    println(myarray3.length);
    for (x <- myarray2) {
      println(x);
    }

    for (i <- 0 to (myarray.length - 1)) {
      println(myarray(i));
    }

    //List
    val myList: List[Int] = List(1,2,5,8,9,6,4);
    val names: List[String] = List("Max", "Tom", "John");

    println(0 :: myList);
    println(myList);
    println(names);
    println(1 :: 5 :: 9 :: Nil);
    println(myList.head);
    println(names.tail);
    println(names.isEmpty);
    println(myList.reverse);
    println(List.fill(5)(2));

    println(myList.max);
    myList.foreach(println)
    var sum : Int = 0;
    myList.foreach(sum += _);
    println(sum);

    for (name <- names) {
      println(name);
    }

    println(names(0));

    //Sets
    var myset: Set[Int] = Set(1,2,3,6,8,6,4,4,5,8);
    val myset2: Set[Int] = Set(4,2,9,18,19,16,14);
    val names1: Set[String] = Set("Max", "Tom", "John");

    println(myset + 10);
    println(myset(8));
    println(names1("Maxxxx"));
    println(myset.head);
    println(myset.tail);
    println(myset.isEmpty);

    println(myset ++ myset2);
    println(myset.++(myset2));

    println(myset.&(myset2));
    println(myset.intersect(myset2));
    println(myset.max);

    println(myset.min);
    myset.foreach(println);

    for (name <- names) {
      println(name);
    }

  // Scala - Maps
    val mymap : Map[Int, String] =
    Map(801 -> "max", 802 -> "Tom", 804 -> "July");

    val mymap2: Map[Int, String] = Map(805 -> "lua")

    println(mymap);
    println(mymap(802));
    println(mymap.keys);
    println(mymap.values);
    println(mymap.isEmpty);

    mymap.keys.foreach { key =>
      println("key " + key);
      println("Value " + mymap(key));
    }

    println(mymap.contains(801000));
    println(mymap ++ mymap2);
    println(mymap.size);

  // Scala = Tuples
    val mytuple = (1, 2, "hello", true);
    val mytuple2 = new Tuple3(1, 2, "hello");
    val mytuple3 = new Tuple3(1, "hello", (2,3));
    println(mytuple._1);
    println(mytuple._2);
    println(mytuple._3);
    println(mytuple._4);

    mytuple.productIterator.foreach{
      i => println(i);
    }

    println(1 -> "Tom" -> true);
    println(mytuple3._3._2);


  }



}

/*
11
Hello World Max
Hello World Max
(75 -- 100.250000 -- Hello World)()
(75 -- 100.250000 -- Hello World)
(75 -- 100.250000 -- Hello World)7
false
false
false
false
false
20
50
10
30
List(0, 1, 2, 5, 8, 9, 6, 4)
List(1, 2, 5, 8, 9, 6, 4)
List(Max, Tom, John)
List(1, 5, 9)
1
List(Tom, John)
false
List(4, 6, 9, 8, 5, 2, 1)
List(2, 2, 2, 2, 2)
9
1
2
5
8
9
6
4
35
Max
Tom
John
Max
Set(5, 10, 1, 6, 2, 3, 8, 4)
true
false
5
Set(1, 6, 2, 3, 8, 4)
false
Set(5, 14, 1, 6, 9, 2, 3, 18, 16, 8, 19, 4)
Set(5, 14, 1, 6, 9, 2, 3, 18, 16, 8, 19, 4)
Set(2, 4)
Set(2, 4)
8
1
5
1
6
2
3
8
4
Max
Tom
John
Map(801 -> max, 802 -> Tom, 804 -> July)
Tom
Set(801, 802, 804)
MapLike(max, Tom, July)
false
key 801
Value max
key 802
Value Tom
key 804
Value July
false
Map(801 -> max, 802 -> Tom, 804 -> July, 805 -> lua)
3
1
2
hello
true
1
2
hello
true
((1,Tom),true)
3

Process finished with exit code 0

 */