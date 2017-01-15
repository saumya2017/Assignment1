/**
  * Created by saumya on 14/1/17.
  */
import java.io._
class InnoString(val MyStr : String ) {

  //private variable declared as MyString

  private var MyString: String = MyStr

  //function to return string
  override def toString(): String = {
    return (MyString)
  }

  //concatenation functionality
  def concatenate {
    MyString = MyString.concat(MyStr)
  }

  //overloaded + operator for concatenation
  def +(that: InnoString): InnoString =
    new InnoString(this.MyString + that.MyString)

  //overloaded == operator for equivalence
  def ==(that: InnoString, that1: InnoString): Boolean =
    return (that.MyString.equals(that1.MyString))

  //palindrome function
  def isPalindrome(): Boolean = {
    val smallLetters = MyString.toLowerCase.filter(c => c.isLetter)
    (smallLetters == smallLetters.reverse)
  }
}

object InnoString{

def main(args : Array[String])
  {
    var ob = new InnoString("Saumya")
    var ob1 = new InnoString("Malayalam")
    //printing strings
    println(ob)
    println(ob1)
    //concatenation using + operator
    println(ob + ob1)
    //checking for equivalence
    println(ob == ob1)
    //checking palindrome
    println(ob.isPalindrome)
    println(ob1.isPalindrome)
    //concatenation function
    ob1.concatenate
    println(ob1)

  }


}

