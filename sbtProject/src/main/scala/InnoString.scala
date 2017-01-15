/**
  * Created by saumya on 14/1/17.
  */


package com.innovaccer

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


