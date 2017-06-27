// BELOW ARE SOME BASIC SYNTAX FOR SCALA -- Michael J Chan -- THINKFWD


object referenceMatertial{

//Below are some basic Scala Syntax
val phrase: String = "Hello World!"                            // val = immutable declaration, cannot change after declared
println(hello)                                                 // Hello World!

var newPhrase: String = "ThinkFWD"                             // var = mutable declaration, can change after declared
newPhrase = phrase + "ThinkFWD"                                         
println(newPhrase)                                             // Hello World! ThinkFWD

// Basic value types
val numberOne: Int = 1                                         // numberOne = 1              || Whole numbers
val yesOrNo: Boolean = true                                    // yesOrNo = true             || can be true or false 
val letterM: Char = 'M'                                        // letterM = M                || single character
val pi: Double = 3.14159265                                    // pi   = 3.14159265          || 64 Bits
val piSP: Float = 3.14159265f                                  // piSP = 3.1415927           || 32 Bits
val bigNumber: Long = 1234567890l                              // bigNumber = 1234567890     || 64 Bit Int, min = -2^63, max = 2^63-1
val smallNumber: Byte = 127                                    // Byte = 127                 || 6 Bit, min = -127, max = 127
  
// Dealing with Booleans
val isGreater = 1 > 2                                          // isGreater: Boolean = false
val isLesser = 1 < 2                                           // isLesser: Boolean = true
val bothTrue = isGreater & isLesser                            // bothTrue: Boolean = false    || & = checks both parameters for false 
val bothTrueF = isGreater && isLesser                          // bothTrueF: Boolean = false   || && exits if one = false
 
// String Compare
val firstName: String = "John"                                 // firstName: String = John
val secondName: String = "John"                                // secondName: String = John
val compare: Boolean = firstName == secondName                 // compare: Boolean = true
  
// Print Styles

println(f"pi is $pi%.3f")                                      // pi is 3.142
println(f"Zero padding on left $numberOne%05d")                // Zero Padding on left 00001 || 5 variable precision, fill with 0
println(s"sub values $numerOne $letterM $yesOrNo")             // sub values 1 M true
println(s"sub expression ${1+2}")                              // sub expression 3
  
// Regex 
  
val theAnswer: String = "The age of planet Earth, roughly 4 B" 
val pattern = """.* ([\d]+).* """.r                            // pattern : scala.util.matchin.regex = .* ([\d]+).* || search for 1st num
val pattern(newString) = theAnswer                             // newString : String = 4
val newAge = newString.toInt                                   // newAge: Int = 4
println(newAge)                                                // 4

  
// Flow Control
  
//If Statements
if (1 > 3) printLn ("hello World") else println ("Bye World)   // hello World

//For loops
for (x <- 1 to 4) {                                             // "<-" is range operator
  val squared = x*x
  printLn(squared)                                              // 1 ... 4 ... 9 ... 16
}

//While Loops
var x = 10
while (x >= 0) {
  println(x)                                                    //10 ... 9 ... 8 ... 7 ... ect.. 
  x -= 1
}
  
//Expressions
// returns the final value in a block automatically

{val x = 10; x + 20}                                           // result: Int = 30
println({val x = 10; x + 20})                                  // 30


// Fibonacci Number
// BASIC
	 var first: Int = 0
   var second: Int = 1                           
	 for ( x <- 0 to 10){
	   if (x < 1){
	     println(first)
	   } else if (x == 1){
	     println(second)
	   } else {
	     println(first+second)
	     var placeholder = second
	     second = first + second
	     first = placeholder
	   }      

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 























}
