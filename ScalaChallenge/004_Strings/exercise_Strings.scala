

object exercise_Strings extends App {

  //1. Concatenate the string "Thirty", "Days", "Of", "Python" to a single string, "Thirty Days Of Python".
  val space: String = " "
  var concatenated_string : String  = "Thirty" + space + "Days" + space + "Of" + space + "Python"
  println(concatenated_string)

 //2. Concatenate the string "Coding", "For" , "All" to a single string, "Coding For All".
  concatenated_string  = "Coding" + space + "For" + space + "All"
  println(concatenated_string)

  //3. Declare a variable named company and assign it to an initial value "Coding For All".
  var company: String = "Coding For All"

  //4. println the variable company using println().
  println(company)

  //5. println the length of the company string using len() method and println().
  println(company.length)

  //6. Change all the characters to uppercase letters using upper() method.
  println(company.toUpperCase)

  //7. Change all the characters to lowercase letters using lower() method.
   println(company.toLowerCase)

  //8. Use capitalize(), title(), swapcase() methods to format the value of the string Coding For All.
  println(company.toUpperCase)

  def title(s: String): String =
    company.substring(0,1).toUpperCase() + company.substring(1,company.length)
  println(title(company))

  def swapCase(s: String): String =
    s.map(ch => if (ch.isLower) ch.toUpper else ch.toLower)

  println(swapCase(company))

  //7. Cut(slice) out the first word of Coding For All string.
  println("Coding For All".substring(0,6))

  //8. Check if Coding For All string contains a word Coding using the method index, find or other methods.
  println("Coding For All".contains("Coding"))

  //9. Replace the word coding in the string "Coding For All" to Python.
  println("Coding For All".replace("Coding", "Python"))

  //10. Change Python for Everyone to Python for All using the replace method or other methods.
  println("Python for Everyone".replace("Everyone", "All"))

  //11. Split the string "Coding For All" using space as the separator (split()) .
  println("Coding For All".split(" "))

  //12. "Facebook, Google, Microsoft, Apple, IBM, Oracle, Amazon" split the string at the comma.
  println("Facebook, Google, Microsoft, Apple, IBM, Oracle, Amazon".split(", "))

  //13. What is the character at index 0 in the string Coding For All.
  println("Coding For All".substring(0, 1))

  //14. What is the last index of the string Coding For All.
  println("Coding For All".substring("Coding For All".length))

  ////15. What character is at index 10 in "Coding For All" string.
  println("Coding For All".substring(10, 1))

  ////16. Create an acronym or an abbreviation for the name "Python For Everyone".
  println("Python For Everyone".split(" ").flatMap(_.headOption).mkString)

  ////17. Create an acronym or an abbreviation for the name "Coding For All".
  println("Coding For All".split(" ").flatMap(_.headOption).mkString)

  ////18. Use index to determine the position of the first occurrence of C in Coding For All.
  println("Coding For All".indexOf("C"))

 // //19. Use index to determine the position of the first occurrence of C in Coding For All.
  println("Coding For All".indexOf("C"))

  ////20. Use index to determine the position of the first occurrence of F in Coding For All.
  println("Coding For All".indexOf("F"))

  ////21. Use rfind to determine the position of the last occurrence of l in Coding For All People.
  println("Coding For All People".lastIndexOf("l"))

  ////22. Use index or find to find the position of the first occurrence of the word "because"
  //   in the following sentence: "You cannot end a sentence with because because because is a conjunction"
  println("You cannot end a sentence with because because because is a conjunction".indexOf("because"))

  ////23. Use rindex to find the position of the last occurrence of the word because
  ////   in the following sentence: "You cannot end a sentence with because because because is a conjunction"
  println("You cannot end a sentence with because because because is a conjunction".lastIndexOf("because"))

  //24. Slice out the phrase "because because because" in the following sentence:
  //   "You cannot end a sentence with because because because is a conjunction"
  println("You cannot end a sentence with because because because is a conjunction".split("because"))


  ////25. Find the position of the first occurrence of the word "because" in the following sentence:
  ////   "You cannot end a sentence with because because because is a conjunction"
  println("You cannot end a sentence with because because because is a conjunction".indexOf("because"))

  ////26. Slice out the phrase "because because because" in the following sentence:
  ////   "You cannot end a sentence with because because because is a conjunction"
  println("You cannot end a sentence with because because because is a conjunction".split("because"))
  
  ////27. Does ""Coding For All" start with a substring Coding?
  println("Coding For All".startsWith("Coding"))

  ////28. Does "Coding For All" end with a substring coding?
  println("Coding For All".endsWith("Coding"))

  ////29. "   Coding For All      "  , remove the left and right trailing spaces in the given string.
  println("   Coding For All      ".replace("   ",""))

  //30. Which one of the following variables return True when we use the method isidentifier():
  //   30DaysOfPython
  //   thirty_days_of_python
  //println([word for word in ["30DaysOfPython", "thirty_days_of_python"] if word.isidentifier() == True][0])

  //31. The following list contains the names of some of python libraries:
  //   ["Django", "Flask", "Bottle", "Pyramid", "Falcon"]. Join the list with a hash with space string.
  println(List("Django", "Flask", "Bottle", "Pyramid", "Falcon").mkString("#") )

  //32. Use the new line escape sequence to separate the following sentences.
  //   I am enjoying this challenge.
  //   I just wonder what is next.
  println("I am enjoying this challenge.\nI just wonder what is next.")

  //33. Use a tab escape sequence to write the following lines.
  //   Name      Age     Country   City
  //   Muyiwa  250     UK   London
  println("IName\tAge\tCountry\tCity\nMuyiwa\t250\tUK\tLondon")

  //34. Use the string formatting method to display the following:
  //   radius = 10
  //   area = 3.14 * radius ** 2
  //   The area of a circle with radius 10 is 314 meters square.
  var radius :  Double = 10
  var area : Double = 3.14 * math.pow(radius, 2)
  println("The area of a circle with radius" + radius + "is " + area + "meters square")

  //7. Make the following using string formatting methods:
  var a : Int = 8
  var b :Int = 6

  println(a + " + " + b + " = " + (a + b))
  println(a + " - " + b + " = " + (a - b))
  println(a + " * " + b + " = " + (a * b))
  println(a + " / " + b + " = " + (a / b))
  println(a + " % " + b + " = " + (a % b))
  println(a + " // " + b + " = " + (a / b).floor)
  println(a + " ** " + b + " = " + math.pow(a, b))
}
