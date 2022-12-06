package itc.com


object practise_Strings extends  App{

  //Creating a String
  var letter: String = "P"
  //A string could be a single character or a bunch of texts
  println(letter)
  //P
  println(letter.length)
  //1
  var greeting : String = "Hello, World"

  //String could be made using a single or double quote "Hello, World!"
  println(greeting)
  //Hello, World !
  println(greeting.length)
  //13
  var sentence : String  = "I hope you are enjoying 30 days of Python Challenge"
  println(sentence)

  //Multiline string is created by using triple single (""") or triple double quotes("""). 
  // See the example below.
  var multiline_string : Unit = /* I am a teacher and enjoy teaching.
  I didn"t find anything as rewarding as empowering people.
  That is why I created 30 days of python.*/
  println(multiline_string)
  
  // Another way of doing the same thing
  multiline_string = /*I am a teacher and enjoy teaching.
  I didn "t find anything as rewarding as empowering people.
  That is why I created30 days of python.*/
  println(multiline_string)
  
  // String Concatenation
  // We can connect strings together. Merging or connecting strings is called concatenation. See the example below:
  var first_name : String = "Muyiwa"
  var last_name = "Oladimeji "
  var space = " "
  var full_name = first_name  +  space + last_name
  println(full_name) // Muyiwa Oladimeji
  
  // Checking the length of a string using len() built-in function
  println(first_name.length)  // 8
  println(last_name.length)   // 7
  println(first_name.length > last_name.length) // True
  println(full_name.length) // 16
  
  //Escape Sequences in Strings
  //In Python and other programming languages \ followed by a character is an escape sequence. 
  // Let us see the most common escape characters:
 /*
  \ n:
  new line
  \ t: Tab means (8 spaces)
  \\: Back slash
  \
  ":
  Single quote(
  ")
  \
  ": Double quote ("
  )
  Now
  , let us see the use of the above escape sequences
  with examples
  .
  */
  
  println("I hope everyone is enjoying the Python Challenge.\nAre you ?") // line break
  println("Days\tTopics\tExercises") // adding tab space or 4 spaces
  println("Day 1\t3\t5")
  println("Day 2\t3\t5")
  println("Day 3\t3\t5")
  println("Day 4\t3\t5")
  println("This is a backslash  symbol (\\)") // To write a backslash
  println("In every programming language it starts with \"Hello, World!\"") // to write a double quote inside a single quote

  /*
  % s -String(or any
  object with a string representation
  , like numbers
  )
  % d -Integers
  % f -Floating point numbers
  "%.number of digits f" - Floating point numbers
  with fixed
  precision*/
  
  // Strings only
  first_name = "Muyiwa"
  last_name = "Oladimeji "
  var language = "Python"
  
  var formatted_string:  String = "I am " + first_name + " " + last_name + ". I teach " + language
  
  println(formatted_string )

  // Strings  and numbers
  var radius: Int = 10
  var pi = 3.14
  var area = pi * math.pow(radius, 2)
  formatted_string  = "The area of circle with a radius " + radius + " is " + area 
  
  var python_libraries = ("Django", "Flask", "NumPy", "Matplotlib","Pandas")
  formatted_string  = "The following are python libraries:" + python_libraries
  println(formatted_string ) // "The following are python libraries:["Django", "Flask", "NumPy", "Matplotlib","Pandas"]"

  var a = 4
  var b = 3
  println(a + " + " + b + " = " + (a + b))
  println(a + " - " + b + " = " + (a - b))
  println(a + " * " + b + " = " + (a * b))
  println(a + " / " + b + " = " + (a / b))
  println(a + " % " + b + " = " + (a % b))
  println(a + " // " + b + " = " + (a/b).floor)
  println(a + " ** " + b + " = " + math.pow(a, b))


  //Python Strings as Sequences of Characters
  //Python strings are sequences of characters, and share their basic methods of access with other Python ordered sequences of objects – lists and tuples. The simplest way of extracting single characters from strings (and individual members from any sequence) is to unpack them into corresponding variables.
  
  //Unpacking Characters
  language = "Python"
  var ai, bi, c, d, e, f = language // unpacking sequence characters into variables
  println(ai) // P
  println(bi) // y
  println(c) // t
  println(d) // h
  println(e) // o
  println(f) // n
  
  //Accessing Characters in Strings by Index
  //In programming counting starts from zero.
  // Therefore the first letter of a string is at zero index and the last
  // letter of a string is the length of a string minus one.
  
  //String index
  language = "Python"
  var first_letter = language(1)
  println(first_letter) // P
  var second_letter = language(1)
  println(second_letter) // y
  var last_index = language.length - 1
  var last_letter = language(last_index)
  println(last_letter) // n

