import org.scalatest.{FunSpec, Matchers}

class Problem110 extends FunSpec with Matchers {

  /*
1.10 (*) Run-length encoding of a list.
Use the result of problem 1.09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as terms [N,E] where N is the number of duplicates of the element E.

Example:
?- encode([a,a,a,a,b,c,c,a,a,d,e,e,e,e],X).
X = [[4,a],[1,b],[2,c],[2,a],[1,d],[4,e]]
  */
  def lengthEncoding[T](list: List[T]): List[(Int, T)] = {
    throw new NotImplementedError()
  }

  it("should encode by lenght the list ") {
    val last = lengthEncoding(List('a','a','a','a','b','c','c','a','a','d','e','e','e','e'))
    last should be(List('a', 'b', 'c', 'd', 'e'))
  }


}