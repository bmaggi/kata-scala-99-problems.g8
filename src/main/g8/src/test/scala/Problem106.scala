import org.scalatest.{FunSpec, Matchers}

class Problem106 extends FunSpec with Matchers {

  /*
    1.06 (*) Find out whether a list is a palindrome.
      A palindrome can be read forward or backward; e.g. [x,a,m,a,x].
  */
  def isPalindrome[T](list: List[T]): Boolean= {
    throw new NotImplementedError()
  }

  it("should consider xamax as a palindrome") {
    val last = isPalindrome(List('x', 'a', 'm', 'a', 'x'))
    last should be(true)
  }

  it("should'nt consider hello as a palindrome") {
    val last = isPalindrome(List('h', 'e', 'l', 'l', 'o'))
    last should be(false)
  }

  it("should consider one element list as palindrome") {
    val last = isPalindrome(List("a"))
    last should be(true)
  }
}