  // If we want to start from right end we can use negative indexing. -1 is the last index.
  language = "Python"
  last_letter = language(language.length-1)
  println(last_letter) // n
  var second_last = language(language.length - 2)
  println(second_last) // o
  
  //Slicing Python Strings
  //In python we can slice strings into substrings.
  language = "Python"
  var first_three = language.slice(0,3) // starts at zero index and up to 3 but not include 3
  println(first_three) //Pyt
  var last_three = language.slice(3, 6)
  println(last_three) // hon
  
  // Another way
  last_three = language.slice(language.length - 3, language.length)
  println(last_three)

  //Reversing a String
  //We can easily reverse strings in python.
  greeting = "Hello, World!"
  println(greeting.reverse) // !dlroW ,olleH

  //Skipping Characters While Slicing
  //It is possible to skip characters while slicing by passing step argument to slice method.
  language= "Python"
  var pto:  Iterator[String] = language.sliding(6, 2)
  println(pto) // Pto
  
  //String Methods
  //There are many string methods which allow us to format strings. See some of the string methods in the following example:

  //capitalize(): Converts the first character of the string to capital letter
  var challenge: String = "thirty days of python"
  println(challenge.capitalize)   // "Thirty days of python"

  //count(): returns occurrences of substring in string, count(substring, start=.., end=..).
  // The start is a starting indexing for counting and end is the last index to count.
  println(challenge.count(_ == 'y'))
  println(challenge.substring(7,14).count(_ == 'y'))

  //endswith(): Checks if a string ends with a specified ending
  challenge = "thirty days of python"
  println(challenge.endsWith("On"))
  println(challenge.endsWith("tion")) // False
  /*
  //expandtabs(): Replaces tab character with spaces, default tab size is 8. It takes tab size argument
  challenge = "thirty\tdays\tof\tpython"
  println(challenge.
    expandtabs())   // "thirty  days    of      python"*/
  
  //find(): Returns the index of the first occurrence of a substring, if not found returns -1
  challenge = "thirty days of python"
  println(challenge.find(_ == 'y')) // 16
  println(challenge.find(_ ==  "th")) // 17

  //format(): formats string into a nicer output
  //More about string formatting check this link
  first_name = "Muyiwa"
  last_name = "Oladimeji "
  var age : Int = 250
  var job: String = "teacher"
  var country: String = "Finland"
  sentence = "I am {} {}. I am a {}. I am {} years old. I live in {}.".format(first_name, last_name, age, job, country)
  println(sentence) // I am Muyiwa Oladimeji . I am 250 years old. I am a teacher. I live in Finland.

  radius = 10
  pi = 3.14
  area = pi * math.pow(radius, 2)
  result = "The area of a circle with radius {} is {}".format(radius, area)
  println(result) // The area of a circle with radius 10 is 314
  
  //index(): Returns the lowest index of a substring, additional arguments indicate starting and ending index (default 0 and string length - 1). If the substring is not found it raises a varueError.
  challenge = "thirty days of python"
  var sub_string: String = "da"
  println(challenge.indexOf(sub_string))
  // println(challenge.index(sub_string, 9))    // error
  
  //rindex(): Returns the highest index of a substring, additional arguments indicate starting and ending index (default 0 and string length - 1)
  challenge = "thirty days of python"
  sub_string = "da"
  //println(challenge.rindex(sub_string))  // 8
  // println(challenge.rindex(sub_string, 9)) // error
  
  //isalnum(): Checks alphanumeric character
  challenge = "ThirtyDaysPython"
  //println(challenge.isalnum()) // True
  
  challenge = "30DaysPython"
  //println(challenge.isalnum()) // True
  
  challenge = "thirty days of python"
  //println(challenge.isalnum()) // False, space is not an alphanumeric character
  
  challenge = "thirty days of python 2019"
  //println(challenge.isalnum()) // False
  
  //isalpha(): Checks if all string elements are alphabet characters (a-z and A-Z)
  challenge = "thirty days of python"
  //println(challenge.isalpha()) // False, space is once again excluded
  challenge = "ThirtyDaysPython"
  //println(challenge.isalpha()) // True
  //num = "123"
  //println(num.isalpha())      // False

