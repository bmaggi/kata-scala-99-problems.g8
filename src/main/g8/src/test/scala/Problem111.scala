import org.scalatest.{FunSpec, Matchers}

class Problem111 extends FunSpec with Matchers {

  /*

1.11 (*) Modified run-length encoding.
Modify the result of problem 1.10 in such a way that if an element
 has no duplicates it is simply copied into the result list.
  Only elements with duplicates are transferred as [N,E] terms.

Example:
?- encode_modified([a,a,a,a,b,c,c,a,a,d,e,e,e,e],X).
X = [[4,a],b,[2,c],[2,a],d,[4,e]]
  */
  def lengthEncoding2[T](list: List[T]): List[(Int, T)] = {
    throw new NotImplementedError()
  }

  it("should encode by length the list ") {
    val last = lengthEncoding2(List('a','a','a','a','b','c','c','a','a','d','e','e','e','e'))
    last should be(List((4,'a'), 'b',(2,'c'), 'd', (4,'e')))
  }


}