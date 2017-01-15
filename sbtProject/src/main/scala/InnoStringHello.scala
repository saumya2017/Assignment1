import com.innovaccer._
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
}
}
