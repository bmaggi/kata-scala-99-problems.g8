import org.scalatest.{FunSpec, Matchers}

class Problem203 extends FunSpec with Matchers {

  /*
2.03 (**) Determine the prime factors of a given positive integer (2).
Construct a list containing the prime factors and their multiplicity.
Example:
?- prime_factors_mult(315, L).
L = [[3,2],[5,1],[7,1]]

Hint: The solution of problem 1.10 may be helpful.
  */
  def primeFactors(number: Int): List[(Int,Int)] = {
    throw new NotImplementedError()
  }

  it("should determine [3,3,5,7] for 315 decomposition") {
    primeFactors(315) should be (List((3,2),(5,1),(7,1)))
  }

}