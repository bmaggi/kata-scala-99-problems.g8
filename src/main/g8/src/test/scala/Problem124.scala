import org.scalatest.{FunSpec, Matchers}

class Problem124 extends FunSpec with Matchers {

  /*
1.24 (*) Lotto: Draw N different random numbers from the set 1..M.
The selected numbers shall be put into a result list.
Example:
?- lotto(6,49,L).
L = [23,1,17,33,21,37]

Hint: Combine the solutions of problems 1.22 and 1.23.
  */
  def lotto[T](number:Int, max:Int): List[Int] = {
    throw new NotImplementedError()
  }

  it("should encode by lenght the list ") {
    val last = lotto(6,49)
   // last should be(List('a', 'b', 'c', 'd', 'e'))
    // TODO: How to test random selection? (size + containment)
  }


}