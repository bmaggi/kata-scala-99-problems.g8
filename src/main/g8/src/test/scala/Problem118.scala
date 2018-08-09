import org.scalatest.{FunSpec, Matchers}

class Problem118 extends FunSpec with Matchers {

  /*
1.18 (**) Extract a slice from a list.
Given two indices, I and K, the slice is the
list containing the elements between the I'th and K'th element
of the original list (both limits included).
Start counting the elements with 1.

Example:
?- slice([a,b,c,d,e,f,g,h,i,k],3,7,L).
 L = [c,d,e,f,g]
  */
  def extract[T](list: List[T],start:Int, end: Int): List[T] = {
    throw new NotImplementedError()
  }

  it("should extract the corect slice ") {
    val extraction = extract(List.range('a', 'l'),3,7)
    extraction should be(List.range('c','h'))
  }


}