import org.scalatest.{FunSpec, Matchers}

class Problem125 extends FunSpec with Matchers {

  /*
1.25 (*) Generate a random permutation of the elements of a list.
Example:
?- rnd_permu([a,b,c,d,e,f],L).
L = [b,a,d,c,e,f]

Hint: Use the solution of problem 1.23.
  */
  def randomPermutation[T](list: List[T]): List[T] = {
    throw new NotImplementedError()
  }

  it("should encode by lenght the list ") {
    val last = randomPermutation(List.range('a','l'))
    last should be(List('a', 'b', 'c', 'd', 'e'))
    // TODO: How to test random ? (size + containment)
  }


}