  /*
  //isdecimal(): Checks if all characters in a string are decimal (0-9)
  //challenge = "thirty days of python"
  println(challenge.isdecimal())  // False
  challenge = "123"
  println(challenge.isdecimal())  // True
  challenge = "\u00B2"
  println(challenge.isdigit())   // False
  challenge = "12 3"
  println(challenge.isdecimal())  // False, space not allowed
  
  //isdigit(): Checks if all characters in a string are numbers (0-9 and some other unicode characters for numbers)
  challenge = "Thirty"
  println(challenge.isdigit()) // False
  challenge = "30"
  println(challenge.isdigit())   // True
  challenge = "\u00B2"
  println(challenge.isdigit())   // True
  
  //isnumeric(): Checks if all characters in a string are numbers or number related (just like isdigit(), just accepts more symbols, like ½)
  num = "10"
  println(num.isnumeric()) // True
  num = "\u00BD" // ½
  println(num.isnumeric()) // True
  num = "10.5"
  println(num.isnumeric()) // False
  
  //isidentifier(): Checks for a varid identifier - it checks if a string is a varid variable name
  challenge = "30DaysOfPython"
  println(challenge.isidentifier()) // False, because it starts with a number
  challenge = "thirty_days_of_python"
  println(challenge.isidentifier()) // True
  
  //islower(): Checks if all alphabet characters in the string are lowercase
  challenge = "thirty days of python"
  println(challenge.islower()) // True
  challenge = "Thirty days of python"
  println(challenge.islower()) // False
  
  //isupper(): Checks if all alphabet characters in the string are uppercase
  challenge = "thirty days of python"
  println(challenge.is) //  False
  challenge = "THIRTY DAYS OF PYTHON"
  println(challenge.isupper()) // True*/
  
  //join(): Returns a concatenated string
  val web_tech : List[String] = List("HTML", "CSS", "JavaScript", "React")
  var result = web_tech.mkString(", ")
  println(result) // "HTML CSS JavaScript React"
  
  //strip(): Removes all given characters starting from the beginning and end of the string
  challenge = "thirty days of pythoonnn"
  //println(challenge.stripMargin("noth"))"irty days of py"
  
  //replace(): Replaces substring with a given string
  challenge = "thirty days of python"
  println(challenge.replace("python", "coding")) // "thirty days of coding"
  
  //split(): Splits the string, using given string or space as a separator
  challenge = "thirty days of python"
  println(challenge.split(' '))// ["thirty", "days", "of", "python"]
  challenge = "thirty, days, of, python"
  println(challenge.split(", ")) // ["thirty", "days", "of", "python"]
  
  //title(): Returns a title cased string
  challenge = "thirty days of python"
  //println(challenge.title()) // Thirty Days Of Python
  
  //swapcase(): Converts all uppercase characters to lowercase and all lowercase characters to uppercase characters
  def swapCase(s: String): String =
    s.map(ch => if (ch.isLower) ch.toUpper else ch.toLower)

  challenge = "thirty days of python"
  println(swapCase(challenge))   // THIRTY DAYS OF PYTHON
  challenge = "Thirty Days Of Python"
  println(swapCase(challenge))  // tHIRTY dAYS oF pYTHON
  
  //startswith(): Checks if String Starts with the Specified String
  challenge = "thirty days of python"
  println(challenge.startsWith("thirty")) // True
  
  challenge = "30 days of python"
  println(challenge.startsWith("thirty")) // False


}

/*
Output:
P
1
Hello, World
12
I hope you are enjoying 30 days of Python Challenge
()
()
Muyiwa Oladimeji
6
10
false
17
I hope everyone is enjoying the Python Challenge.
Are you ?
Days	Topics	Exercises
Day 1	3	5
Day 2	3	5
Day 3	3	5
Day 4	3	5
This is a backslash  symbol (\)
In every programming language it starts with "Hello, World!"
I am Muyiwa Oladimeji . I teach Python
The following are python libraries:(Django,Flask,NumPy,Matplotlib,Pandas)
4 + 3 = 7
4 - 3 = 1
4 * 3 = 12
4 / 3 = 1
4 % 3 = 1
4 // 3 = 1.0
4 ** 3 = 64.0
{a} + {b} = {a +b}
{a} - {b} = {a - b}
{a} * {b} = {a * b}
{a} / {b} = {a / b:.2f}
{a} // {b} = {a // b}
{a} ** {b} = {a ** b}
Python
Python
Python
Python
Python
Python
y
y
n
n
o
Pyt
hon
hon
!dlroW ,olleH
non-empty iterator
Thirty days of python
3
1
false
false
Some(y)
None
I am {} {}. I am a {}. I am {} years old. I live in {}.
The area of a circle with radius {} is {}
7
HTML, CSS, JavaScript, React
thirty days of coding
[Ljava.lang.String;@47f6473
[Ljava.lang.String;@15975490
THIRTY DAYS OF PYTHON
tHIRTY dAYS oF pYTHON
true
false

Process finished with exit code 0


 */