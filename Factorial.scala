import java.io._

/*
The following class is for implementing a Custom Exception.
 It raises and handles the condition when the input is outside the given range of 1-100
*/


class FactorialInputOutOfRangeException(s:String) extends Exception(s){}
class ExceptionRange
{
  @throws(classOf[FactorialInputOutOfRangeException])
  def validate(num:Int)
  {
    if(num < 1 || num > 100)
    {
      throw new FactorialInputOutOfRangeException("Number must be in range 1-100")
    }
  }
}


// The following class gives the definition for computing factorial


class ComputeFact() {
  def fact(number: Int)
  //number is the input given by user
  {

    var fact : BigInt = 1

    //fact stores factorial
    //It is of BigInt, so as to store large integers

    for(i <- 1 to number)
      fact *= i
    println(s"Factorial=$fact")    //This is the format for String Interpolation
  }
}


object Factorial
{
  def main(args: Array[String])
  {
    var e = new ExceptionRange()

    //e is the object of Exception Class

    val ob = new ComputeFact()

    //ob is object of Fact class

    //println("Enter the required number")
    //val num = scala.io.StdIn.readLine().toInt

    try {
      e.validate(args(0).toInt)     //args(0) pics the input passed from console
      ob.fact(args(0).toInt)
    }

      //This catch block handles the situation when no input is passed through console
    catch
      {
      case ex: ArrayIndexOutOfBoundsException => {
        println("No Argument Passed")
        System.exit(1)
      }

     }
  }
}
