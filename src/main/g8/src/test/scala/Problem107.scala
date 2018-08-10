import org.scalatest.{FunSpec, Matchers}

class Problem107 extends FunSpec with Matchers {

  /*
 1.07 (**) Flatten a nested list structure.
Transform a list, possibly holding lists as elements into a 'flat'
 list by replacing each list with its elements (recursively).

Example:
?- my_flatten([a, [b, [c, d], e]], X).
X = [a, b, c, d, e]
  */
  def flatten[T](list: List[T]): List[T] = {
    throw new NotImplementedError()
  }

  it("should flatten the example list") {
    flatten(List('a', List('b', List('c', 'd'), 'e'))) should be(List.range('a', 'f'))
  }

}