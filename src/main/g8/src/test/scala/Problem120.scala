import org.scalatest.{FunSpec, Matchers}

class Problem120 extends FunSpec with Matchers {

  /*
1.20 (*) Remove the K'th element from a list.
Example:
?- remove_at(X,[a,b,c,d],2,R).
X = b
R = [a,c,d]
  */
  def removeKthElement[T](list: List[T],k : Int): List[T] = {
    throw new NotImplementedError()
  }

  it("should encode by lenght the list ") {
    val last = removeKthElement(List.range('a','e'),2)
    last should be(List('a', 'c', 'e'))
  }


}