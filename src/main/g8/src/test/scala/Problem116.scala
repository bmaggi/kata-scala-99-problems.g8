import org.scalatest.{FunSpec, Matchers}

class Problem116 extends FunSpec with Matchers {

  /*
1.16 (**) Drop every N'th element from a list.
Example:
?- drop([a,b,c,d,e,f,g,h,i,k],3,X).
X = [a,b,d,e,g,h,k]
  */
  def dropNthElement[T](list: List[T], number :Int): List[T] = {
    throw new NotImplementedError()
  }

  it(" should drop c and i") {
    val last = dropNthElement(List('a', 'b', 'c', 'd', 'e', 'f', 'h', 'i','k'),3)
    last should be(List('a', 'b', 'd', 'e', 'f', 'h','k'))
  }


}