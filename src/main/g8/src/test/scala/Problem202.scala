import org.scalatest.{FunSpec, Matchers}

class Problem202 extends FunSpec with Matchers {

  /*
2.02 (**) Determine the prime factors of a given positive integer.
Construct a flat list containing the prime factors in ascending order.
Example:
?- prime_factors(315, L).
L = [3,3,5,7]
  */
  def primeDecomposition(number: Int): List[Int] = {
    throw new NotImplementedError()
  }

  it("should determine [3,3,5,7] for 315 decomposition") {
    primeDecomposition(315) should be (List(3,3,5,7))
  }

}