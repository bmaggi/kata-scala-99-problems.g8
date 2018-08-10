import org.scalatest.{FunSpec, Matchers}

class Problem108 extends FunSpec with Matchers {

  /*
1.08 (**) Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced with a single copy of the element.
 The order of the elements should not be changed.

Example:
?- compress([a,a,a,a,b,c,c,a,a,d,e,e,e,e],X).
X = [a,b,c,a,d,e]

  */
  def compress[T](list: List[T]): List[T] = {
    throw new NotImplementedError()
  }

  it("should compress the list") {
    compress(List('a','a','a','a','b','c','c','a','a','d','e','e','e','e')) should be(List('a', 'b', 'c', 'a', 'd', 'e'))
  }


}