import org.scalatest.{FunSpec, Matchers}

class Problem109 extends FunSpec with Matchers {

  /*
1.09 (**) Pack consecutive duplicates of list elements into sublists.
If a list contains repeated elements they should be placed in separate sublists.

Example:
?- pack([a,a,a,a,b,c,c,a,a,d,e,e,e,e],X).
X = [[a,a,a,a],[b],[c,c],[a,a],[d],[e,e,e,e]]
  */
  def pack[T](list: List[T]): List[T] = {
    throw new NotImplementedError()
  }

  it("should pack the list ") {
    val pack = pack(List('a','a','a','a','b','c','c','a','a','d','e','e','e','e'))
    pack should be(List(List('a','a','a','a'),List('b'),List('c','c'),List('a','a'),List('d'),
      List('e','e','e','e')))
  }


}