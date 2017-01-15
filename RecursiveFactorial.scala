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


// The following class gives the definition for computing factorial Recursively


class ComputeFact() {
  def fact(number: Int): BigInt=
  //number is the input given by user
  {
    if(number == 0)
      return(1)
    else
      return number * fact(number - 1)
  }
}


object RecursiveFactorial {
  def main(args: Array[String]) {
    var e = new ExceptionRange()

    //e is the object of Exception Class

    val ob = new ComputeFact()

    //ob is object of Fact class

    //println("Enter the required number")
    //val num = scala.io.StdIn.readLine().toInt

    try {
      e.validate(args(0).toInt) //args(0) pics the input passed from console
      val factorial = ob.fact(args(0).toInt)
      println(s"Factorial = $factorial")
    }

    //This catch block handles the situation when no input is passed through console
    catch {
      case ex: ArrayIndexOutOfBoundsException => {
        println("No Argument Passed")
        System.exit(1)
      }

    }
  }
}
