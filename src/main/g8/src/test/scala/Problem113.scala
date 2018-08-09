import org.scalatest.{FunSpec, Matchers}

class Problem113 extends FunSpec with Matchers {

  /*
1.13 (**) Run-length encoding of a list (direct solution).
Implement the so-called run-length encoding data compression method directly.
 I.e. don't explicitly create the sublists containing the duplicates,
 as in problem 1.09, but only count them. As in problem 1.11,
 simplify the result list by replacing the singleton terms [1,X] by X.

Example:
?- encode_direct([a,a,a,a,b,c,c,a,a,d,e,e,e,e],X).
X = [[4,a],b,[2,c],[2,a],d,[4,e]]
  */
  def lengthEncoding[T](list: List[T]): List[(Int, T)] = {
    throw new NotImplementedError()
  }

  it("should encode by length the list ") {
    val last = lengthEncoding(List('a','a','a','a','b','c','c','a','a','d','e','e','e','e'))
    last should be(List((4,'a'), 'b',(2,'c'), 'd', (4,'e')))
  }


}