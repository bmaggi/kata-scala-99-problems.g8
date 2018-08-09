import org.scalatest.{FunSpec, Matchers}

class Problem115 extends FunSpec with Matchers {

  /*
1.15 (**) Duplicate the elements of a list a given number of times.
Example:
?- dupli([a,b,c],3,X).
X = [a,a,a,b,b,b,c,c,c]

  */
  def multiDuplication[T](list: List[T], number: Int): List[T] = {
    throw new NotImplementedError()
  }

  it("should encode by length the list ") {
    val last = multiDuplication(List('a', 'b', 'c'),3)
    last should be(List('a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c'))
  }


}