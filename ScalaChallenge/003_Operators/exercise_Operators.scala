package  itc.com

object exercise_Operators {

  def main(args: Array[String]): Unit = {


    //1 Declare your age as integer variable
    val age : Int = 7

    //2 Declare your height as a float variable
    var height: Double = 6.1

    //3 Declare a variable that store a complex number
    // not available on scala

    //4 Write a script that prompts the user to enter base and height of the triangle and calculate an area of this triangle (area = 0.5 x b x h).
    val base = scala.io.StdIn.readLine("Enter base: ").toInt
    val height1 = scala.io.StdIn.readLine("Enter height: ").toInt
    val area_triangle = 0.5 * base * height1
    println("The area of the triangle is: " +  (area_triangle))

    //5 Write a script that prompts the user to enter side a, side b, and side c of the triangle. Calculate the perimeter of the triangle (perimeter = a + b + c).
    val side_a = scala.io.StdIn.readLine("Enter side a:").toInt
    val side_b = scala.io.StdIn.readLine("Enter side b:").toInt
    val side_c = scala.io.StdIn.readLine("Enter side c:").toInt
    val perimeter_triangle = side_a + side_b + side_c
    println("The perimeter of the triangle is " + (perimeter_triangle))

    //6 Get length and width of a rectangle using prompt. Calculate its area(area = length x width) and perimeter(perimeter = 2 x (length + width))
    val length = scala.io.StdIn.readLine("Enter the length:").toInt
    val width = scala.io.StdIn.readLine("Enter width:").toInt
    val area_rectangle = length * width
    val perimeter_rectangle = 2 * (length + width)
    println("The perimeter of the rectangle is " + (perimeter_rectangle))
    println("The area of the rectangle is " + (area_rectangle))

    //7 Get radius of a circle using prompt. Calculate the area(area = pi x r x r) and circumference(c = 2 x pi x r) where pi = 3.14.
    val radius = scala.io.StdIn.readLine("Enter the radius of the circle:").toInt
    val pi = 3.142
    val area_circle = pi * radius * radius
    println("The area of the circle is " + (area_circle))

    //8 Calculate the slope, x - intercept and y - intercept of y = 2 x -2
    val x_zero = 0;
    var y_intercept = 2 * x_zero - 2;

    val y_zero = 0;
    var x_intercept = (y_zero + 2) / 2

    val slope = (x_zero - y_intercept) / (x_intercept - y_zero)
    print("The slope is ", slope)
    print("The x-intercept is ", x_intercept)
    print("The y-intercept is ", y_intercept)

    //9 Slope is(m = y2 - y1 / x2 - x1).Find the slope and Euclidean distance between point(2, 2) and point(6, 10)
    val y2 = 2
    val y1 = 2
    val x2 = 6
    val x1 = 10
    val m2 = (y2 - y1) / (x2 - x1)
    val d = math.sqrt((math.pow((x2 - x1), 2)) + (math.pow((x2 - x1), 2)))

    println("The slope is " + m2)
    println("The euclidean distance is " + d)

    // #10. Compare the slopes in tasks 8 and 9.
    if (slope > m2){println("slope in task 8 is greater than slope in task 9")}
    else{println("slope in task 8 is less than slope in task 9");}

    //11 Calculate the value of y (y = x ^ 2 + 6 x +9).Try to use different x values and figure out at what x value y is going to be 0

    var proceed : Boolean = true
    while (proceed){
      val x = scala.io.StdIn.readLine("Enter the value of x").toInt
      val y = math.pow(x, 2) + (6 * x) + 9
      if(y==0){
        println("y is zero when x is ", x)
        proceed=false
      }
      println("The value of y: " + y)
    }

    //12 Find the length of 'python' and 'dragon 'and make a falsy comparison statement .
    var python = "python"
    var dragon = "dragon"
    println(python.length > dragon.length)

    //13 Use and operator to check
    // Not available in scala

    //14 I hope this course is not full of jargon.Use in operator to check if jargon is in the sentence.
    // Not available in scala

    //15 There is no 'on' in both dragon and python
    // Not available in scala

    //16 Find the length of the text python and convert the value to float and convert it to string
    var word_len = python.length
    var f_word_len = word_len.toFloat
    var s_word_len = f_word_len.toString

    //17 Even numbers are divisible by 2 and the remainder is zero .How  do you check  if a number is even or not using python ?
    //using %
    val rem = 7 % 2

    //18 Check if the floor division of 7 by 3 is equal to the int converted value of  2.7.
    val f_div = (7 / 3).floor
    val num = 2.7
    println((num.toInt) == f_div)

    //19 Check if type of '10'is equal to type of 10
    println(("10").getClass == (10).getClass)

    //20 Check if int('9.8') is equal to 10
    val z = (9.8).toInt
    println((z) == 10)

    //21 Write a script that prompts the user to enter hours and rate per hour.Calculate pay of the person ?
    val hours = scala.io.StdIn.readLine("Enter hours: ").toInt
    val rate = scala.io.StdIn.readLine("Enter rate per hours: ").toInt

    println("Your weekly earning is: " + (hours * rate))

    //22 Write a script that prompts the user to enter number of years.Calculate the number of seconds a person can live.Assume a person can live hundred years
    val years = scala.io.StdIn.readLine("Enter number of years you have lived: ").toInt
    println("You have : " + (years * 365 * 24 * 60 * 60))

    //23 Write a Python script that displays the following table
    println(1, 1, 1, 1, 1)
    println(2, 1, 2, 4, 8)
    println(3, 1, 3, 9, 27)
    println(4, 1, 4, 16, 64)
    println(5, 1, 5, 25, 125)
  }

  /*
  Output:
  Enter base: 20
  Enter height: 10
  The area of the triangle is: 100.0
  Enter side a:5
  Enter side b:4
  Enter side c:3
  The perimeter of the triangle is 12
  Enter the length:10
  Enter width:15
  The perimeter of the rectangle is 50
  The area of the rectangle is 150
  Enter the radius of the circle:5
  The area of the circle is 78.55
  (The slope is ,2)(The x-intercept is ,1)(The y-intercept is ,-2)The slope is 0
  The euclidean distance is 5.656854249492381
  slope in task 8 is greater than slope in task 9
  Enter the value of x3
  The value of y: 36.0
  Enter the value of x1
  The value of y: 16.0
  Enter the value of x-3
  (y is zero when x is ,-3)
  The value of y: 0.0
  false
  true
  false
  false
  Enter hours: 8
  Enter rate per hours: 100
  Your weekly earning is: 800
  Enter number of years you have lived: 100
  You have : 3153600000
  (1,1,1,1,1)
  (2,1,2,4,8)
  (3,1,3,9,27)
  (4,1,4,16,64)
  (5,1,5,25,125)

  Process finished with exit code 0

   */

  }
