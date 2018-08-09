import org.scalatest.{FunSpec, Matchers}

class Problem123 extends FunSpec with Matchers {

  /*
1.23 (**) Extract a given number of randomly selected elements from a list.
The selected items shall be put into a result list.
Example:
?- rnd_select([a,b,c,d,e,f,g,h],3,L).
L = [e,d,a]

Hint: Use the built-in random number generator random/2
and the result of problem 1.20.
  */
  def randomExtraction[T](list: List[T], number:Int): List[T] = {
    throw new NotImplementedError()
  }

  it("should encode by lenght the list ") {
    val extraction = randomExtraction(List.range('a','l'),3)
    extraction should be(List('e','d','a'))
    // TODO: How to test random selection? (size + containment)
  }


}